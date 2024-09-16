package Ejercitacion2;
import java.util.*;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero mayor a 50: ");
		int numero = scanner.nextInt();

		if(numero>50 && (numero%2==0 || numero%3==0)) {
			System.out.println(numero);
		}
		
	}

}
