package ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	/**
	 * Programa que lea un número de teclado y nos devuelva el cuadrado de ese
	 * número.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		// Declaramos variables
		float n = 0.0f;
		float cuadrado = 0.0f;

		try {// Controlo errores para que no caiga el programa

			// Pedimos que el usuario introduzca un número
			Scanner s = new Scanner(System.in);

			System.out.println("Introduzca un número: ");
			n = s.nextFloat();// Almacenamos el número introducido en la variable n

			s.close();// Cierro Scanner

			// Calculamos el cuadrado de un numero introducido
			cuadrado = (float) Math.pow(n, 2);
			// cuadrado = (n*n); // De esta forma también funcionaría

			// Mostramos por pantalla cual es el cuadrado del número introducido
			System.out.println("El cuadrado de " + n + " es: " + cuadrado);

		} catch (InputMismatchException e) {// Informo de la excepción
			System.out.println(
					"Debes poner un número entero - Probablemente has puesto una letra o caracter no permitido\n"
							+ "En el caso de decimales debes poner una(,) y no un(.)");
			System.out.println("La excepción es esta --> " + e.getClass().getName());
		}
	}
}