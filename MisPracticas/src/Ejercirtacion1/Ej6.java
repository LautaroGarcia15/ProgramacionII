package Ejercirtacion1;
import java.util.*;

public class Ej6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el tipo de factura: ");
		String tipoFactura = scanner.next();
		
		System.out.println("Ingrese el numero de factura: ");
		int numeroFactura = scanner.nextInt();
		
		System.out.println("Ingrese el nombre del cliente: ");
		String cliente = scanner.next();
		
		System.out.println("Ingrese el producto1: ");
		String producto1 = scanner.next();
		
		System.out.println("Ingrese el importe1: ");
		float importe1 = scanner.nextFloat();
		
		System.out.println("Ingrese el producto2: ");
		String producto2 = scanner.next();
		
		System.out.println("Ingrese el importe2: ");
		float importe2 = scanner.nextFloat();
		
		float importeTotal = importe1+importe2;
		
		System.out.println("FACTURA \t"+tipoFactura+" \t"+numeroFactura);
		System.out.println("Nombre: \t"+cliente);
		System.out.println("Producto \tImporte");
		System.out.println(producto1+" \t"+importe1);
		System.out.println(producto2+" \t"+importe2);
		System.out.println("Importe Total \t"+ importeTotal);

	}

}
