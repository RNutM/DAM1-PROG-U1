package ejercicios;
import java.util.Scanner;

public class Ejercicio14S {
	/**
	 * Programa que lea una calificación numérica y nos diga su calificación
	 * alfanumérica. Nota: (0..3 = Muy deficiente) (>3 y <5 es Insuficiente) (>5 y
	 * <6 es Suficiente) (>6 y <7 es Bien) (>7 y <9 es Notable) (>= 9 es
	 * Sobresaliente.)
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		float nota = 0.0f;
		int notaR = 0;

		// Usando switch - case
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una nota entre 0 y 10");
		nota = sc.nextFloat();

		while (nota < 0 || nota > 10) {
			System.out.println("Introduce una nota entre 0 y 10");
			nota = sc.nextFloat();
		}

		notaR = Math.round(nota);
		System.out.println("Nota redondeada a " + notaR);

		System.out.println("\nCalificación\n*************");
		switch (notaR) {
		case 0:
		case 1:
		case 2:
		case 3:
			System.out.println("Muy deficiente");
			break;
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("Aprobado");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("El número tiene que ser entre 0 y 10");
		}
		sc.close();
	}
}