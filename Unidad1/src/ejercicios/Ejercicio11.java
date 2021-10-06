package ejercicios;
import java.util.Scanner;

public class Ejercicio11 {
/**
 * Programa que nos diga cuál es el mayor de tres números introducidos por teclado.
 * 
 * @author Robert G
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;

		// Pedimos que el usuario introduzca dos numeros
		System.out.println("Dame un número");
		n1 = sc.nextInt();
		System.out.println("Dame otro número");
		n2 = sc.nextInt();
		System.out.println("Dame otro número");
		n3 = sc.nextInt();
		System.out.println("*************************************");
		if (n1 == n2 && n1 == n3)
			System.out.println("Los 3 números son iguales");
		else

		if (n1 > n2 && n1 > n3)
			System.out.println("El mayor es el número " + n1);
		else if (n2 > n1 && n2 > n3)
			System.out.println("El mayor es el número " + n2);
		else if (n3 > n1 && n3 > n2)
			System.out.println("El mayor es el número " + n3);

		sc.close();
	}
}