package Ejercitacion2;
import java.util.*;

public class Ej4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cantidadDigitos = 0; 
		
		System.out.println("Ingrese un numero entre el 0 y el 999: ");
		int numero = scanner.nextInt();
		int numeroPermanente = numero;

		while (numero!=0) {
			numero /= 10;
			cantidadDigitos++;
		}
		
		System.out.println("Cantidad de digitos: "+cantidadDigitos);
		
		if(cantidadDigitos==3) {
			System.out.println("El numero es: "+numeroPermanente);
		}
		
	}

}
