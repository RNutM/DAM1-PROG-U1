package ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
	/**
	 * Programa que nos diga cuál es el mayor de dos números introducidos por
	 * teclado.
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

		if (a > b)
			System.out.println("El número "+a+" es mayor que el número "+b);
		if (a < b)
			System.out.println("El número "+b+" es mayor que el número "+a);
		if (a == b)
			System.out.println("El número "+a+" es igual que el número "+b);
		sc.close();
	}
}