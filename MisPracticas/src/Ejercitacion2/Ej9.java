package Ejercitacion2;
import java.util.*;

public class Ej9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un carácter (cualquier otro para salir): ");
        char caracter = scanner.next().charAt(0);

        if (Character.isDigit(caracter)) {
        	
            System.out.println("El carácter '" + caracter + "' es un dígito.");
            
        } else if (Character.isLowerCase(caracter)) {
        	
            if (esVocal(caracter)) {
            	
                System.out.println("El carácter '" + caracter + "' es una vocal minúscula.");
                
            } else {
                System.out.println("El carácter '" + caracter + "' es una consonante minúscula.");
            }
   
        } else {
            System.out.println("El carácter '" + caracter + "' no es ni un dígito ni una letra minúscula.");
        }

	}
    private static boolean esVocal(char caracter) {
        return "aeiou".indexOf(caracter) != -1;
    }

}
