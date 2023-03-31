package TP2_2Test;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import TP2_2Modelo.Bebida;
import TP2_2Modelo.Pedido;
import TP2_2Modelo.Plato;
import TP2_2Modelo.RegistrarPago;
import TP2_2Modelo.Visa;
import TP2_2Persistencia.BaseRegistrarPago;
import TP2_2Persistencia.EnDiscoRegistrarPago;

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
		RegistrarPago registro13 = new BaseRegistrarPago("jdbc:mysql://127.0.0.1/poo_tp2-3","root", "");
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
