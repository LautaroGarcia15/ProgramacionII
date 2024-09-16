package Ejercitacion2;
import java.util.*;

public class Ej8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero (0 para salir): ");
		int numero = scanner.nextInt();
		
		while(numero!=0) {
			System.out.println("El numero es: "+ numero);
			System.out.println("Ingrese un numero entero (0 para salir): ");
			numero = scanner.nextInt();
		}
		
	}

}
