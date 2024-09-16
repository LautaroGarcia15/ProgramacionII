package Ejercitacion2;
import java.util.*;

public class Ej18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero para ser dividido: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Ingrese un numero para dividir el anterior: ");
		int num2 = scanner.nextInt();
		

		
		while(num1!=0 && num2!=0) {
			System.out.println("El resultado de la division es: "+ num1/num2);
			
			System.out.println("Ingrese un numero para ser dividido: ");
			num1 = scanner.nextInt();
			
			System.out.println("Ingrese un numero para dividir el anterior: ");
			num2 = scanner.nextInt();
			
		}
		System.out.println("Fin del programa.");
		
	}

}
