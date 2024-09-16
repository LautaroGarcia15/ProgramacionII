package Ejercirtacion1;
import java.util.*;

public class Ej10 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Ingrese un numero1: ");
		int numero1 = scanner.nextInt();
		 
		System.out.println("Ingrese un numero2: ");
		int numero2 = scanner.nextInt();
		
		if(numero1>numero2) {
			System.out.println("El primero es mas grande que el segundo");
		}
		
		if(numero1%2 == 0 && numero2%2 == 0) {
			System.out.println("Los dos son multiplos de 2");
		}
		
	}

}
