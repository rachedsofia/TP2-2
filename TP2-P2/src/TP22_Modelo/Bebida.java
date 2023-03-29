package TP22_Modelo;

public class Bebida {
	private String nombre;
	private int precio;

	public Bebida(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public int precio() {
		return this.precio;
	}
}
