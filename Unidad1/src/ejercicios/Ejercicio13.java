package ejercicios;
import java.util.Scanner;

public class Ejercicio13 {
	/**
	 * Programa que lea 3 números de teclado y los muestre ordenados de mayor a
	 * menor.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaramos las variables para 3 números
		int n1, n2, n3;

		// Pedimos que el usuario introduzca tres números
		System.out.println("Dame el primer número: ");
		n1 = sc.nextInt();
		System.out.println("Dame el segundo número: ");
		n2 = sc.nextInt();
		System.out.println("Dame el tercer número: ");
		n3 = sc.nextInt();
		System.out.println("*************************************");
		/*
		 * Bucle comprobando cual es mayor de cada número introducido y mostrando por
		 * pantalla el orden de mayor a menor
		 */
		if (n1 > n2 && n2 > n3)
			System.out.println("El orden es: " + n1 + "-" + n2 + "-" + n3);
		else if (n2 > n1 && n1 > n3)
			System.out.println("El orden es: " + n2 + "-" + n1 + "-" + n3);
		else if (n3 > n1 && n1 > n2)
			System.out.println("El orden es: " + n3 + "-" + n1 + "-" + n2);
		else if (n1 > n3 && n3 > n2)
			System.out.println("El orden es: " + n1 + "-" + n3 + "-" + n2);
		else if (n2 > n3 && n3 > n1)
			System.out.println("El orden es: " + n2 + "-" + n3 + "-" + n1);
		else if (n3 > n2 && n2 > n1)
			System.out.println("El orden es: " + n3 + "-" + n2 + "-" + n1);
		sc.close();
	}
}