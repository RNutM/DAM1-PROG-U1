package ejercicios;
import java.util.*;

public class Ejercicio14 {
	/**
	 * Programa que lea una calificación numérica y nos diga su calificación
	 * alfanumérica. Nota: (0..3 = Muy deficiente) (>3 y <5 es Insuficiente) (>5 y
	 * <6 es Suficiente) (>6 y <7 es Bien) (>7 y <9 es Notable) (>= 9 es
	 * Sobresaliente.)
	 * 
	 * @author Robert
	 */
	public static void main(String[] args) {

		// Usando sentencias if
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nota poniendo coma si hay decimal: ");
		float nota = sc.nextFloat();

		while (nota < 0.0 || nota > 10) {
			System.out.println("Introduce una nota entre 0 y 10");
			nota = sc.nextFloat();
		}

		if (nota >= 0.0 && nota < 3.0)
			System.out.println("Muy deficiente");
		if (nota >= 3.0 && nota < 5.0)
			System.out.println("Insuficiente");
		if (nota >= 5.0 && nota < 6.0)
			System.out.println("Suficiente");
		if (nota >= 6.0 && nota < 7.0)
			System.out.println("Bien");
		if (nota >= 7.0 && nota < 9.0)
			System.out.println("Notable");
		if (nota >= 9.0)
			System.out.println("Sobresaliente");
		sc.close();
	}
}