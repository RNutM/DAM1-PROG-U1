package ejercicios;
import java.util.Scanner;

public class Ejercicio12 {
	/**
	 * Programa que nos diga si el producto de dos números introducidos por teclado
	 * es mayor o igual que la suma de ambos.
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedimos que el usuario introduzca dos numeros
		System.out.println("Dame un número");
		int a = sc.nextInt();
		System.out.println("Dame otro número");
		int b = sc.nextInt();
		System.out.println("*************************************");

		int multi = (a * b);
		int suma = (a + b);

		System.out.println("La multiplicación es: " + multi);

		System.out.println("La suma es: " + suma);

		if (multi >= suma)
			System.out.println("El producto es mayor que la suma");
		else
			System.out.println("La suma es mayor que el producto");
		sc.close();
	}
}