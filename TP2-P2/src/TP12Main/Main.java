package TP12Main;

import java.util.ArrayList;

import EnDiscoRegistrarPago.EnDiscoRegistrarPago;
import tp12Modelo.Bebida;
import tp12Modelo.Mastercard;
import tp12Modelo.Pedido;
import tp12Modelo.Plato;
import tp12Modelo.RegistrarPago;
import tp12Modelo.Tarjeta;

public class Main {
	public static void main(String[] args) {
//		Plato plato1 = new Plato("Merluza al verdeo", 1000);
//		Plato plato2 = new Plato("Asado para 2", 700);
//		Plato plato3 = new Plato("Milanesa con papas fritas", 590);
//		Plato plato4 = new Plato("Fideos con bolognesa", 800);
//
//		Bebida bebida1 = new Bebida("Agua", 100);
//		Bebida bebida2 = new Bebida("Coca Cola", 120);
//		Bebida bebida3 = new Bebida("Fanta", 110);
//		Bebida bebida4 = new Bebida("Sprite", 110);
//
//		ArrayList<Bebida> listBebidas = new ArrayList<Bebida>();
//		ArrayList<Plato> listPlatos = new ArrayList<Plato>();
//
//		listPlatos.add(plato1);
//		listPlatos.add(plato2);
//		listPlatos.add(plato3);
//		listPlatos.add(plato4);
//
//		listBebidas.add(bebida1);
//		listBebidas.add(bebida2);
//		listBebidas.add(bebida3);
//		listBebidas.add(bebida4);
//
//		Mastercard tarjetaMastercard = new Mastercard("Sofia Rached", 01);
//		ComarcaPlus tarjetaComarca = new ComarcaPlus("Luciana Rached", 02);
//		Visa tarjetaVisa = new Visa("Jorge Rached", 03);
//		Tarjeta tarjetaViedma = new Tarjeta("Pepito Lopez", 04);
//
//		System.out.println(tarjetaVisa.calcularCosto(listBebidas, listPlatos));
//		System.out.println(tarjetaMastercard.calcularCosto(listBebidas, listPlatos));
//		System.out.println(tarjetaComarca.calcularCosto(listBebidas, listPlatos));
//		System.out.println(tarjetaViedma.calcularCosto(listBebidas, listPlatos));
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
		System.out.println(tarjetaMastercard.calcularCosto(pedido2));

		RegistrarPago registro1 = new EnDiscoRegistrarPago("C:\\Users\\msofi\\OneDrive\\Escritorio\\Prueba.txt\\TP2-2-Reg.txt");
		Tarjeta tarjetaViedma = new Tarjeta("Pepito Lopez", 04,registro1);

		Bebida bebida = new Bebida("Coca Cola", 120);

		Plato plato1 = new Plato("Milanesa con papas fritas", 590);

		ArrayList<Bebida> listaBebidas1 = new ArrayList<>();
		ArrayList<Plato> listaPlatos1 = new ArrayList<>();
		// ejercitacion
		listaBebidas1.add(bebida);

		listaPlatos1.add(plato1);
		Pedido pedido4 = new Pedido(listaPlatos1, listaBebidas1);
		System.out.println(tarjetaViedma.calcularCosto(pedido4));

		
	}
}
