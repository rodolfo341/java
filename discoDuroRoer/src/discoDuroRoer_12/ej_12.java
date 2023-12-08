package discoDuroRoer_12;
/**
 * Rodolfo Aravena
 */

/**
 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
 */
public class ej_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 100; i++) {
			
			if ( ( i % 2 == 0 ) && ( i % 3 == 0 ) ) {
				System.out.println(i);
			}
			
		}
		
	}

}
