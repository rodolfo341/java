package discoDuroRoer_17;

import java.util.Scanner;

/**
 * Rodolfo Aravena
 */

/**
 * Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. 
 * Usa un switch para ello.
 */

public class ej_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		String dia;
		boolean laboral = true;
		do {
			do {
				System.out.print("Dia: "); dia = sc.nextLine();
			} while(!dia.equalsIgnoreCase("lunes"    ) && !dia.equalsIgnoreCase("martes") && 
					!dia.equalsIgnoreCase("miercoles") && !dia.equalsIgnoreCase("jueves") && 
					!dia.equalsIgnoreCase("viernes"  ) && !dia.equalsIgnoreCase("sabado") && 
					!dia.equalsIgnoreCase("domingo"  ));
			
			switch (dia) {
				case "lunes"    : { laboral = true ; break; }
				case "martes"   : { laboral = true ; break; }
				case "miercoles": {	laboral = true ; break; }
				case "jueves"   : { laboral = true ; break; }
				case "viernes"  : { laboral = true ; break; }
				case "sabado"   : { laboral = false; break; }
				case "domingo"  : { laboral = false; break; }
			}
			
			if ( laboral == true) System.out.println("Dia laboral");
			else System.out.println("Dia no laboral");
			
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