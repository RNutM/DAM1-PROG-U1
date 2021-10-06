package ejercicios;

public class Ejercicio18 {
	/**
	 * Programa que visualice los 100 primeros números impares.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		System.out.println("\nVersión for[1] (impares)\n************************");
		for (int i = 1; i < 100; i = i + 2) {
			System.out.println("El número impar es: " + i);
		}

		System.out.println("\nVersión for[2] (impares)\n************************");
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0)
				System.out.println("El número impar es: " + i);
		}

		System.out.println("\nVersión while (impares)\n***********************");
		int cont = 0;
		int impar = 1;
		while (cont < 50) {
			System.out.println("El número impar es: " + impar);
			cont++;
			impar = impar + 2;
		}
		System.out.println("\nVersión do while (impares)\n**************************");
		cont = 0;
		impar = 1;
		do {
			System.out.println("El número impar es: " + impar);
			cont++;
			impar = impar + 2;
		} while (cont < 50);
	}
}
