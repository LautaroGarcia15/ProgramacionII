package Ejercitacion2;
import java.util.*;

public class Ej10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumador = 0;
		
		System.out.println("Ingrese un numero entre 1 y 10: ");
		int numero = scanner.nextInt();
		
		while(numero>=1 && numero<=10) {
			sumador += numero;
			System.out.println("Ingrese un numero entre 1 y 10: ");
			numero = scanner.nextInt();
		}
		System.out.println("El resultado final es: "+sumador);
	}

}
