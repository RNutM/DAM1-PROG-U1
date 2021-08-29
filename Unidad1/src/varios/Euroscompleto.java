package varios;
import java.math.BigDecimal;
import java.util.*;

public class Euroscompleto {

	/**
	 * Programa que pide una cantidad de euros y calcula el número de billetes
	 * necesario para cubrir dicha cantidad y el resto en monedas de 1, 2, 0.5,
	 * 0.20, 0.10, 0.05, 0.02, 0.01. Los tipos de billetes son: 500, 200, 100, 50,
	 * 20, 10 y 5.
	 * 
	 * @author Robert G
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaro una variable que contendra el valor a devolver
		double importe = 0;

		do {
			try {// Controlo errores
				System.out.print("Introduce la cantidad a desglosar:");
				importe = sc.nextDouble();

			} catch (Exception e) {
				System.out.println(
						"Debes poner un número entero - Probablemente has puesto una letra o caracter no permitido\n"
								+ "En el caso de decimales debes poner una(,) y no un(.)");
				System.out.println("La excepción es: " + e.getClass().getName() + "\n");

				sc.nextLine();// Pregunto de nuevo en caso de error
			}
		} while (importe <= 0);

		calcular(importe);// Envío el importe al método calcular
		sc.close();// Cierro Scanner
	}

	// Método para calcular
	public static void calcular(double importe) {

		int monedasR = 0, centimos = 0;

		// Indicamos todas las monedas posibles
		double[] monedas = { 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01 };

		// Creamos un array con 0 de longitud igual a la cantidad de monedas
		// Este array contendra las monedas a devolver
		int[] devolver = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		// Recorremos todas las monedas
		for (int i = 0; i < monedas.length; i++) {

			// Si el importe actual es superior a la moneda
			if (importe >= monedas[i]) {

				// obtenemos cantidad de monedas
				devolver[i] = (int) Math.floor(importe / monedas[i]);

				// actualizamos el valor del importe que nos queda por didivir
				// importe = importe - (devolver[i] * monedas[i]);
				// Falla ya que por ejemplo la salida: 57.27 en su lugar devuelve
				// 57.26999999999998

				// Convertimos la multiplicación a un BigDecimal - Solución al problema
				BigDecimal bd = BigDecimal.valueOf((devolver[i] * monedas[i]));

				// Convertimos importe anterior a BigDecimal, restamos la mulplicación y
				// por último convertimos el resultado a double para poder hacer: if(importe >=
				// monedas[i])
				importe = BigDecimal.valueOf(importe).subtract(bd).doubleValue();
			}
		}
		// Bucle para mostrar el resultado
		System.out.println();
		for (int i = 0; i < monedas.length; i++) {

			if (devolver[i] > 0) {
				if (monedas[i] > 2) { // Si es mayor que 2 son billetes
					if (monedas[i] == 500 || monedas[i] == 200 || monedas[i] == 100 || monedas[i] == 50
							|| monedas[i] == 20 || monedas[i] == 10 || monedas[i] == 5) {
						monedasR = (int) Math.round(monedas[i]);// Decimales de billetes eliminados
						// Indicamos que son billetes
						System.out.println("Billetes de " + monedasR + " €: " + devolver[i]);
					}
				} else if (monedas[i] == 1 || monedas[i] == 2) {// Monedas de 1 y 2 €
					monedasR = (int) Math.round(monedas[i]);// Decimales de monedas eliminados
					// Indicamos que son monedas de euros
					System.out.println("Monedas de " + monedasR + " €: " + devolver[i]);
				} else {
					// Indicamos que son monedas de céntimos
					if (monedas[i] == 0.5)	centimos = 50;
					if (monedas[i] == 0.20)	centimos = 20;
					if (monedas[i] == 0.10)	centimos = 10;
					if (monedas[i] == 0.05)	centimos = 5;
					if (monedas[i] == 0.02)	centimos = 2;
					if (monedas[i] == 0.01)	centimos = 1;
					System.out.println("Monedas de " + centimos + " cent: " + devolver[i]);
				}
			}
		}
		System.out.println("\n¡¡Muchas gracias por utilizar mi programa, hasta pronto!!");
	}// Fin método Calcular
}// Fin clase Euroscompleto
