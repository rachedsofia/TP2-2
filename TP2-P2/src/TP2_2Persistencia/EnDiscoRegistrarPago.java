package TP2_2Persistencia;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import TP2_2Modelo.RegistrarPago;

public class EnDiscoRegistrarPago implements RegistrarPago {

	private String ruta;

	public EnDiscoRegistrarPago(String ruta) {
		this.ruta = ruta;

	}

	@Override
	public void registrarPago(LocalDate fecha, int monto) {
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta);
			escritura.write(fecha + "||" + monto);
			escritura.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);

		}

	}

}
