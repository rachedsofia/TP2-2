package TP22_Modelo;

import java.time.LocalDate;

public class ComarcaPlus extends Tarjeta {
RegistrarPago planillaPago; 

	public ComarcaPlus(String dueño, int numeroTarjeta, RegistrarPago registro) {
		super(dueño, numeroTarjeta,registro);
		// TODO Auto-generated constructor stub
		this.planillaPago = registro;
		this.descuento = 2;
	}

	public int calcularCosto(Pedido pedido) {
		int costoFinal = pedido.calcularCosto();
		costoFinal = (int) (costoFinal - (costoFinal * this.descuento / 100));
		this.planillaPago.registrarPago(LocalDate.now(), costoFinal);
		return sumarPropina(costoFinal);
		
	}
}
