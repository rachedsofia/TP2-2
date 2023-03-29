package TP12Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import TP22_Modelo.Bebida;
import TP22_Modelo.ComarcaPlus;
import TP22_Modelo.Mastercard;
import TP22_Modelo.Pedido;
import TP22_Modelo.Plato;
import TP22_Modelo.RegistrarPago;
import TP22_Modelo.Tarjeta;
import TP22_Modelo.Visa;
import TP22_Persistencia.BaseRegistrarPago;
import TP22_Persistencia.EnDiscoRegistrarPago;

public class TartetaTest {
	@Test
	public void calcularCostoTarjetaVisa() {
		// inicialización
		RegistrarPago registro = new EnDiscoRegistrarPago("C:\\Users\\msofi\\OneDrive\\Escritorio\\Prueba.txt\\TP2-2-Reg.txt");
		Visa tarjetaVisa = new Visa("Jorge Rached", 03,registro);

		Bebida bebida1 = new Bebida("Agua", 100);
		Bebida bebida2 = new Bebida("Coca Cola", 120);

		Plato plato = new Plato("Merluza al verdeo", 1000);
		ArrayList<Plato> listPlatos = new ArrayList<Plato>();
		ArrayList<Bebida> listBebida = new ArrayList<Bebida>();
		// ejercitacion

		listBebida.add(bebida1);
		listBebida.add(bebida2);
		listPlatos.add(plato);
		Pedido pedido1 = new Pedido(listPlatos, listBebida);

		int resultadoEsperado = 1150;

		// verificación
		assertEquals(resultadoEsperado, tarjetaVisa.calcularCosto(pedido1));
	}
	@Test
	public void calcularCostoTarjetaVisaBD() {
		// inicialización
		RegistrarPago registro13 = new BaseRegistrarPago();
		Visa tarjetaVisa = new Visa("Jorge Rached", 03,registro13);

		Bebida bebida1 = new Bebida("Agua", 100);
		Bebida bebida2 = new Bebida("Coca Cola", 120);

		Plato plato = new Plato("Merluza al verdeo", 1000);
		ArrayList<Plato> listPlatos = new ArrayList<Plato>();
		ArrayList<Bebida> listBebida = new ArrayList<Bebida>();
		// ejercitacion

		listBebida.add(bebida1);
		listBebida.add(bebida2);
		listPlatos.add(plato);
		Pedido pedido1 = new Pedido(listPlatos, listBebida);

		int resultadoEsperado = 1150;

		// verificación
		assertEquals(resultadoEsperado, tarjetaVisa.calcularCosto(pedido1));
	}
}
