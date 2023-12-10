package discoDuroRoer_21;

import java.util.Scanner;

/**
 * Rodolfo Aravena
 * 
 * Muestra los números primos entre 1 y 100
 * 
 */

public class ej_21 {
	
	public static void main(String[] args) {
		
		for( int num = 2 ; num<=100 ; num++ ) {
			
			boolean isPrimo = true;
							
			for(int i = 2 ; i<= Math.sqrt(num) ; i++) {
				if( num % i == 0 ) {
					isPrimo = false;
					break;
				}
			}
			
			if(isPrimo) System.out.println(num);
			
		}			
				
	}
}
/*
Scanner sc = new Scanner(System.in);
char res;

do {
	
	System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
} while (Character.toUpperCase(res) == 'S');
*/