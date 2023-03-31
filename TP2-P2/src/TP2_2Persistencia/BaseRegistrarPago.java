package TP2_2Persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.time.LocalDate;

import TP2_2Modelo.RegistrarPago;

public class BaseRegistrarPago implements RegistrarPago {
	String url; 
	String user;
	String password; 
	 
	public BaseRegistrarPago(String url,String user, String password) {
		if(url == null || user == null || password == null) {
			throw new RuntimeException("Faltan datos");
		}
		this.url = url;
		this.user = user;
		this.password = password;
	}

	@Override
	public void registrarPago(LocalDate fecha, int monto) {
		try (Connection conn = DriverManager.getConnection(this.url,this.user, this.password);
				java.sql.PreparedStatement statement = conn.prepareStatement("INSERT INTO restopago(fecha,monto) " + " VALUES (?,?)")){
					Date date = Date.valueOf(fecha);
				
				statement.setDate(1, date);
				statement.setInt(2,monto);
				statement.executeUpdate();
	} catch (Exception e) {
			e.printStackTrace();
		}
	}
}