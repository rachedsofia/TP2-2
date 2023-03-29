package TP22_Main;

import java.util.ArrayList;

import TP22_Modelo.Bebida;
import TP22_Modelo.Mastercard;
import TP22_Modelo.Pedido;
import TP22_Modelo.Plato;
import TP22_Modelo.RegistrarPago;
import TP22_Modelo.Tarjeta;
import TP22_Persistencia.BaseRegistrarPago;
import TP22_Persistencia.EnDiscoRegistrarPago;

public class Main {
	public static void main(String[] args) {
		System.out.println("EN DISCO : TEXTO ");
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
		
		System.out.println("********************");
		System.out.println("EN BASE DE DATOS : BD ");

		RegistrarPago registro11 = new BaseRegistrarPago();
		Mastercard tarjetaMastercard1 = new Mastercard("Sofia Rached", 01,registro11);

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
		
	}
}
