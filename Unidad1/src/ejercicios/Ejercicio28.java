package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio28 {
	/**
	 * Programa que lea números de teclado (hasta que se pulse 0) y que visualice la suma
	 * de los números impares introducidos. Además voy a ir almacenando los número
	 * introducidos en un ArrayList para después mostrarlos
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0, cont = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>();// Creo un ArrayList para ir almacenando los números

		System.out.println("Introduce un número: ");
		n = sc.nextInt();

		while (n != 0) {
			numeros.add(n);// Añado el número al ArrayList
			if (n % 2 != 0)// Si la division de n entre 2 no da de resto 0 es impar
				cont++;
			System.out.println("Introduce otro número: ");
			n = sc.nextInt();
		}

		Collections.sort(numeros);// Ordeno el ArrayList
		System.out.println("El total de números introducidos son " + numeros.size());
		System.out.println("Los números introducidos son: " + numeros);// Muestro el contenido del ArrayList
		System.out.println("La cantidad de números impares son: " + cont);
		sc.close();
	}
}
