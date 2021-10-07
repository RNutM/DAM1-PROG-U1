package ejercicios;

import java.util.Scanner;

public class Ejercicio33 {
	/**
	 * Programa que visualice si un número introducido por teclado es perfecto. NOTA: Un
	 * número es perfecto si la suma de sus divisores, excepto él mismo, es igual al
	 * propio número.
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;
		int i = 0;
		int suma = 0;
		System.out.println("Algunos números pefectos: 6 - 28 - 496 - 8128 ......");
		System.out.println("Introduce un número: ");
		n = sc.nextInt();

		System.out.println(
				"Un número es perfecto si la suma de sus divisores," + " excepto él mismo, es igual al propio número.\n"
						+ "Dicho de otra forma, un número perfecto es aquel que es amigo de sí mismo.\r\n" + "\r\n"
						+ "Así, 6 es un número perfecto porque sus divisores propios son 1, 2 y 3 y suman 6\r\n"
						+ "		6 = 1 + 2 + 3\r\n" + "		28 = 1 + 2 + 4 + 7 + 14\r\n"
						+ "		496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248\r\n"
						+ "		8128 = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064\n");
		sc.close();// Cierro Scanner
		// Bucle para determinar la suma de todos los números divisores por el número
		// elegido que den como resto 0
		for (i = 1; i < n; i++) {
			if (n % i == 0)
				suma = suma + i;
		}

		if (suma == n)
			System.out.println("-->El número " + n + " es perfecto<--");
		else
			System.out.println("-->El número " + n + " no es perfecto<--");
	}
}
