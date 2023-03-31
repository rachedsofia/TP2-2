package TP2_2Persistencia;

import java.time.LocalDate;

import TP2_2Modelo.RegistrarPago;

public class BaseRegistrarPago implements RegistrarPago {
	private PedidoJDBC pedidoJDBC = new PedidoJDBC();
	
	@Override
	public void registrarPago(LocalDate fecha, int monto) {
		// TODO Auto-generated method stub

		try {
			pedidoJDBC.create(fecha,monto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}