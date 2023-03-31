package TP2_2Persistencia;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.LocalDate;

import TP2_2Modelo.RegistrarPago;

public class EnDiscoRegistrarPago implements RegistrarPago{

	private String direccion; 
	public EnDiscoRegistrarPago(String direccion) {
		this.direccion = direccion; 
		
	}
	@Override
	public void registrarPago(LocalDate fecha, int monto) {
		FileOutputStream salida;
		try {
			FileOutputStream is = new FileOutputStream("C:\\\\Users\\\\msofi\\\\OneDrive\\\\Escritorio\\\\Prueba.txt\\\\TP2-2-Reg.txt");
			OutputStreamWriter osw = new OutputStreamWriter(is);
			Writer escritura = new BufferedWriter(osw);
			escritura.write(fecha + "||" + monto);
			escritura.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
