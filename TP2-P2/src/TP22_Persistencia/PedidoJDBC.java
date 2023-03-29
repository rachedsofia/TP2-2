package TP22_Persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Properties;

public class PedidoJDBC {
	
	public void create(LocalDate fecha, int monto) {
		Properties prop = ConnectionManager.getProperties();
	try (Connection conn = DriverManager.getConnection(prop.getProperty("connection"), prop.getProperty("username"),
			prop.getProperty("password"));
			PreparedStatement statement = conn.prepareStatement("INSERT INTO restopago(fecha, monto) " + " VALUES (?, ?,?)",
			Statement.RETURN_GENERATED_KEYS)) {

		Date date = Date.valueOf(fecha);

		statement.setDate(1, date);
		statement.setInt(2, monto);

		int pruebaAnda = statement.executeUpdate();

		if (pruebaAnda > 0) {
			ResultSet rs = statement.getGeneratedKeys();
			rs.next();
			System.out.println("Se agrego " + pruebaAnda + " registros");

		} else {
			System.out.println("Error al actualizar");
		}

	} catch (SQLException e) {
		System.out.println("Error al procesar consulta" + e);

	} catch (Exception e) {
		System.out.println("Error en la creacion del mapa");
	}

}
}
