package tp12Modelo;

import java.util.ArrayList;

public class Pedido {
	Plato plato;
	Bebida bebida;
	public ArrayList<Plato> listPlatos = new ArrayList<Plato>();
	public ArrayList<Bebida> listBebida = new ArrayList<Bebida>();

	public Pedido(ArrayList<Plato> listPlatos, ArrayList<Bebida> listBebida) {
		this.listPlatos = listPlatos;
		this.listBebida = listBebida;
	}

	public int costoBebidas() {
		int total = 0;
		for (Bebida bebida : listBebida) {
			total = bebida.precio();
		}
		return total;
	}

	public int costoPlatos() {
		int total = 0;
		for (Plato plato : listPlatos) {
			total = plato.precio();
		}
		return total;
	}

	public int calcularCosto() {
		int costoFinal = this.costoBebidas() + this.costoPlatos();

		return costoFinal;
	}

}
