package ejercicios;
import java.util.*;

public class Ejercicio06 {
	/*
	 * Programa que lea dos números de teclado y que imprima el resultado de
	 * sumarlos, restarlos, multiplicarlos y dividirlos.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float n1 = 0, n2 = 0, suma = 0, resta = 0, multi = 0, div = 0;
		System.out.println("Introduce un número: ");
		n1 = sc.nextFloat();
		System.out.println("Introduce otro número: ");
		n2 = sc.nextFloat();

		suma = n1 + n2;
		System.out.println("La suma de " + n1 + " y " + n2 + " es: " + suma + "\n");
		resta = n1 - n2;
		System.out.println("La resta de " + n1 + " y " + n2 + " es: " + resta + "\n");
		multi = n1 * n2;
		System.out.println("La multiplicación de " + n1 + " y " + n2 + " es: " + multi + "\n");
		div = n1 / n2;
		System.out.println("La división de " + n1 + " y " + n2 + " es: " + div + "\n");

		sc.close();
	}
}