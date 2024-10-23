package ModeloParcialEj1;

public class Main {

	public static void main(String[] args) {
		ConjuntoExtendidoTDA conjunto = new ConjuntoTA();
		ConjuntoExtendidoTDA conjuntoAux = new ConjuntoTA();
		
		conjunto.InicializarConjunto();
		conjuntoAux.InicializarConjunto();
		
		conjunto.Agregar(5);
		conjunto.Agregar(5);
		conjunto.Agregar(2);
		conjunto.Agregar(1);
		conjunto.Agregar(9);
		
		conjuntoAux.Agregar(5);
		conjuntoAux.Agregar(3);
		conjuntoAux.Agregar(2);
		conjuntoAux.Agregar(8);
		
		conjunto.mostrar();
		
		System.out.println("La suma de todos los elementos del conjunto es: "+ conjunto.suma());
		
		/*conjunto.vaciar();
		
		System.out.println("SE VACIO EL CONJUNTO");
		System.out.println("La suma de todos los elementos del conjunto es: "+ conjunto.suma());*/
		
		conjunto.diferencia(conjuntoAux).mostrar();
		
	}

}
