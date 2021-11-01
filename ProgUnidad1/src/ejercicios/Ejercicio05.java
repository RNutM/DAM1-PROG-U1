package ejercicios;
import java.util.*;

public class Ejercicio05 {
/**
 * Programa que traduzca de grados a radianes.
 * NOTA: x = PI*y/180 donde x es el número de radianes e y el número de grados.
 * Yo aparte he hecho un menu para hallar al contrario y no salir hasta pulsar 0
 * 
 * @author Robert G
 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int op=0;
		float x=0,y=0,z=0,n=0;//Declaro variables float para trabajar con decimales
		
		do {
		System.out.println("");
		System.out.println("********************************");
		System.out.println("Introduzca la operación");
		System.out.println("1.Convertir de grados a radianes");
		System.out.println("2.Convertir de radianes a grados");
		System.out.println("0.Para salir del programa");
		System.out.println("********************************");
		System.out.println("");
		op=sc.nextInt();
				
		switch (op)	{
		
		case 1:
			System.out.println("Introduce los grados a transformar: ");
			y=sc.nextInt();
			x=(float) (Math.PI*y/180);//Declaro la variable de PI float para trabajar con decimales
			System.out.println(y+" grados son "+x+" radianes");
		break;
		
		case 2:
			System.out.println("Introduce los radianes a transformar: ");
			n=sc.nextFloat();
			z=(float) (n*180/Math.PI);//Declaro la variable de PI float para trabajar con decimales
			System.out.println(n+" radianes son "+z+" grados");
		break;
					}
			}while (op!=0);
		
		System.out.println("Has salido del programa");
		sc.close();
	}
}