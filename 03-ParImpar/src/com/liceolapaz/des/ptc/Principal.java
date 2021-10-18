package com.liceolapaz.des.ptc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir el numero al usuario
		pedirNumero();
		// Leer el numero y guardarlo
		int numeroUsuario = leerNumero();
		// Escribir si el numero es par o impar
		escribirMensaje(numeroUsuario);

	}

	private static void escribirMensaje(int numeroUsuario) {
		// Almacener el mensaje en una variable
		String mensaje =
				(numeroUsuario ==0) ?
						"El numero 0 no es par ni impar" :
						(numeroUsuario % 2 == 0) ?
				"El numero introducido es par" :
					"El numero introducido es impar" ;
		// Escribir por pantalla el mensaje
		System.out.println(mensaje);
		
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumero() {
		System.out.print("Escribe un numero entero: ");
		
	}

}
