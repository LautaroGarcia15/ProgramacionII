package Ejercirtacion1;
import java.util.*;

public class Ej7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese num1: ");
		float num1 = scanner.nextInt();
		
		System.out.println("Ingrese num2: ");
		float num2 = scanner.nextInt();
		
		System.out.println("Ingrese num3: ");
		float num3 = scanner.nextInt();
		
		float resultado = (num1/num2)-num3;
		
		if(resultado>=0 && num2 != 0 ) {
		System.out.println("El resultado es: "+resultado);
		
		}else {
			
			System.out.println("Los numeros ingresados no son correctos. ");
		}
		
	}

}
