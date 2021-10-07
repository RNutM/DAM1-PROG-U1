package ejercicios;

import java.util.Scanner;

public class Ejercicio34_1 {
	/**
	 * Programa que genera una lista de los N primeros números primos, siendo N el
	 * dato de entrada - Genera la cantidad de números primos que introduzcamos.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número: ");
		int N = sc.nextInt();
		int contador = 0; // va a contar los N primos
		int numero = 2;
		boolean primo = false;

		while (contador != N) {
			primo = true;
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0)
					primo = false;
			}
			if (primo) {
				contador++;
				System.out.print(numero + " ");
			}
			numero++;
		}
		sc.close();
	}
}