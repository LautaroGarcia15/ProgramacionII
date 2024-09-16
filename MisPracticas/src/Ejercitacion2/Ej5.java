package Ejercitacion2;
import java.util.*;

public class Ej5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int clave = 200;		
		
		System.out.println("Ingrese la hora con un numero entero: ");
		int hora = scanner.nextInt();
		
		if (hora>=0 && hora<=5) {
			
			System.out.println("Ingrese la temperatura con un numero entero: ");
			int temperatura = scanner.nextInt();
			
			if (temperatura < 20) {
				System.out.println("Encender la calefaccion");
			} else if(temperatura > 25) {
				System.out.println("Apagar calefaccion");
			} else {
				System.out.println("Calefaccion encendida, no abra las ventanas!!!");
			}
		}
		
		if (hora>=12 && hora<=17) {
			if(hora%2==0) {
				System.out.println((hora+17)/2);
			}else {
				System.out.println((hora+12)/2);
			}
		}
		
		if(hora>=18 && hora<=23) {
			
			System.out.println("Ingrese la clave: ");
			int intento = scanner.nextInt();
			
			if(intento == clave) {
				
				System.out.println("Ingrese la segunda clave: ");
				int segundaClave = scanner.nextInt();
				
				int centeno = segundaClave /= 100;
				int centenoClaveAsignada = intento /= 100;
				
				if (centeno%centenoClaveAsignada == 0) {
					System.out.println("Clave correcta");
				}else {
					System.out.println("Clave incorrecta");
				}
				
			}else {
				System.out.println("Clave incorrecta");
			}
		}
		
	}

}
