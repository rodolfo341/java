package discoDuroroer_7;

import java.util.Scanner;

/**
 * Rodolfo aravena
 */

/**
 * Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. 
 * Por ejemplo: si introduzco un 97, me muestre una a.
 */
public class ej_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese un numero entre 0 y 255");
		char caracter = (char)sc.nextInt();
		System.out.println(caracter);
		
	}

}
