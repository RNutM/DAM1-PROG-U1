package ejercicios;

import java.util.Scanner;

public class Ejercicio29 {
	/**
	 * Programa que lea números de teclado (hasta que se pulse 0) y que visualice la suma
	 * del valor absoluto de los números negativos introducidos.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0, suma = 0;

		System.out.println("Introduce un número: ");
		n = sc.nextInt();

		if (n < 0)
			suma = suma + n;

		while (n != 0) {

			if (n < 0)
				suma = suma + n; // Si n es menor que 0 (negativo)

			System.out.println("Introduce otro número: ");// Pedimos otro número al usuario
			n = sc.nextInt();
		}
		System.out.println("La suma de números negativos es: " + suma);

		sc.close();
	}
}