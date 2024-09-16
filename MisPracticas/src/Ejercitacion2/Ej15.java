package Ejercitacion2;
import java.util.*;

public class Ej15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numeroMayor = 0;
		int numeroMenor = 999;
		int cantidadDeNumeros = 0;
		float promedio  = 0;
		
		System.out.println("Ingrese un numero entero(0 para salir): ");
		int numero = scanner.nextInt();
		
		while (numero != 0) {
			cantidadDeNumeros ++;
			promedio += numero;
			if(numero > numeroMayor) {
				numeroMayor = numero;
			}
			if(numero < numeroMenor) {
				numeroMenor = numero;
			}
			System.out.println("Ingrese un numero entero(0 para salir): ");
			numero = scanner.nextInt();
		}
		
		System.out.println("El mayor numero ingresado es: "+numeroMayor);
		System.out.println("El menor numero ingresado es: "+numeroMenor);
		System.out.println("El prodemdio de los numeros acumulados es: "+(promedio/cantidadDeNumeros));
		
	}

}
