package com.liceolapaz.des.ptc;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int salir=0;
		while(salir==0) {
		// Escribir Menú
		escribirMenu();
		// Pedir opción
		pedirOpcion();
		// Leer opción y almacenarla
		int opcion = leerOpcion();
		// Ejecutar la opcion elegida
		hacerComandos(opcion);}
	}

	private static void hacerComandos(int opcion) {
		String mensaje="";
		
		switch (opcion) {
		
		case 1:
			int contador1 = 0;
			//Generar numero aleatorio
			int numeroAleatorio1 = generarNumeroAleatorio(1, 10);
			
			do {
				// Pedir Numero del usuario
				pedirNumero1();
				// Leer y guardar numero
				int numeroUsuario1 = leerNumero();
				contador1++;
				if(numeroUsuario1 == numeroAleatorio1) {
					System.out.println("CORRECTO, has acertado en "+ contador1 + " intento(s)");
					break;
				
					
				}else if(numeroUsuario1 >= numeroAleatorio1) {
					System.out.println("INCORRECTO, el número es menor, llevas " + contador1 +" intento(s), prueba otra vez");
				}else {
					System.out.println("INCORRECTO, el número es mayor, llevas " + contador1 +" intento(s), prueba otra vez");
				}
				
			}while(contador1<3);	
			break;
			
        case 2:
        	int contador2 = 0;
			//Generar numero aleatorio
			int numeroAleatorio2 = generarNumeroAleatorio(1, 50);
			do {
				// Pedir Numero del usuario
				pedirNumero2();
				// Leer y guardar numero
				int numeroUsuario2 = leerNumero();
				contador2++;
				if(numeroUsuario2 == numeroAleatorio2) {
					System.out.println("CORRECTO, has acertado en "+ contador2 + " intento(s)");
					break;
				
					
				}else if(numeroUsuario2 >= numeroAleatorio2) {System.out.println("INCORRECTO, el número es menor, llevas "+ contador2+" intento(s), prueba otra vez");
					
				}else {System.out.println("INCORRECTO, el número es mayor, llevas "+ contador2+" intento(s), prueba otra vez");
					
				}
				
			}while(contador2<5);
			break;
			
        case 0:
        	System.out.println("Hasta luego :)");
        	System.exit(0);
	
	        break;

		default:
			mensaje = "Opción no válida";
			break;
		}
		
	}

	private static void pedirNumero2() {
			System.out.println("Dame un numero entre 1 y 50: ");
		
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumero1() {
		System.out.println("Dame un numero entre 1 y 10: ");
		
	}

	private static int generarNumeroAleatorio(int min, int max) {
		Random random = new Random();
		 return random.nextInt(max - min) + min;
		
	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in); 
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: ");
	}

	private static void escribirMenu() {
		System.out.println("ADIVINA EL NÚMERO\n"
				+ "1. Del 1 al 10 (3 intentos)\n"
				+ "2. Del 1 al 50 (5 intentos)\n"
				+ "0. Salir");
	}

}
