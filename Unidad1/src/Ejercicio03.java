import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	/**
	 * Escribir el resultado de resolver la ecuación de segundo grado: ax2+bx+c = 0
	 * introduciendo como datos por teclado, a, b y c. x=(-b±√(b^2-4ac))/2a --> Esta
	 * formula nos devuelve dos soluciones
	 * 
	 * @author Robert G
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaramos variables
		int a, b, c, op1, op2 = 0;
		float x1, x2, raiz = 0;

		try {// Controlo errores para que no caiga el programa
				// Pedimos al usuario que introduzca las incognitas para resolver la ecuación
			Scanner s = new Scanner(System.in);

			System.out.println("******Por favor solo números enteros******");
			System.out.println("Introduzca X²");
			a = s.nextInt();

			System.out.println("Introduzca X");
			b = s.nextInt();

			System.out.println("Introduzca Término independiente");
			c = s.nextInt();
			s.close();// Cierro Scanner

			// Calculamos la ecuación con los números obtenidos del usuario
			op1 = (b * b) - (4 * a * c);
			op2 = (2 * a);

			raiz = (float) Math.sqrt(op1);

			x1 = (float) (-b + (raiz));
			x2 = (float) (-b - (raiz));

			double r1 = (x1 / op2);
			double r2 = (x2 / op2);
			if (Double.isNaN(r1)) {
				System.out.println("x1 no tiene solución");
			}
			if (Double.isNaN(r2)) {
				System.out.println("x2 no tiene solución");
			} else {
				System.out.println("El resultado x1 es:" + r1);
				System.out.println("El resultado x2 es:" + r2);
			}
		} catch (InputMismatchException e) {// Informo de la excepción
			System.out.println(
					"Debes poner un número entero - Probablemente has puesto una letra o caracter no permitido\n"
							+ "En el caso de decimales debes poner una(,) y no un(.)");
			System.out.println("La excepción es esta --> " + e.getClass().getName());
		}
	}
}