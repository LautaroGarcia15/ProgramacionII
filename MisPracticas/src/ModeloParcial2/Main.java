package ModeloParcial2;

public class Main {

	public static void main(String[] args) {
		Ejercicio1 ejercicio = new Ejercicio1();
		DiccionarioSimpleTDA DS1 = new DicSimpleDinamico();
		DiccionarioSimpleTDA DS2 = new DicSimpleDinamico();
		TDAPila pila = new PilaDinamica();
		ConjuntoTDA conjunto = new ConjuntoDinamico();
		
		DS1.InicializarDiccionario();
		DS2.InicializarDiccionario();
		
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
		
		System.out.println("Ejercicio1.a");
		while(!pila.PilaVacia()) {
			System.out.println(pila.Tope());
			pila.Desapilar();
		}
		
		conjunto = ejercicio.Interseccion(DS1, DS2);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Ejercicio1.b");
		while(!conjunto.ConjuntoVacio()) {
			System.out.println(conjunto.Elegir());
			conjunto.Sacar(conjunto.Elegir());
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Ejercicio2.a");
		
		Ejercicio2 ejercicio2 = new Ejercicio2();
		
		ArbolTDA arbol1 = new ABB();
		
		ConjuntoTDA impares = new ConjuntoDinamico();
		impares.InicializarConjunto();
		
		int nivel = 0;
		
		arbol1.InicializaArbol();
		arbol1.Agregar(10);
		arbol1.Agregar(1);
		arbol1.Agregar(7);
		arbol1.Agregar(20);
		arbol1.Agregar(15);
		arbol1.Agregar(30);
		arbol1.Agregar(14);
		arbol1.Agregar(18);
	
		ejercicio2.agarrarImpares(arbol1, impares, nivel);
		
		while(!impares.ConjuntoVacio()) {
			System.out.println(impares.Elegir());
			impares.Sacar(impares.Elegir());
		}
		
		
	}
}
