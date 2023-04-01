package TP2_2Main;

import java.util.ArrayList;

import TP2_2Modelo.Bebida;
import TP2_2Modelo.Mastercard;
import TP2_2Modelo.Pedido;
import TP2_2Modelo.Plato;
import TP2_2Modelo.RegistrarPago;
import TP2_2Modelo.Tarjeta;
import TP2_2Test.FakeRegistrarPago;

public class Main {
	public static void main(String[] args) {

		System.out.println("EN DISCO : TEXTO ");
//		RegistrarPago registro1 = new EnDiscoRegistrarPago("C:\\Users\\msofi\\OneDrive\\Escritorio\\Prueba.txt\\TP2-2-Reg.txt");

		RegistrarPago registro1 = new FakeRegistrarPago();
		Tarjeta tarjetaViedma = new Tarjeta("Pepito Lopez", 04, registro1);

		Bebida bebida = new Bebida("Coca Cola", 120);

		Plato plato1 = new Plato("Milanesa con papas fritas", 590);

		ArrayList<Bebida> listaBebidas1 = new ArrayList<>();
		ArrayList<Plato> listaPlatos1 = new ArrayList<>();
		// ejercitacion
		listaBebidas1.add(bebida);

		listaPlatos1.add(plato1);
		Pedido pedido4 = new Pedido(listaPlatos1, listaBebidas1);
		System.out.println(tarjetaViedma.calcularCosto(pedido4));

		System.out.println("********************");
		System.out.println("EN BASE DE DATOS : BD ");

//		RegistrarPago registro11 = new BaseRegistrarPago("jdbc:mysql://127.0.0.1/poo_tp2-3", "root", "");
		RegistrarPago registro11 = new FakeRegistrarPago();
		Mastercard tarjetaMastercard1 = new Mastercard("Sofia Rached", 01, registro11);

		Bebida bebida3 = new Bebida("Fanta", 110);
		Bebida bebida4 = new Bebida("Sprite", 110);

		Plato plato3 = new Plato("Asado para 2", 700);

		ArrayList<Bebida> listaBebidas2 = new ArrayList<>();
		ArrayList<Plato> listaPlatos2 = new ArrayList<>();

		// Ejercitacion
		listaBebidas2.add(bebida3);
		listaBebidas2.add(bebida4);

		listaPlatos2.add(plato3);
		Pedido pedido3 = new Pedido(listaPlatos2, listaBebidas2);
		System.out.println(tarjetaMastercard1.calcularCosto(pedido3));

		System.out.println("EN MailTrap ");

	}
}
