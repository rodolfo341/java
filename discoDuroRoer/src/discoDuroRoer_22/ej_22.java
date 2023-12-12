package discoDuroRoer_22;

import java.util.Scanner;
/**
 * Rodolfo Aravena
 * 
 * Del siguiente String «La lluvia en Sevilla es una maravilla» 
 * cuenta cuantas vocales hay en total (recorre el String con charAt).
 */
public class ej_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int cont = 0;
		String vocales = "La lluvia en Sevilla es una maravilla";
		
		do {
			
			for (int i=0 ; i< vocales.length() ; i++ ) {
				if ( vocales.charAt(i) == 'a' ) cont++;
				else if ( vocales.charAt(i) == 'e' ) cont++;
				else if ( vocales.charAt(i) == 'i' ) cont++;
				else if ( vocales.charAt(i) == 'o' ) cont++;
				else if ( vocales.charAt(i) == 'u' ) cont++;
				else if ( vocales.charAt(i) == 'A' ) cont++;
				else if ( vocales.charAt(i) == 'E' ) cont++;
				else if ( vocales.charAt(i) == 'I' ) cont++;
				else if ( vocales.charAt(i) == 'O' ) cont++;
				else if ( vocales.charAt(i) == 'U' ) cont++;
			}
			
			System.out.println("Vocales = " + cont);
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
/*
Scanner sc = new Scanner(System.in);
char res;

do {
	
	System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
} while (Character.toUpperCase(res) == 'S');
*/