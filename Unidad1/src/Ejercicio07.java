import java.util.Scanner;

public class Ejercicio07 {
	/**
	 * Programa que sume y multiplique 4 números introducidos por teclado.
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float n1 = 0, n2 = 0, n3 = 0, n4 = 0, suma = 0, multi = 0;
		System.out.println("Introduce el número 1: ");
		n1 = sc.nextFloat();
		System.out.println("Introduce el número 2: ");
		n2 = sc.nextFloat();
		System.out.println("Introduce el número 3: ");
		n3 = sc.nextFloat();
		System.out.println("Introduce el número 4: ");
		n4 = sc.nextFloat();

		suma = n1 + n2 + n3 + n4;
		System.out.println("La suma de " + n1 + " | " + n2 + " | " + n3 + " | " + n4 + " | " + "es: " + suma);

		multi = n1 * n2 * n3 * n4;
		System.out
				.println("La multiplicación de " + n1 + " | " + n2 + " | " + n3 + " | " + n4 + " | " + "es: " + multi);

		sc.close();
	}
}