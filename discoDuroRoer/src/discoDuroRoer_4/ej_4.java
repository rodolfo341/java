package discoDuroRoer_4;

import javax.swing.JOptionPane;

/**
 * Rodolfo Aravena
 */

/**
 *  Modifica la aplicación anterior, 
 *  para que nos pida el nombre que queremos introducir 
 *  (recuerda usar JOptionPane).
 */
public class ej_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre"); 
		System.out.println("Bienvanido ".concat(nombre));		
	}

}
