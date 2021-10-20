package com.liceolapaz.des.ptc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Escribir menú
		escribirMenu();
		// Pedir opción 
		pedirOpcion();
		// Leer opcion y almacenarla
		int opcion = leerOpcion();
		// Escribir mensaje por pantalla
		escribirMensaje(opcion);

	}

	private static void escribirMensaje(int opcion) {
		// Crear variable para almacenar el mensaje
		String mensaje= "";
		// Darle valor a la variable mensaje en funcion de la opcion escogida
		switch (opcion) {
		case 0:
			System.exit(0);
			break;

		case 1:
			mensaje ="Opcion 1 elegida";
			break;
		case 2:
			mensaje ="Opcion 2 elegida";
			break;
		case 3:
			mensaje ="Opcion 3 elegida";
			break;
			
		default:
			mensaje ="Opcion no valida";
			break;
		}
		// Escribir ese mensaje por patalla
		System.out.println(mensaje);
		
	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: ");
		
	}

	private static void escribirMenu() {
		System.out.println("MENÚ PRINCIPAL\n"
				+ "1. Opcion 1\n"
				+ "2.Opcion 2\n"
				+ "3. Opcion 3\n"
				+ "0. Salir");
		
	}

}
