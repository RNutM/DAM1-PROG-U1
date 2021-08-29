import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa para hallar distintas áreas: Triángulo, Círculo, Rectángulo y
 * Cuadrado
 * 
 * @author Robert
 *
 */

public class Geometria {

	public static void main(String[] args) {

		Scanner sc = null;

		// Declaro variables
		float base = 0.0f, altura = 0.0f, radio = 0.0f, lado = 0.0f;
		int opciones = 0;

		do {// Bucle para que se continue ejecutando el programa mientras no se pulse 5
			// Solicito datos al usuario
			try {// Controlo errores para que no caiga el programa
				sc = new Scanner(System.in);
				System.out.println("\nElije la operación a realizar" + "\n*****************************");
				System.out.println("1. Área del triángulo");
				System.out.println("2. Área del círculo");
				System.out.println("3. Área del rectángulo");
				System.out.println("4. Área del cuadrado");
				System.out.println("5. Salir del programa");
				System.out.println("*************************************");

				opciones = sc.nextInt();

				switch (opciones) {

				case 1:
					System.out.println("Introduce base: ");
					base = sc.nextFloat();
					System.out.println("Introduce altura: ");
					altura = sc.nextFloat();
					System.out.println("El área del triángulo es: " + (base * altura / 2));
					break;
				case 2:
					System.out.println("Introduce radio: ");
					radio = sc.nextFloat();
					System.out.println("El área del círculo es: " + (Math.PI * (radio * radio)));
					break;
				case 3:
					System.out.println("Introduce base: ");
					base = sc.nextFloat();
					System.out.println("Introduce altura: ");
					altura = sc.nextFloat();
					System.out.println("El área del rectángulo es: " + (base * altura));
					break;
				case 4:
					System.out.println("Introduce lado: ");
					lado = sc.nextFloat();
					System.out.println("El área del cuadrado es: " + (lado * lado));
					break;
				case 5:
					System.out.println("¡¡Muchas gracias por utilizar mi programa, hasta pronto!!");
					break;
				default:
					System.out.println("Pulse un número del 1 al 5, por favor");
					System.out.println("******************************************");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println(
						"Debes poner un número entero - Probablemente has puesto una letra o caracter no permitido\n"
								+ "En el caso de decimales debes poner una(,) y no un(.)");
				System.out.println("La excepción es esta --> " + e.getClass().getName());
			}
		} while (opciones != 5);
		sc.close();// Cierro Scanner
	}
}
