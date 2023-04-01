package TP2_2Test;

import java.time.LocalDate;

import TP2_2Modelo.RegistrarPago;

public class FakeRegistrarPago implements RegistrarPago {

	public FakeRegistrarPago() {
	}

	@Override
	public void registrarPago(LocalDate fecha, int monto) {
		// TODO Auto-generated method stub

	}

	int monto;

	public boolean comparar(int montoA) {
		if (monto == montoA) {
			return true;
		} else {
			return false;
		}
	}

}
