package ejercicios;

import java.util.Scanner;

public class Ejercicio27 {
	/**
	 * Programa que lea un número e imprima su tabla de multiplicar.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int numero = 0;// Declaro variable
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		numero = sc.nextInt();// Almaceno número

		System.out.println("***********Sin bucle***********");
		int i = 1;// Declaro variable y multiplico 10 veces
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;// Sumo 1 a la variable i en cada linea
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;

		System.out.println("***********Con bucle for***********");
		for (int j = 1; j <= 10; j++)// Para j igual a 0; mientras que j sea menor o igual que 10; añadimos 1 a j
			System.out.println(numero + " x " + j + " = " + (numero * j));// Muestro el número multiplicado por j

		System.out.println("**********Con bucle While**********");
		int cont = 1;// Declaro variable
		while (cont <= 10) {// Mientras que cont sea menor o igual a 10
			System.out.println(numero + " x " + cont + " = " + (numero * cont));// Muestro el número multiplicado por
																				// cont
			cont++;// sumamos 1 a cont
		}
		System.out.println("**********Con bucle do while**********");
		int cont2 = 1;// Declaro variable
		do {
			System.out.println(numero + " x " + cont2 + " = " + (numero * cont2));// Muestro el número multiplicado por
																					// cont2
			cont2++;// sumamos 1 a cont2
		} while (cont2 <= 10);// Mientras que cont2 sea menor o igual a 10

		sc.close();
	}
}