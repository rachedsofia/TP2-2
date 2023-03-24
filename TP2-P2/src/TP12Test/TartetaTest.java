package TP12Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import EnDiscoRegistrarPago.BaseRegistrarPago;
import EnDiscoRegistrarPago.EnDiscoRegistrarPago;
import tp12Modelo.Bebida;
import tp12Modelo.ComarcaPlus;
import tp12Modelo.Mastercard;
import tp12Modelo.Pedido;
import tp12Modelo.Plato;
import tp12Modelo.RegistrarPago;
import tp12Modelo.Tarjeta;
import tp12Modelo.Visa;

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
	public void calcularCostoTarjetaVisaBD() {
		// inicialización
		RegistrarPago registro13 = new BaseRegistrarPago("http://localhost/phpmyadmin/index.php?route=/sql&db=poo_tp2-3&table=restopago");
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

	@Test
	public void calcularCostoTarjetaMastercard() {
		// inicializacion
		RegistrarPago registro = new EnDiscoRegistrarPago("C:\\Users\\msofi\\OneDrive\\Escritorio\\Prueba.txt\\TP2-2-Reg.txt");
		Mastercard tarjetaMastercard = new Mastercard("Sofia Rached", 01,registro);

		Bebida bebida1 = new Bebida("Fanta", 110);
		Bebida bebida2 = new Bebida("Sprite", 110);

		Plato plato = new Plato("Asado para 2", 700);

		ArrayList<Bebida> listaBebidas = new ArrayList<>();
		ArrayList<Plato> listaPlatos = new ArrayList<>();

		// Ejercitacion
		listaBebidas.add(bebida1);
		listaBebidas.add(bebida2);

		listaPlatos.add(plato);
		Pedido pedido2 = new Pedido(listaPlatos, listaBebidas);

		int resultadoEsperado = 835;
		// validacion
		assertEquals(resultadoEsperado, tarjetaMastercard.calcularCosto(pedido2));
	}
	public void calcularCostoTarjetaMastercardBD() {
		// inicializacion
		RegistrarPago registro11 = new BaseRegistrarPago("http://localhost/phpmyadmin/index.php?route=/sql&db=poo_tp2-3&table=restopago");
		Mastercard tarjetaMastercard = new Mastercard("Sofia Rached", 01,registro11);

		Bebida bebida1 = new Bebida("Fanta", 110);
		Bebida bebida2 = new Bebida("Sprite", 110);

		Plato plato = new Plato("Asado para 2", 700);

		ArrayList<Bebida> listaBebidas = new ArrayList<>();
		ArrayList<Plato> listaPlatos = new ArrayList<>();

		// Ejercitacion
		listaBebidas.add(bebida1);
		listaBebidas.add(bebida2);

		listaPlatos.add(plato);
		Pedido pedido2 = new Pedido(listaPlatos, listaBebidas);

		int resultadoEsperado = 835;
		// validacion
		assertEquals(resultadoEsperado, tarjetaMastercard.calcularCosto(pedido2));
	}

	@Test
	public void calcularCostoTarjetaComarcaPlusBD() {
		// inicializacion
		RegistrarPago registro12 = new BaseRegistrarPago("http://localhost/phpmyadmin/index.php?route=/sql&db=poo_tp2-3&table=restopago");
		ComarcaPlus tarjetaComarca = new ComarcaPlus("Luciana Rached", 02,registro12);

		Bebida bebida = new Bebida("Fanta", 110);

		Plato plato = new Plato("Fideos a la bolognesa", 800);

		ArrayList<Bebida> listaBebidas = new ArrayList<>();
		ArrayList<Plato> listaPlatos = new ArrayList<>();

		// ejercitacion
		listaBebidas.add(bebida);

		listaPlatos.add(plato);
		Pedido pedido3 = new Pedido(listaPlatos, listaBebidas);
		int resultadoEsperado = 936;

		// verificacion
		assertEquals(resultadoEsperado, tarjetaComarca.calcularCosto(pedido3));
	}
	public void calcularCostoTarjetaComarcaPlus() {
		// inicializacion
		RegistrarPago registro = new EnDiscoRegistrarPago("C:\\Users\\msofi\\OneDrive\\Escritorio\\Prueba.txt\\TP2-2-Reg.txt");
		ComarcaPlus tarjetaComarca = new ComarcaPlus("Luciana Rached", 02,registro);

		Bebida bebida = new Bebida("Fanta", 110);

		Plato plato = new Plato("Fideos a la bolognesa", 800);

		ArrayList<Bebida> listaBebidas = new ArrayList<>();
		ArrayList<Plato> listaPlatos = new ArrayList<>();

		// ejercitacion
		listaBebidas.add(bebida);

		listaPlatos.add(plato);
		Pedido pedido3 = new Pedido(listaPlatos, listaBebidas);
		int resultadoEsperado = 936;

		// verificacion
		assertEquals(resultadoEsperado, tarjetaComarca.calcularCosto(pedido3));
	}

	@Test
	public void calcularCostoTarjetaViedma() {
		// inicializacion
		RegistrarPago registro = new EnDiscoRegistrarPago("C:\\Users\\msofi\\OneDrive\\Escritorio\\Prueba.txt\\TP2-2-Reg.txt");
		Tarjeta tarjetaViedma = new Tarjeta("Pepito Lopez", 04,registro);

		Bebida bebida = new Bebida("Coca Cola", 120);

		Plato plato = new Plato("Milanesa con papas fritas", 590);

		ArrayList<Bebida> listaBebidas = new ArrayList<>();
		ArrayList<Plato> listaPlatos = new ArrayList<>();
		// ejercitacion
		listaBebidas.add(bebida);

		listaPlatos.add(plato);
		Pedido pedido4 = new Pedido(listaPlatos, listaBebidas);
		int resultadoEsperado = 745;
		// validacion
		assertEquals(resultadoEsperado, tarjetaViedma.calcularCosto(pedido4));
	}
	public void calcularCostoTarjetaViedmaBD() {
		// inicializacion
		RegistrarPago registro14 = new BaseRegistrarPago("http://localhost/phpmyadmin/index.php?route=/sql&db=poo_tp2-3&table=restopago");
		Tarjeta tarjetaViedma = new Tarjeta("Pepito Lopez", 04,registro14);

		Bebida bebida = new Bebida("Coca Cola", 120);

		Plato plato = new Plato("Milanesa con papas fritas", 590);

		ArrayList<Bebida> listaBebidas = new ArrayList<>();
		ArrayList<Plato> listaPlatos = new ArrayList<>();
		// ejercitacion
		listaBebidas.add(bebida);

		listaPlatos.add(plato);
		Pedido pedido4 = new Pedido(listaPlatos, listaBebidas);
		int resultadoEsperado = 745;
		// validacion
		assertEquals(resultadoEsperado, tarjetaViedma.calcularCosto(pedido4));
	}
	
}
