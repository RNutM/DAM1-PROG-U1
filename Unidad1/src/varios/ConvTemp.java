package varios;

//import java.math.BigDecimal;
//import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvTemp {

	private static float c = 0.0f, f = 0.0f, k = 0.0f, r = 0.0f;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menuPrincipal();
	}

	private static void menuPrincipal() {

		int opciones = 0;

		do {
			// Menú con 7 opciones
			System.out.println("Elige la medida de entrada:\n" 
					+ "*****************************\n" 
					+ "1. Celsius (°C)\n"
					+ "2. Kelvin (K)\n" 
					+ "3. Fahrenheit (°F)\n" 
					+ "4. Rankine (°R, °Ra)\n"
					+ "5. Salir del programa\n");
			// System.out.println("*****************************");
			opciones = sc.nextInt();

			switch (opciones) {

			case 1:// Celsius (°C)
				System.out.println("Has elegido Celsius");
				celsius();
				break;

			case 2:// Kelvin (K)
				System.out.println("Has elegido Kelvin");
				kelvin();
				break;

			case 3:// Fahrenheit (°F)
				System.out.println("Has elegido Fahrenheit");
				Fahrenheit();
				break;

			case 4:// Rankine (°R, °Ra)
				System.out.println("Has elegido Rankine");
				Rankine();
				break;

			case 5:// Opción para salir del menú
				System.out.println("Ha salido del programa, hasta pronto");
				System.out.println("");
				break;
			default:
				System.out.println("Pulse un número del 1 al 5, por favor");
				System.out.println("******************************************");
				break;
			}

		} while (opciones != 5);
	}

	private static void celsius() {

		try {// Controlo errores para que no caiga el programa

			System.out.println("Introduce la temperatura a convertir\n");
			c = sc.nextFloat();

			k = (float) (c + 273.15);
			f = (c * 9 / 5) + 32;
			r = (float) ((c * 9 / 5) + 491.67);

			System.out.println("\nHas introducido "
						+ c + " grados Celsius que son:\n" 
						+ k + " grados Kelvin\n" 
						+ f + " grados Fahrenheit\n" 
						+ r + " grados Rankine\n");

		} catch (InputMismatchException e) {// Informo de la excepción
			System.out.println(
					"Debes poner un número entero - Probablemente has puesto una letra o caracter no permitido\n"
							+ "En el caso de decimales debes poner una(,) y no un(.)");
			System.out.println("La excepción es esta --> " + e.getClass().getName());
		}
	}

	private static void kelvin() {

		try {// Controlo errores para que no caiga el programa

			System.out.println("Introduce la temperatura a convertir\n");
			k = sc.nextFloat();

			c = (float) (k - 273.15);
			f = (float) ((k - 273.15) * 9 / 5 + 32);
			r = (float) (k * 1.8);

			System.out.println("\nHas introducido " 
					+ k + " grados Kelvin que son:\n" 
					+ c + " grados Celsius\n" 
					+ f	+ " grados Fahrenheit\n" 
					+ r + " grados Rankine\n");

		} catch (InputMismatchException e) {// Informo de la excepción
			System.out.println(
					"Debes poner un número entero - Probablemente has puesto una letra o caracter no permitido\n"
							+ "En el caso de decimales debes poner una(,) y no un(.)");
			System.out.println("La excepción es esta --> " + e.getClass().getName());
		}
	}

	private static void Fahrenheit() {

		try {// Controlo errores para que no caiga el programa

			System.out.println("Introduce la temperatura a convertir\n");
			f = sc.nextFloat();

			c = (float) (f - 32) * 5 / 9;
			k = (float) ((f - 32) * 5 / 9 + 273.15);
			r = (float) (f + 459.67);

			System.out.println("\nHas introducido " 
					+ f + " grados Fahrenheit que son:\n" 
					+ c + " grados Celsius\n" 
					+ k	+ " grados Kelvin\n" 
					+ r + " grados Rankine\n");

		} catch (InputMismatchException e) {// Informo de la excepción
			System.out.println(
					"Debes poner un número entero - Probablemente has puesto una letra o caracter no permitido\n"
							+ "En el caso de decimales debes poner una(,) y no un(.)");
			System.out.println("La excepción es esta --> " + e.getClass().getName());
		}
	}
	
	private static void Rankine() {

		try {// Controlo errores para que no caiga el programa

			System.out.println("Introduce la temperatura a convertir\n");
			r = sc.nextFloat();

			c = (float) (r - 491.67) * 5 / 9;
			k = (float) (r * 5 / 9);
			f = (float) (r - 459.67);

			System.out.println("\nHas introducido " 
					+ r + " grados Rankine que son:\n" 
					+ c + " grados Celsius\n" 
					+ k	+ " grados Kelvin\n" 
					+ f + " grados Fahrenheit\n");

		} catch (InputMismatchException e) {// Informo de la excepción
			System.out.println(
					"Debes poner un número entero - Probablemente has puesto una letra o caracter no permitido\n"
							+ "En el caso de decimales debes poner una(,) y no un(.)");
			System.out.println("La excepción es esta --> " + e.getClass().getName());
		}
	}
}

//Redondeo a 3 decimales con BigDecimal y RoundingMode
//BigDecimal bd = new BigDecimal(r).setScale(3, RoundingMode.HALF_UP);
//rd = (float) bd.floatValue();