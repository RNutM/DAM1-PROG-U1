package ejercicios;
import java.util.Scanner;

public class Ejercicio08 {
	/**
	 * Programa que nos diga si un número es positivo o negativo.
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		float n=0;
		System.out.println("Introduce un número: ");
		n=sc.nextFloat();
		
		if (n>=0)
			System.out.println("El número "+n+" es positivo");
		else
			System.out.println("El número "+n+" es negativo");
		sc.close();
	}
}