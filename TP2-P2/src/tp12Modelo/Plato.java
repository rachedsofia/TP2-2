package tp12Modelo;

public class Plato {
	private String nombre;
	private int precio;

	public Plato(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public int precio() {
		return this.precio;
	}

}
