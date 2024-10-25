package EjerciciosPreParcial2;

public class Main {

	public static void main(String[] args) {
		/*ConjuntoTDA conjunto1 = new ConjuntoTA();
		ConjuntoTDA conjunto2 = new ConjuntoTA();
		
		ConjuntoTDA conjuntoFinal = new ConjuntoTA();
		conjuntoFinal.InicializarConjunto();
		
		conjunto1.InicializarConjunto();
		conjunto2.InicializarConjunto();
		
		conjunto1.Agregar(1);
		conjunto1.Agregar(2);
		conjunto1.Agregar(3);
		conjunto1.Agregar(4);
		
		conjunto2.Agregar(2);
		conjunto2.Agregar(3);
		
		conjuntoFinal = conjunto1.diferencia(conjunto2);
		
		while(!conjuntoFinal.ConjuntoVacio()) {
			System.out.println(conjuntoFinal.Elegir());
			conjuntoFinal.Sacar(conjuntoFinal.Elegir());
		}
		
		System.out.println(conjunto1.suma());*/
		
		Ejercicio ejercicio = new Ejercicio();
		DiccionarioMultipleTDA dic = new DicMultipleDinamico();
		TDAPila pila = new PilaDinamica();
		
		pila.InicializarPila();
		dic.InicializarDiccionario();
		
		dic.Agregar(1, 6);
		dic.Agregar(5, 8);
		dic.Agregar(5, 7);
		dic.Agregar(5, 9);
		dic.Agregar(2, 6);
		
		pila = ejercicio.ValoresMax(dic);
		
		while(!pila.PilaVacia()) {
			System.out.println(pila.Tope());
			pila.Desapilar();
		}
		
	}

}
