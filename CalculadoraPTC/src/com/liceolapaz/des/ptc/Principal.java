package com.liceolapaz.des.ptc;

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
		switch (opcion) {
		case 1:
			// Pedir primer Numero del usuario
			pedirNumero1();
			// Leer y guardar numero
			int numeroSuma1 = leerNumero();
			// Pedir segundo Numero del usuario
			pedirNumero2();
			int numeroSuma2 = leerNumero();
			int suma = 0;
			suma = numeroSuma1 + numeroSuma2;
			System.out.println("La suma es " + numeroSuma1  + " + " + numeroSuma2 + " = " + suma);
			break;
		case 2:
			// Pedir primer Numero del usuario
			pedirNumero1();
		    // Leer y guardar numero
			int numeroResta1 = leerNumero();
			// Pedir segundo Numero del usuario
			pedirNumero2();
			int numeroResta2 = leerNumero();
			int resta = 0;
			resta =numeroResta1 - numeroResta2;
			System.out.println("La resta es " + numeroResta1  + " - " + numeroResta2 + " = " + resta);
			break;
		case 3:
			// Pedir primer Numero del usuario
			pedirNumero1();
			// Leer y guardar numero
		    int numeroProducto1 = leerNumero();
		    // Pedir segundo Numero del usuario
			pedirNumero2();
			int numeroProducto2 = leerNumero();
			int producto = 0;
			producto = numeroProducto1*numeroProducto2;
			System.out.println("El producto es " +  numeroProducto1 + " * " + numeroProducto2 + " = " + producto);
			break;
		case 4:
			// Pedir primer Numero del usuario
			pedirNumero1();
			// Leer y guardar numero
		    int numeroDivision1 = leerNumero();
		    // Pedir segundo Numero del usuario
			pedirNumero2();
			int numeroDivision2 = leerNumero();
			int division = 0;
			division = numeroDivision1/numeroDivision2;
			System.out.println("La división es " + numeroDivision1 + " / " + numeroDivision2 + " = " + division);
			break;
		case 0:
			System.out.println("Hasta luego :)");
			System.exit(0);
			break;

		default:
			break;
		}
	}

	private static void pedirNumero2() {
		System.out.println("Dame otro numero entero: ");
		
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumero1() {
		System.out.println("Dame un numero entero: ");
		
	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
		}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: ");
		
	}

	private static void escribirMenu() {
		System.out.println("CALCULADORA\n"
				+ "1. SUMA\n"
				+ "2. RESTA\n"
				+ "3. PRODUCTO\n"
				+ "4. DIVISIÓN\n"
				+ "0. SALIR");
		
	}

}
