package discoDuroRoer_8;

import java.util.Scanner;

/**
 * Rodolfo Aravena
 */

/**
 * Modifica el ejercicio anterior, para que en lugar de pedir un número, 
 * pida un carácter (char) y muestre su código en la tabla ASCII.
 */
public class ej_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese un caracter");
		
		char caracter = sc.next().charAt(0);
		int valorAscci = (int)caracter;
	
		System.out.println(valorAscci);
		
		
	}

}
