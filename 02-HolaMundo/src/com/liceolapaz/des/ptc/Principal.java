package com.liceolapaz.des.ptc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir el nombre al usuario
		pedirNombre();
		// Recibir el nombre y almacenarlo 
		String nombreUsuario = leerNombre();
		// Escribir saludo por pantalla
		escribirSaludo(nombreUsuario);
		
	}

	private static void escribirSaludo(String nombreUsuario) {
		System.out.println("¡Hola " + nombreUsuario + "!");
		
		
	}

	private static String leerNombre() {
		Scanner escaner =new Scanner(System.in);
		return escaner.nextLine();
	}

	private static void pedirNombre() {
	System.out.print("Escriba su nombre: ");	
		
	}

}
