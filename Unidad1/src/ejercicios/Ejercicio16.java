package ejercicios;

public class Ejercicio16 {
	/**
	 * Programa que visualice los 100 primeros números enteros positivos (incluido
	 * el cero).
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		System.out.println("\nCon bucle for\n*************");
		for (int i = 1; i <= 100; i++) {
			System.out.println("El número es: " + i);
		}
		System.out.println("\nCon bucle while\n***************");
		int cont = 1;
		while (cont <= 100) {
			System.out.println("El número es: " + cont);
			cont++;
		}
	}
}