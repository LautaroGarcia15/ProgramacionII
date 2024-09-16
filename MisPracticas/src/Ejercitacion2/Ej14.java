package Ejercitacion2;
import java.util.*;

public class Ej14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int pares = 0; 
		
		for(int i=0; i<10;i++) {
			
			System.out.println("Ingrese un numero entero: ");
			int numero = scanner.nextInt();
			
			if(numero % 2 == 0) {
				pares ++;
			}
			
		}
		
		System.out.println("La cantidad de numero pares que se ingresaron son: "+pares);
		
	}

}
