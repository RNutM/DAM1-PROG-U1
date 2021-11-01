package ejercicios;

import java.util.Scanner;

public class Ejercicio34_2 {
	/**
	 * Programa que genera una lista de los N primeros números primos, siendo N el dato
	 * de entrada - Genera números primos hasta el que hemos introducido.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {
		int contador = 0, numero = 2, N;
		boolean primo = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número: ");
		N = sc.nextInt();

		while (contador != N && numero < N) {// Mientras contador distinto a N y número menor a N
			primo = true;// Si es primo
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0)
					primo = false;
			}
			if (primo) {
				contador++;
				System.out.print(numero + " ");
				// ********Block start**********//
				if (contador == 10) {
					System.out.println("\n");
					contador = 0;
				} // **********Block end**********//
			}
			numero++;
		}
		sc.close();
	}
}
