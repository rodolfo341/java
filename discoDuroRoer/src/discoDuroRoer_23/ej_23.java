package discoDuroRoer_23;

import java.util.Scanner;
 /**
  * Rodolfo Aravena
  * 
  * Reemplaza todas las a de << La lluvia en Sevilla es una maravilla >> anterior por una e. 
  */
public class ej_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;

		do {
			
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