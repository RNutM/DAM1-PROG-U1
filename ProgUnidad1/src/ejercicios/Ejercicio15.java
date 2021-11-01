package ejercicios;
import java.util.Scanner;

public class Ejercicio15 {
	/**
	 * Programa que lea una opción del menú siguiente y que visualice la operación
	 * correspondiente con dos números introducidos por teclado:
	 * 
	 * Introduzca la operación a realizar: 1. Sumar dos números. 2. Restar dos
	 * números. 3. Multiplicar dos números. 4. Dividir dos números 5. Hacer A módulo
	 * de B con los dos números.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		// Pedimos que el usuario introduzca dos numeros
		System.out.println("Dame el número 1");
		float a = sc.nextFloat();
		System.out.println("Dame el número 2");
		float b = sc.nextFloat();
		System.out.println("*************************************");
		do {
			// Mostramos el menu por pantalla
			System.out.println("Introduzca la operación a realizar");
			System.out.println("1. Sumar dos números");
			System.out.println("2. Restar dos números");
			System.out.println("3. Multiplicar dos números");
			System.out.println("4. Dividir dos números");
			System.out.println("5. Resto de uno entre otro");
			System.out.println("6. Para salir del programa");
			System.out.println("*************************************");

			// Pedimos la opción del menú
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("La suma entre " + a + " y " + b + " es " + (a + b) + "\n");
				break;
			case 2:
				System.out.println("La resta entre " + a + " y " + b + " es " + (a - b) + "\n");
				break;
			case 3:
				System.out.println("La multiplicación entre " + a + " y " + b + " es " + (a * b) + "\n");
				break;
			case 4:
				System.out.println("La división entre " + a + " y " + b + " es " + (a / b) + "\n");
				break;
			case 5:
				System.out.println("El resto entre " + a + " y " + b + " es " + (a % b) + "\n");
				break;
			case 6:// Opción para salir del menú
				System.out.println("Has salido del programa, hasta pronto!!\n");
				break;
			default:
				System.out.println("La opción es incorrecta\n");
				break;
			}
		} while (opcion != 6);
		sc.close();
	}
}