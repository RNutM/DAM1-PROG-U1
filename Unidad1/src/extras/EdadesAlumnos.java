package extras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class EdadesAlumnos {
	/**
	 * Programa que lea por teclado las edades de N alumnos de una clase y nos devuelva
	 * las edades introducidas y ordenadas de menor a mayor, la edad del alumno mayor, la
	 * edad del alumno menor, la suma de todas las edades y la edad media de la clase.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nAlumnos, edad;
		ArrayList<Integer> edades = new ArrayList<Integer>();

		System.out.println("Introduce el nº de alumnos:");
		nAlumnos = sc.nextInt();

		while (nAlumnos != 0) {

			System.out.println("Introduce una edad:");
			edad = sc.nextInt();
			edades.add(edad);
			nAlumnos--;

		}
		
		double suma = sumaValores(edades);
		double media = suma / edades.size();
		
		Collections.sort(edades);// Ordeno el ArrayList

		System.out.println("Las edades introducidas son: " + edades);
		System.out.println("El alumno mayor tiene " + Collections.max(edades) + " años");
		System.out.println("El alumno menor tiene " + Collections.min(edades) + " años");
		System.out.println("La suma de todas las edades es: " + suma);
		System.out.println("La media de edad en esta clase es de " + media + " años");

		sc.close();
	}

	// Método para recorrer el ArrarList y sumar sus elementos
	public static double sumaValores(ArrayList<Integer> edades) {
		double suma = 0;
		@SuppressWarnings("rawtypes")
		Iterator it = edades.iterator();
		while (it.hasNext()) {
			suma = suma + (Integer) it.next();
			// Hago el casteo a Integer ya que next() devuelve un dato de tipo Object.
		}
		return suma;
	}
}
