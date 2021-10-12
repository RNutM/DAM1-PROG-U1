package ejercicios;

import java.util.Scanner;

public class Ejercicio34_1 {
	/**
	 * Programa que genera una lista de los N primeros números primos, siendo N el dato
	 * de entrada - Genera la cantidad de números primos que introduzcamos.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {
		int contador = 0, numero = 2, N, bloque = 0;
		boolean primo = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número: ");
		N = sc.nextInt();

		while (contador != N) {
			primo = true;
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0)
					primo = false;
			}
			if (primo) {
				contador++;
				System.out.print(numero + " ");
				// ********Block start**********//
				bloque++;
				if (bloque == 10) {
					System.out.println("\n");
					bloque = 0;
				} // **********Block end**********//
			}
			numero++;
		}
		sc.close();
	}
}