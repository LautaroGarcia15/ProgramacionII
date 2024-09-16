package Ejercitacion2;
import java.util.*;

public class Ej13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese una letra: ");
		char letra = scanner.next().charAt(0);
		
		if(Character.isLowerCase(letra)) {
			System.out.println("Ingrese un numero: ");
			int numero = scanner.nextInt();
			if (numero>=1 && numero<=5) {
				System.out.println(numero*1);
				System.out.println(numero*2);
				System.out.println(numero*3);
				System.out.println(numero*4);
				System.out.println(numero*5);
				System.out.println(numero*6);
				System.out.println(numero*7);
				System.out.println(numero*8);
				System.out.println(numero*9);
				System.out.println(numero*10);
			}
		}

	}

}
