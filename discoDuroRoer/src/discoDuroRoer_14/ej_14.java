package discoDuroRoer_14;
/**
 * Rodolfo Aravena
 */

import java.util.Scanner;

/**
 * Realiza una aplicación que nos calcule una ecuación de segundo grado. 
 * Debes pedir las variables a, b y c por teclado y 
 * comprobar antes que el discriminante (operación en la raíz cuadrada). 
 * Para la raíz cuadrada usa el método sqlrt de Math. 
 * Te recomiendo que uses mensajes de traza.
 */
public class ej_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double solu1 = 0.0;
		double solu2 = 0.0;
		
		System.out.println("Ingrese a: "); double a = sc.nextDouble();
		System.out.println("Ingrese b: "); double b = sc.nextDouble();
		System.out.println("Ingrese c: "); double c = sc.nextDouble();
		
		// calcular discriminante
		double disc = ( Math.pow( b,2 ) - (4*a*c) );
		System.out.println(disc);
		if ( disc < 0 ) {
			System.out.println("No tiene solucion");
		} else {
			solu1 = ( -b + Math.sqrt(disc) ) / ( 2 * a ) ;
			solu2 = ( -b - Math.sqrt(disc) ) / ( 2 * a ) ;
			if ( solu1 == solu2 ) {
				System.out.println("Tiene solucion unica X = " + solu1);
			} else {
				System.out.println("Tiene dos soluciones diferentes");
				System.out.println("X1 = " + solu1);
				System.out.println("X2 = " + solu2);
			}
		}
		
		
		// calcular raices
		
		
	}

}
