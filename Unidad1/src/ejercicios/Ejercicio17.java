package ejercicios;

public class Ejercicio17 {
	/**
	 * Programa que visualice los 100 primeros números pares.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		System.out.println("\nVersión for[1] (pares)\n**********************");
		for (int i = 2; i <= 100; i += 2) {
			System.out.println("El número par es: " + i);
		}
		System.out.println("\nVersión for[2] (pares)\n**********************");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println("El número par es: " + i);
		}
		System.out.println("\nVersión while (pares)\n*********************");
		int cont = 0;
		int par = 2;
		while (cont < 50) {
			System.out.println("El número par es: " + par);
			cont++;
			par = par + 2;
		}
		System.out.println("\nVersión do while (pares)\n************************");
		cont = 0;
		par = 2;
		do {
			System.out.println("El número par es: " + par);
			cont++;
			par = par + 2;
		} while (cont < 50);
	}
}