package discoDuroRoer_16;

import java.util.Scanner;

/**
 * Rodolfo Aravena
 */

/**
 * Escribe una aplicación con un String que contenga una contraseña cualquiera. 
 * Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
 * Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena». 
 * Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
 */

public class ej_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// variables
		char sino;
		String respuesta;
				
		//Escribe una aplicación con un String que contenga una contraseña cualquiera.  
		String pas = "pp";
		
		// cuerpo
		// Después se te pedirá que introduzcas la contraseña, con 3 intentos.
		for(int i = 1; i<= 3;i++) {
			System.out.println("introduzca contraseña, intento " + i + " : ");
			respuesta = sc.nextLine();
			// Cuando aciertes ya no pedirá mas la contraseña y 
			// mostrara un mensaje diciendo «Enhorabuena». 
			if ( respuesta.equalsIgnoreCase(pas)) {
				System.out.println("Ehnorabuena");
				break;
			}
		} 
		// Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
		
	}

}
