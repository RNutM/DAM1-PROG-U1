package ejercicios;

import java.util.Scanner;

public class Ejercicio30 {
	/**
	 * Programa que lea números de teclado (hasta que se pulse 0) y que visualice la suma
	 * de los números pares si el primer número introducido fue un número impar, y que
	 * visualice la suma de los números impares introducidos si el primer número
	 * introducido fue un número par
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Declaro variables
		int numero = 0, par = 0, impar = 0, primero = 0;

		System.out.println("Introduce un número: ");
		primero = sc.nextInt(); // Leo el primer número

		if (primero % 2 == 0) {// Si el primer número es par sumamos impares

			System.out.println("Introduce otro número: ");
			numero = sc.nextInt(); // Leo el número

			while (numero != 0) {// Si es distinto de 0 almaceno en impar la suma del numero

				if (numero % 2 != 0)// Compruebo que el número es impar
					impar = impar + numero;
				// Pido otro número
				System.out.println("Introduce otro número: ");
				numero = sc.nextInt(); // Leo el número
			} // fin while sumar impares
				
			System.out.println("La suma de los números impares es: " + impar);
		} // fin if

		else {// En caso contrario es impar y sumamos pares
		
			System.out.println("Introduce otro número: ");
			numero = sc.nextInt(); // Leo el número

			while (numero != 0) {// Si es distinto de 0 almaceno en par la suma del numero
			
				if (numero % 2 == 0)// Compruebo que el número sea par
					par = par + numero;
				// Pido otro número
				System.out.println("Introduce otro número: ");
				numero = sc.nextInt(); // Leo el número
			} // fin while sumar pares
				
			System.out.println("La suma de los números pares es: " + par);
		} // fin else
		sc.close();
	}
}
