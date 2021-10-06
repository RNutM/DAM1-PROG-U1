package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
	/**
	 * Programa que lea tantos números por teclado como el usuario desee (Se termina
	 * introduciendo el número 0) y que nos diga cuantos números son pares y cuantos
	 * positivos.
	 * 
	 * @author Robert G
	 **/
	public static void main(String[] args) {

		int numero = 0, contpares = 0, contpositivos = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();

		while (numero != 0) {

			if (numero % 2 == 0) {
				contpares++;
			}
			if (numero > 0) {
				contpositivos++;
			}

			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
		}

		System.out.println("El número de pares es: " + contpares);
		System.out.println("El número de positivos es: " + contpositivos);

		sc.close();
	}
}