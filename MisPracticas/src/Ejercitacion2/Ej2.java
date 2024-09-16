package Ejercitacion2;
import java.util.*;

public class Ej2 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        Map<Integer, Integer> diasPorMes = new HashMap<>();
	        diasPorMes.put(1, 31); // Enero
	        diasPorMes.put(2, 28); // Febrero (valor por defecto)
	        diasPorMes.put(3, 31); // Marzo
	        diasPorMes.put(4, 30); // Abril
	        diasPorMes.put(5, 31); // Mayo
	        diasPorMes.put(6, 30); // Junio
	        diasPorMes.put(7, 31); // Julio
	        diasPorMes.put(8, 31); // Agosto
	        diasPorMes.put(9, 30); // Septiembre
	        diasPorMes.put(10, 31); // Octubre
	        diasPorMes.put(11, 30); // Noviembre
	        diasPorMes.put(12, 31); // Diciembre
	        
	        System.out.print("Ingrese el número del mes (1-12): ");
	        int mes = scanner.nextInt();

	        if (!diasPorMes.containsKey(mes)) {
	            System.out.println("Mes no válido.");
	            System.exit(0);
	        }

	        int dias = diasPorMes.get(mes);

	        // Caso especial para febrero
	        if (mes == 2) {
	            System.out.print("Ingrese el año: ");
	            int anio = scanner.nextInt();
	            // Verificar si el año es bisiesto
	            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
	                dias = 29;
	            }
	        }

	        System.out.println("El mes " + mes + " tiene " + dias + " días.");
		
	}

}
