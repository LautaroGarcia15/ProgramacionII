package Ejercirtacion1;
import java.util.*;

public class Ej12 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Guardar los valores originales
        int originalNumero1 = numero1;
        int originalNumero2 = numero2;

        // Incrementar el primer número
        numero1++;

        // Decrementar el segundo número
        numero2--;

        // Mostrar los resultados
        System.out.println("Primer número:");
        System.out.println("Valor original: " + originalNumero1);
        System.out.println("Valor incrementado: " + numero1);

        System.out.println("Segundo número:");
        System.out.println("Valor original: " + originalNumero2);
        System.out.println("Valor decrementado: " + numero2);
        
        scanner.close();
	}

}
