package discoDuroRoer_5;

import javax.swing.JOptionPane;

/**
 * Rodolfo Aravena
 */

/**
 *  Haz una aplicación que calcule el área de un círculo(pi*R2). 
 *  El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). 
 *  Usa la constante PI y el método pow de Math.
 */

public class ej_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
		
		double area = Math.PI * Math.pow(radio, 2) ;
		
		System.out.println("El area es " + area);
		
		
		
	}

}
