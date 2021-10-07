package ejercicios;

import java.util.Scanner;

public class Ejercicio35 {

	/**
	 * Programa que diga cuantos dígitos tiene un número introducido por teclado. PISTA:
	 * Realiza divisiones sucesivas entre 10
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		int cifras = 0;

		while (numero != 0) {
			numero = numero / 10;
			cifras++;
		}
		System.out.println("El número de cifras es: " + cifras);
		sc.close();
	}
}
