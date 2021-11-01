package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
	/**
	 * Programa que calcule el factorial de un número. Nota: el factorial de un número N
	 * es N!= N*(N-1)*(N-2)*....* 2 * 1
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número(max 170): ");

		double n = sc.nextDouble();
		double factorial = 1;

		System.out.println("\nMismo resultado hallado de 3 formas diferentes"
				+ "\n**********************************************");
		for (double i = n; i >= 1; i--)
			factorial = factorial * i;
		System.out.println("El factorial 1 es: " + factorial);
		/*********************************************/
		factorial = 1;
		for (double i = 1; i <= n; i++)
			factorial = factorial * i;

		System.out.println("El factorial 2 es: " + factorial);
		/*********************************************/
		factorial = 1;
		while (n > 0) {
			factorial = factorial * n;
			n--;
		}
		System.out.println("El factorial 3 es: " + factorial);

		sc.close();
	}
}

/*
 * El factorial de un entero positivo n, el factorial de n o n factorial se define en
 * principio como el producto de todos los números enteros positivos desde 1 (es
 * decir, los números naturales) hasta n. Por ejemplo: 5! = 1 x 2 x 3 x 4 x 5= 120
 */