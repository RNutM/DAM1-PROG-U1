package ejercicios;

import java.util.Scanner;

public class Ejercicio25 {
	/* Calcular si un número N es primo. */
	public static void main(String[] args) {

		int n = 0;
		int cont = 0;
		/**
		 * En matemáticas, un número primo es un número natural mayor que 0 que tiene
		 * únicamente dos divisores distintos: él mismo y el 1.​​ Por el contrario, los
		 * números compuestos son los números naturales que tienen algún divisor natural
		 * aparte de sí mismos y del 1, y, por lo tanto, pueden factorizarse.
		 * 
		 * @author Robert G
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) { // Ahora hacemos el módulo entre "n" e "i"
			if (n % i == 0) { // Si el número dividido entre i da de resto 0

				System.out.println(i + " es divisor");// Muestra el valor de i (divisor)
				cont++;
			}
		}
		System.out.println("**************************");

		if (cont == 2) // Si es divisor entre 1 y el mismo el contador valdra 2 y el número será primo
			System.out.println(n + " es primo");
		else
			System.out.println(n + " no es primo");
		sc.close();
	}
}