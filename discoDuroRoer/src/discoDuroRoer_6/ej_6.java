package discoDuroRoer_6;

import java.util.Scanner;

/**
 * Rodolfo Aravena
 */

/**
 * Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
 * Si no lo es, también debemos indicarlo. 
 */

public class ej_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num = sc.nextInt();
		
		if ( num % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("No es par");
		}
		
	}

}

