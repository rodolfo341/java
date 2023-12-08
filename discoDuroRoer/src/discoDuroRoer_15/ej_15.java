package discoDuroRoer_15;

import java.util.Scanner;

/**
 * Rodolfo Aravena
 */

/**
 * Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
 * si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 */
public class ej_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char res;
		int num;
		
		do {
			
			do { 
				System.out.println("Num = ");
				num = sc.nextInt();
			} while ( num < 0 );
			
			System.out.println("num = " + num);						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
	}

}
