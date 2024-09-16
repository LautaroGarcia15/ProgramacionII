package Ejercitacion2;
import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		
		String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		String[] vocales = {"a","e","i","o","u"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		int numero = scanner.nextInt();
		
		if(numero>0) {
			System.out.println("El numero que ingreso es positivo.");
		}else {
			System.out.println("El numero que ingreso es negativo.");
		}
		
		if(numero>100) {
			System.out.println("grande");
		}else {
			System.out.println("chico");
		}
		
		System.out.println("Ingrese un numero del 1 al 7: ");
		int dia = scanner.nextInt();
		
		System.out.println("El dia de la semana es: "+dias[dia-1]);
		
		System.out.println("Ingrese un numero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Ingrese un numero: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Ingrese un numero: ");
		int num3 = scanner.nextInt();
		
		if (num1<num2 && num2<num3) {
			System.out.println("Los numeros van en forma creciente");
		}else if(num1>num2 && num2>num3) {
			System.out.println("Los numeros van en forma decreciente");
		}else {
			System.out.println("Error");
		}
	}

}
