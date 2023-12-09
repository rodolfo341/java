package discoDuroRoer_18;
/**
 * Rodolfo aravena
 * Pide por teclado dos número y genera 10 números aleatorios entre esos números. 
 * Usa el método Math.random para generar un número entero aleatorio 
 * (recuerda el casting de double a int).
 */
import java.util.*;

public class ej_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		char res;
		int limInferior;
		int limSuperior;
		int aleatorio;
		
		do {
			
			System.out.println("Ingrese limite inferior");limInferior = sc.nextInt();
			System.out.println("Ingrese limite superior");limSuperior = sc.nextInt();
			for(int i=1 ; i<=10;i++) {
				aleatorio = random.nextInt(limSuperior - limInferior + 1) + limInferior;
				System.out.println(aleatorio);
			}
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');

	}

}
