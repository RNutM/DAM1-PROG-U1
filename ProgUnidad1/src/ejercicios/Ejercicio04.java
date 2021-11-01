package ejercicios;
import java.util.Scanner;

public class Ejercicio04 {
	/*
	 * Programa que convierta de grados centígrados a grados Kelvin y Farenheit.
	 * Nota: Para pasar de grados centígrados a Kelvin hay que sumar 273,15 al
	 * número de grados centígrados y para Fahrenheit hay que multiplicar por 9/5 y
	 * sumar 32.
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {
		// Declaramos variables
		String opcion;
		float c = 0.0f, f = 0.0f, k = 0.0f;

		Scanner s = new Scanner(System.in);

		System.out.println("Introduzce la temperatura");
		c = s.nextFloat();

		System.out.println("-> Pulsa k para convertir a Kelvin\n" + "-> Pulsa f para convertir a Farenheit");
		opcion = s.next();
		// Comprobamos si quiere Kelvin o Farenheit distinguiendo en K o k y en F o f
		if (opcion.equalsIgnoreCase("k")) {
			k = (float) (c + 273.15);
			System.out.println(c + " grados Celsius son " + k + " grados Kelvin");
		}

		if (opcion.equalsIgnoreCase("f")) {
			f = (c * 9 / 5) + 32;
			System.out.println(c + " grados Celsius son " + f + " grados Farenheit");
		}
		s.close();// Cierro Scanner
	}
}