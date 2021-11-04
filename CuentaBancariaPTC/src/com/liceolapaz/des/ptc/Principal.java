package com.liceolapaz.des.ptc;

import java.util.Scanner;

public class Principal {
	private static int cantidad;
	private static  boolean cuentaNormal = false;
	private static  boolean cuentaPremiun = false;
	public static void main(String[] args) {
		int salir = 0;
		while (salir == 0) {
			// Escribir Menú
			escribirMenu1();
			// Pedir opción
			pedirOpcion();
			// Leer opción y almacenarla
			int opcion = leerOpcion();
			// Ejecutar la opcion elegida
			hacerComandos(opcion);
		}

	}

	private static void hacerComandos(int opcion) {
		switch (opcion) {
		case 1:

			int contador = 0;
			while (contador == 0) {
				// Escribir Menú 2
				escribirMenu2();
				// Pedir opción
				pedirOpcion();
				// Leer opción y almacenarla
				int opcion2 = leerOpcion();
				// Ejecutar la opcion elegida
				hacerComandos2(opcion2);
				++contador;

			}
			break;
		case 2:
				System.out.println("Cuanto quiere ingresar?: ");
				int ingreso = leerIngreso();
				if (ingreso<0) {
					System.out.println("Tiene que introducir un numero positivo.");
				}else {
					cantidad=cantidad+ingreso;
					System.out.println("Su saldo actual es de "+cantidad+"€");
				}
				
			break;
		case 3:
				System.out.println("Cuanto quiere retirar?: ");
				int retiro = leerRetiro();
				cantidad=cantidad-retiro;
				if(cuentaNormal==false && cuentaPremiun==false) {
					System.out.println("ERROR");
				}else if(cuentaNormal==true && cuentaPremiun==false) {
					if(cantidad<0) {
						System.out.println("Con su cuenta normal su saldo no puede ser menor que 0");
					}else {
						System.out.println("Su saldo actual es de "+cantidad+"€");
					}
				}else if(cuentaNormal==false && cuentaPremiun==true) {
					System.out.println("Su saldo actual es de "+cantidad+"€");
				}
			
			break;
		case 4:
			System.out.println("Su saldo es de "+cantidad+"€");
			
			break;
		case 0:
			System.out.println("Vuelva pronto :)");
			System.exit(0);
			break;

		default:
			System.out.println("Opcion no valida");
			break;
		}

	}

	private static int leerRetiro() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static int leerIngreso() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void hacerComandos2(int opcion2) {
		switch (opcion2) {
		case 1:
		    cuentaNormal=true;
		    cuentaPremiun=false;
			System.out.println("Escriba el saldo inicial: ");
			cantidad = leerCantidad();
			if (cantidad < 0) {
				System.out.println("No puedes tener un saldo inicial negativo.");
			}
			break;
		case 2:
			cuentaPremiun=true;
		    cuentaNormal=false;
			System.out.println("Escriba el saldo inicial: ");
			cantidad = leerCantidad();
			if (cantidad < 0) {
				System.out.println("No puedes tener un saldo inicial negativo.");
			}
			break;
		case 0:

			break;
		default:
			System.out.println("Opcion no valida");
			break;
		}

	}

	private static int leerCantidad() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void escribirMenu2() {
		System.out.println("Tipo de cuenta\n" + "1. Cuenta normal\n" + "2. Cuenta Premium\n" + "0.  Cancelar");

	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: ");

	}

	private static void escribirMenu1() {
		System.out.println("BANCO\n" + "1. Crear cuenta\n" + "2. Ingresar dinero\n" + "3. Retirar dinero\n"
				+ "4. Consultar saldo\n" + "0. SALIR");

	}

}
