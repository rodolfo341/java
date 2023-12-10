package discoDuroRoer_20;

import java.util.Scanner;

/**
 * Rodolfo Aravena
 * 
 * Pide un número por teclado e indica si es un número primo o no. 
 * Un número primo es aquel solo puede dividirse entre 1 y si mismo. 
 * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 * Un buen truco para calcular la raíz cuadrada del numero e 
 * ir comprobando que si es divisible desde ese numero hasta 1.
 * NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo. 
 */
public class ej_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int num;

		do {
			do {
				System.out.println("Ingrese numero");num = sc.nextInt();				
			} while ( num <= 1 );
			
			
			
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