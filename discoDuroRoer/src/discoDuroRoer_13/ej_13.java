package discoDuroRoer_13;

import java.util.Scanner;

/**
 * Rodolfo Aravena
 */

/**
 * Realiza una aplicación que nos pida un número de ventas a introducir, 
 * después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
 * Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */
public class ej_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int acum = 0;
		System.out.print("Ingrese numero de ventas: "); int ventas = sc.nextInt();
		
		for(int i = 1; i <= ventas; i++) {
			System.out.println("ingrese $ venta: \t"); acum += sc.nextInt();
		}
		
		System.out.println("Total ventas = " + acum);
	}
}
