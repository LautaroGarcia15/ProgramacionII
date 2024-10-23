package ConjuntoTDA;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ConjuntoTDA conjunto1 = new ConjuntoDinamico();
		
		conjunto1.InicializarConjunto();
		
		conjunto1.Agregar(2);
		conjunto1.Agregar(5);
		conjunto1.Agregar(6);
		conjunto1.Agregar(8);
		
		ConjuntoTDA conjunto2 = new ConjuntoDinamico();
		
		conjunto2.InicializarConjunto();
		
		conjunto2.Agregar(1);
		conjunto2.Agregar(5);
		conjunto2.Agregar(6);
		conjunto2.Agregar(9);
		
		System.out.println(unionConjuntos(conjunto1,conjunto2));

	}
	//ejercicio de conjunto dinamico
	public static List unionConjuntos(ConjuntoTDA c1, ConjuntoTDA c2) {
		List<Integer> valores = new ArrayList<>();
		while(!c1.ConjuntoVacio()) {
			
			if(c2.Pertenece(c1.Elegir())) {
			valores.add(c1.Elegir());
			}
			
			c1.Sacar(c1.Elegir());
		}
		return valores;
	}

}
