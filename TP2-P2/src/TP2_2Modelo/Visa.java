package TP2_2Modelo;

import java.time.LocalDate;

public class Visa extends Tarjeta {
	RegistrarPago planillaPago; 
	public Visa(String dueño, int numeroTarjeta,RegistrarPago registro) {
		super(dueño, numeroTarjeta,registro);
		// TODO Auto-generated constructor stub
		this.descuento = 3;this.planillaPago = registro;
	}

	public int calcularCosto(Pedido pedido) {
		int costobebida = pedido.costoBebidas();
		int descuentoBebidas = (int) (costobebida - (costobebida) * this.descuento / 100);
		int costoFinal = descuentoBebidas + pedido.costoPlatos();
		this.planillaPago.registrarPago(LocalDate.now(), costoFinal);
		return sumarPropina(costoFinal);
	}

}
