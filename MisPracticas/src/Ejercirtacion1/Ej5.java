package Ejercirtacion1;
import java.util.Scanner;
public class Ej5 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = scanner.next();
		
		System.out.println("Ingrese su edad: ");
		int edad = scanner.nextInt();
		
		System.out.println("Ingrese su altura: ");
		double altura= scanner.nextDouble();
		
		System.out.println("Ingrese su ocupacion: ");
		String ocupacion = scanner.next();
		
		System.out.println("Su nombre es: "+ nombre);
		System.out.println("Su edad es :"+ edad);
		System.out.println("Su altura es: "+ altura);
		System.out.println("Su ocupacion es :"+ ocupacion);
		
	}

}
