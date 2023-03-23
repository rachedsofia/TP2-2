package tp12Modelo;

import java.time.LocalDate;

public class Mastercard extends Tarjeta {
	RegistrarPago planillaPago; 
	public Mastercard(String due�o, int numeroTarjeta,RegistrarPago registro) {
		super(due�o, numeroTarjeta, registro);
		// TODO Auto-generated constructor stub
		this.descuento = 2;this.planillaPago = registro;
	}

	public int calcularCosto(Pedido pedido) {
		int costoPlatos = pedido.costoPlatos();
		int descuentoPlatos = (int) (costoPlatos - (costoPlatos) * this.descuento / 100);
		int costoFinal = descuentoPlatos + pedido.costoBebidas();
		this.planillaPago.registrarPago(LocalDate.now(), costoFinal);
		return sumarPropina(costoFinal);
	}

}
