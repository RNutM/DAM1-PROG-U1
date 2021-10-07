package ejercicios;

import java.util.Scanner;

public class Ejercicio31 {
	/**
	 * Programa que lea números de teclado (hasta que se pulse 0) y que visualice cual
	 * fue el número mayor de la secuencia
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		int mayor = numero;

		while (numero != 0) {
			if (numero > mayor)
				mayor = numero;
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
		}
		System.out.println("El número mayor es :" + mayor);

		sc.close();
	}
}
