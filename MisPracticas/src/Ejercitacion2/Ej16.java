package Ejercitacion2;
import java.util.*;

public class Ej16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cantidadActual = 0;
		int cantidadAcumulada = 0;
		
		for(int i = 0; i < 15; i++) {
			System.out.println("Ingrese un caracter: ");
			char caracter = scanner.next().charAt(0);
			
			if(caracter == 'a') {
				cantidadActual ++;
				if(cantidadActual>cantidadAcumulada) {
					cantidadAcumulada = cantidadActual;
				}
			}else {
				cantidadActual = 0;
			}
		}
		
		System.out.println("La cantidad de a acumuladas seguidas es: "+cantidadAcumulada);
		
	}

}
