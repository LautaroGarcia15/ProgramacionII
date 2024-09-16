package Ejercirtacion1;
import java.util.*;

public class Ej11 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int numero = scanner.nextInt();
		
		if(numero%6 == 0 && numero%7 == 0) {
			System.out.println("El numero es multiplo de 6 y 7.");
		}
		
		if((numero > 30 && numero%2 == 0)||(numero<=30)) {
			System.out.println("Cumple con la condicion del punto b)");
		}
	}

}
