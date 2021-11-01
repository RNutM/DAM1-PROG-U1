package ejercicios;

import java.util.*;

public class Ejercicio36 {
	/**
	 * Programa que lea por teclado las edades de 5 alumnos de una clase y nos de la edad
	 * del alumno mayor, la edad del alumno menor y la edad media de la clase.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ed1 = 0, ed2 = 0, ed3 = 0, ed4 = 0, ed5 = 0;

		System.out.println("Introduce una edad: ");
		ed1 = sc.nextInt();// Almaceno la edad en la variable
		System.out.println("Introduce una edad: ");
		ed2 = sc.nextInt();// Almaceno la edad en la variable
		System.out.println("Introduce una edad: ");
		ed3 = sc.nextInt();// Almaceno la edad en la variable
		System.out.println("Introduce una edad: ");
		ed4 = sc.nextInt();// Almaceno la edad en la variable
		System.out.println("Introduce una edad: ");
		ed5 = sc.nextInt();// Almaceno la edad en la variable

		if (ed1 > ed2 && ed1 > ed3 && ed1 > ed4 && ed1 > ed5)
			System.out.println("El mayor de la clase tiene: " + ed1 + " años");
		else if (ed2 > ed1 && ed2 > ed3 && ed2 > ed4 && ed2 > ed5)
			System.out.println("El mayor de la clase tiene: " + ed2 + " años");
		else if (ed3 > ed1 && ed3 > ed2 && ed3 > ed4 && ed3 > ed5)
			System.out.println("El mayor de la clase tiene: " + ed3 + " años");
		else if (ed4 > ed1 && ed4 > ed2 && ed4 > ed3 && ed4 > ed5)
			System.out.println("El mayor de la clase tiene: " + ed4 + " años");
		else if (ed5 > ed1 && ed5 > ed2 && ed5 > ed3 && ed5 > ed4)
			System.out.println("El mayor de la clase tiene: " + ed5 + " años");

		if (ed1 < ed2 && ed1 < ed3 && ed1 < ed4 && ed1 < ed5)
			System.out.println("El menor de la clase tiene: " + ed1 + " años");
		else if (ed2 < ed1 && ed2 < ed3 && ed2 < ed4 && ed2 < ed5)
			System.out.println("El menor de la clase tiene: " + ed2 + " años");
		else if (ed3 < ed1 && ed3 < ed2 && ed3 < ed4 && ed3 < ed5)
			System.out.println("El menor de la clase tiene: " + ed3 + " años");
		else if (ed4 < ed1 && ed4 < ed2 && ed4 < ed3 && ed4 < ed5)
			System.out.println("El menor de la clase tiene: " + ed4 + " años");
		else if (ed5 < ed1 && ed5 < ed2 && ed5 < ed3 && ed5 < ed4)
			System.out.println("El menor de la clase tiene: " + ed5 + " años");

		int suma = ed1 + ed2 + ed3 + ed4 + ed5;// Sumo todas las edades
		int media = suma / 5;// Divido la suma entre 5 para hallar la media
		System.out.println("La edad media de esta clase son: " + media + " años");

		sc.close();
	}
}

/*
 * En la carpeta extras he hecho un programa (EdadesAlumnos) que hace lo mismo pero
 * con ArrayList
 */
