package EjerciciosPreParcial3;

public class Main {

	public static void main(String[] args) {
		Ejercicio1 ejercicio = new Ejercicio1();
		DiccionarioSimpleTDA DS1 = new DicSimpleDinamico();
		DiccionarioSimpleTDA DS2 = new DicSimpleDinamico();
		TDAPila pila = new PilaDinamica();
		
		DS1.InicializarDiccionario();
		DS2.InicializarDiccionario();
		pila.InicializarPila();
		
		DS1.Agregar(4, 18);
		DS1.Agregar(3, 25);
		DS1.Agregar(1, 36);
		DS1.Agregar(21, 22);
		
		DS2.Agregar(5, 23);
		DS2.Agregar(3, 20);
		DS2.Agregar(1, 33);
		DS2.Agregar(2, 75);
		DS2.Agregar(8, 29);
		DS2.Agregar(4, 32);
		
		pila = ejercicio.Intercaladas(DS1, DS2);
		
		System.out.println("EJERCICIO 1.a");
		while(!pila.PilaVacia()) {
			System.out.println(pila.Tope());
			pila.Desapilar();
		}
		
		ConjuntoTDA clavesInterseccion = new ConjuntoDinamico();
		clavesInterseccion.InicializarConjunto();
		
		clavesInterseccion = ejercicio.Interseccion(DS1, DS2);
		
		System.out.println("EJERCICIO 1.b");
		while(!clavesInterseccion.ConjuntoVacio()) {
			System.out.println(clavesInterseccion.Elegir());
			clavesInterseccion.Sacar(clavesInterseccion.Elegir());;
		}

	}

}
