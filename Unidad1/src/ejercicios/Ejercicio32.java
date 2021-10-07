package ejercicios;

import java.util.Scanner;

public class Ejercicio32 {
	/**
	 * Programa que lea números de teclado (hasta que se pulse 0) y que visualice cual
	 * fue el número menor de la secuencia
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		int menor = numero;

		while (numero != 0) {
			if (numero < menor)
				menor = numero;
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
		}
		System.out.println("El número menor es :" + menor);

		sc.close();
	}
}
