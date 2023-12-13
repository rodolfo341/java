package discoDuroRoer_24;

import java.util.Scanner;

/**
 * Rodolfo Aravena
 * 
 * Recorre el String << La lluvia en Sevilla es una maravilla >> y 
 * transforma cada carácter a su código ASCII. 
 * Muestralos en linea recta, separados por un espacio entre cada carácter.
 */

public class ej_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vocales = "La lluvia en Sevilla es una maravilla";
		
		char res;

		do {
			StringBuilder vocalesAscci = new StringBuilder();
			
			for( int i=0 ; i<vocales.length() ; i++) {
				vocalesAscci.append((int) vocales.charAt(i));
			}
			
			System.out.println(vocalesAscci);
			
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