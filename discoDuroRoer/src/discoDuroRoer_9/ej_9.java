package discoDuroRoer_9;

import java.util.Scanner;

/**
 * Rodolfo Aravena
 */

/**
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y 
 * calcule el precio final con IVA. El IVA sera una constante que sera del 21%. 
 */

public class ej_9 {
	public static void main(String[] args) {
		final double iva = 0.21;
		Scanner sc = new Scanner(System.in);
		
		double precio = sc.nextDouble();
		double precioFinal = precio + precio * iva; 
		
		System.out.println("Precio final = " + precioFinal);
	}
}
