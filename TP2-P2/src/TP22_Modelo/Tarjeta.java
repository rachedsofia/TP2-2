package TP22_Modelo;

import java.time.LocalDate;

public class Tarjeta {
	protected String dueñoTarjeta;
	protected int numeroTarjeta;
	protected int descuento;
	RegistrarPago planillaPago; 
	public Tarjeta(String dueño, int numeroTarjeta, RegistrarPago registro) {
		this.dueñoTarjeta = dueño;
		this.numeroTarjeta = numeroTarjeta;
		this.descuento = 0;
		this.planillaPago = registro;
	}

	public int calcularCosto(Pedido pedido) {
		int costoPlatos = pedido.costoPlatos();
		int descuentoPlatos = (int) (costoPlatos - (costoPlatos) * this.descuento / 100);
		int costoFinal = descuentoPlatos + pedido.costoBebidas();
		this.planillaPago.registrarPago(LocalDate.now(), costoFinal);
		return sumarPropina(costoFinal);
	}

	// preguntar responsabilidad
	public int sumarPropina(int unCosto) {
		if (unCosto < 1000) {
			return (int) (unCosto + (unCosto * 5 / 100));
		} else {
			if (unCosto < 2000) {
				return (int) (unCosto + (unCosto * 3 / 100));
			} else {
				return (int) (unCosto + (unCosto * 2 / 100));
			}
		}
	}
}
