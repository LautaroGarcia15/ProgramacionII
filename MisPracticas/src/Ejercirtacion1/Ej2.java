package Ejercirtacion1;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		int numeros[] = new int[5];
        Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i< 5; i++) {
			System.out.println("Ingrese un numero: ");
			int num = entrada.nextInt();
			numeros[i] = num;
		}
		
		for (int i = numeros.length -1; i>=0; i-- ){
			System.out.println(numeros[i]);
		}
		
	}

}
