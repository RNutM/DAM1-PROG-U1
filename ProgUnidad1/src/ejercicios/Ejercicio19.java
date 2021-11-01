package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
	/**
	 * Programa que lea 10 números de teclado y que nos diga cuántos de esos números
	 * introducidos fueron pares y cuantos impares.
	 * 
	 * @author Robert G
	 **/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// variables
		int contpares = 0, contimpares = 0, numero = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca un número: ");
			numero = sc.nextInt();
			if (numero % 2 == 0)
				contpares++;
			else
				contimpares++;
		} // for
		System.out.println("El número de pares es: " + contpares);
		System.out.println("El número de impares es: " + contimpares);

		sc.close();
	}
}
