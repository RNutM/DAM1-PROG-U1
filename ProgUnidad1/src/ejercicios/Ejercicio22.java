package ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
	/**
	 * Programa que sume todos los números introducidos por el usuario hasta que
	 * pulse el número 0.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		suma = numero;// almaceno el valor del primer número en la variable suma

		while (numero != 0) { // Mientras sea distinto de cero hago el bucle
			numero++;
			System.out.println("Introduce otro número: ");
			numero = sc.nextInt();
			suma = suma + numero; // Sumo al numero la suma inicial
		}
		// Muestro el valor final de la variable suma
		System.out.println("La suma de todos los números introducidos es: " + suma);

		sc.close();
	}
}