package discoDuroRoer_19;

import java.util.Scanner;


/**
 * Rodolfo Aravena
 * 
 * Pide por teclado un número entero positivo (debemos controlarlo) y 
 * muestra  el número de cifras que tiene. 
 * Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. 
 * Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje. 
 */

public class ej_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int num;
		
		do {
			System.out.println("Ingrese N: ");
			do {
				num = sc.nextInt();				
			} while (num < 0);
			
			
			
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
	}

}

/*
Scanner sc = new Scanner(System.in);
char res;

do {
	
	System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
} while (Character.toUpperCase(res) == 'S');
*/