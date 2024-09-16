package Ejercitacion2;
import java.util.*;

public class Ej11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int contadorDeVocales = 0;
		
		System.out.println("Ingrese una letra en minuscula: ");
		char letra = scanner.next().charAt(0);

		while(Character.isLowerCase(letra)) {
			
			if(esVocal(letra)) {
				
				contadorDeVocales+=1;
			}
			
			System.out.println("Ingrese una letra en minuscula: ");
			letra = scanner.next().charAt(0);
			
		}
		
		System.out.println("La cantidad de vocales ingresadas es: "+contadorDeVocales);
		
	}
	private static boolean esVocal(char letra) {
		return "aeiou".indexOf(letra) != -1;
	}

}
