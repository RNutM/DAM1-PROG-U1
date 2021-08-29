import java.util.*;

/**
 * Programa que pida una nota entre 0 y 10 de cada módulo de nuestro grado y 
 * si no es así no nos deje continuar hasta poner la nota entre ese rango,
 * además si introducimos letras o caracteres especiales capture el error y
 * termine el calculo con los datos que tengamos hasta el error
 * 
 * @author Robert G
 */

public class CalculoNotaMedia {

	public static void main(String[] args) {

		float ssii = 0, prog = 0, bbdd = 0, ingles = 0, fol = 0, eed = 0, ldm = 0, nota = 0, roundNota = 0;

		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("///Por favor introduce números positivos entre 0 y 10///\n");
				do {
					System.out.println("Introduce nota de SII: ");
					ssii = sc.nextFloat();
				} while (ssii < 0 || ssii > 10);

				do {
					System.out.println("Introduce nota de PROG: ");
					prog = sc.nextFloat();
				} while (prog < 0 || prog > 10);

				do {
					System.out.println("Introduce nota de BBDD: ");
					bbdd = sc.nextFloat();
				} while (bbdd < 0 || bbdd > 10);

				do {
					System.out.println("Introduce nota de INGLÉS: ");
					ingles = sc.nextFloat();
				} while (ingles < 0 || ingles > 10);

				do {
					System.out.println("Introduce nota de FOL: ");
					fol = sc.nextFloat();
				} while (fol < 0 || fol > 10);

				do {
					System.out.println("Introduce nota de EED: ");
					eed = sc.nextFloat();
				} while (eed < 0 || eed > 10);

				do {
					System.out.println("Introduce nota de LDM: ");
					ldm = sc.nextFloat();
				} while (ldm < 0 || ldm > 10);

			} catch (InputMismatchException e) {// Informo de la excepción
				System.out.println(
						"Debes poner un número entero - Probablemente has puesto una letra o caracter no permitido\n"
								+ "En el caso de decimales debes poner una(,) y no un(.)");
				System.out.println("La excepción es esta --> " + e.getClass().getName());
				sc.nextLine();// Pregunto de nuevo en caso de error
			}

		} while (ssii < 0 || prog < 0 || bbdd < 0 || ingles < 0 || fol < 0 || eed < 0 || ldm < 0);
		sc.close();// Cierro Scanner
		nota = ((ssii + prog + bbdd + ingles + fol + eed + ldm) / 7);

		roundNota = (float) (Math.round(nota * 100.0) / 100.0);// Redondeo a dos decimales

		System.out.println("La media de las notas es: " + roundNota);

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
	}
}
