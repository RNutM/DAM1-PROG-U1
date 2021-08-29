package varios;
import java.util.*;

/**
 * Programa que lea dos números enteros y nos devuelva el resultado de varias
 * operaciones y además nos diga sin son pares o impares
 * 
 * @author Robert G
 */

public class VarOperNum {// Varias operaciones con números

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// Declaro variables
		int n1 = 0, n2 = 0, suma, resta, mul, cuadrado1, cuadrado2;
		float div = 0.0f;

		do {
			try {// Controlo errores para que no caiga el programa
					// Solicito datos al usuario
				System.out.println("Introduzca un número entero");
				n1 = s.nextInt();
				System.out.println("Introduzca otro número entero");
				n2 = s.nextInt();
			} catch (InputMismatchException e) {// Informo de la excepción
				System.out.println(
						"Debes poner un número entero - Probablemente has puesto una letra o caracter no permitido\n"
								+ "En el caso de decimales debes poner una(,) y no un(.)");
				System.out.println("La excepción es esta --> " + e.getClass().getName());
				s.nextLine();// Pregunto de nuevo en caso de error
			}
		} while (n1 <= 0 || n2 <= 0); // Si algo falla solicito los número de nuevo
		s.close();// Cierro Scanner

		// Realizo los calculos
		suma = n1 + n2;
		resta = n1 - n2;
		mul = n1 * n2;
		div = (float) n1 / n2;
		cuadrado1 = n1 * n1;
		cuadrado2 = n2 * n2;

		// Imprimo en consola
		System.out.println("El primer número es: " + n1);
		System.out.println("El segundo número es: " + n2);
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicación es: " + mul);
		System.out.println("La división es: " + div);
		System.out.println("El cuadrado de n1 es: " + cuadrado1);
		System.out.println("El cuadrado de n2 es: " + cuadrado2);

		// Hacemos el módulo de 2 y si da de resto 0 es par
		if (n1 % 2 == 0)
			System.out.println("El primer número es par");
		else
			System.out.println("El primer número es impar");
		if (n2 % 2 == 0)
			System.out.println("El segundo número es par");
		else
			System.out.println("El segundo número es impar");
	}
}
