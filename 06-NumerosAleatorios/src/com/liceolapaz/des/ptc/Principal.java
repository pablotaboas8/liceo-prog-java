package com.liceolapaz.des.ptc;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedimos al usuario el numero a buscar 
		pedirNumeroBuscar();
		// Leemos el número abuscar y lo almacenamos
		int numeroBuscar = leerEntero();
		// Pedimos a el usuario el numero máximo de intetos
		pedirMaximoIntentos();
		// Leemos el numero máximo de intentos y lo almacenamos
		int maximoIntentos= leerEntero();
		// Almacenar numero de intentos
		int numeroIntentos = 0;
		while(numeroIntentos < maximoIntentos) {
		// Generar numero aleatorio y almacenarlo
		int numeroAleatorio = generarNumeroAleatorio(1, 10);
		// Imprimir numero generado
		System.out.println("El numero generado fue: "+ numeroAleatorio);
		// Sumar 1 a los intentos
		numeroIntentos++; // numeroIntentos = numeroIntentos + 1
		// Comprobar si el numero generado es igual al numero a buscar
		comprobarNumero(numeroBuscar, numeroAleatorio, numeroIntentos, maximoIntentos);
		// Si encontramos el numero salir del bucle
		if(numeroAleatorio == numeroBuscar) {
			break;
		}
		}
		

	}

	private static void comprobarNumero(int numeroBuscar, int numeroAleatorio, int numeroIntentos, int maximoIntentos) {
		// Si son iguales, imprimir mensaje
		if (numeroBuscar == numeroAleatorio) {
			System.out.println("Numero encontrado en " + numeroIntentos + " intento(s)");
		}
		// Si no lo son y hay mas intentos, repetir
		else  if( numeroIntentos < maximoIntentos) {
			return;
		}
		// Si no hay mas intentos, escribir mensaje
		else {
			System.out.println("No se ha podido encontrar en " + maximoIntentos + "intento(s)");
		}
		
	}

	private static int generarNumeroAleatorio(int min, int max) {
		 Random random = new Random();
		 return random.nextInt(max - min) + min;
		
	}

	private static void pedirMaximoIntentos() {
		System.out.print("Escriba numero maximo de intentos: ");
		
	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
		
	}

	private static void pedirNumeroBuscar() {
		System.out.print("Escriba el número a buscar entre 1 y 10: ");
		
	}

}
