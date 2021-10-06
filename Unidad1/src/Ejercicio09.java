import java.util.Scanner;

public class Ejercicio09 {
	/**
	 * Programa que nos diga si un número introducido por teclado es par o impar.
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.println("Introduce un número entero: ");
		n = sc.nextInt();

		if (n % 2 == 0)
			System.out.println("El número " + n + " es par");
		else
			System.out.println("El número " + n + " es impar");
		sc.close();
	}
}