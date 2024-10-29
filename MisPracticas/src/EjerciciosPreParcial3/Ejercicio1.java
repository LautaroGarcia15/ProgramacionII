package EjerciciosPreParcial3;

public class Ejercicio1 {
	public static TDAPila Intercaladas(DiccionarioSimpleTDA DS1, DiccionarioSimpleTDA DS2 ) {
		TDAPila pila = new PilaDinamica();
		pila.InicializarPila();
		
		ConjuntoTDA claves1 = new ConjuntoDinamico();
		ConjuntoTDA claves2 = new ConjuntoDinamico();
		
		claves1.InicializarConjunto();
		claves2.InicializarConjunto();
		
		claves1 = DS1.Claves();
		claves2 = DS2.Claves();
		
		
		while(!claves1.ConjuntoVacio() || !claves2.ConjuntoVacio()) {
			
			if(!claves1.ConjuntoVacio()) {
				pila.Apilar(claves1.Elegir());
				claves1.Sacar(claves1.Elegir());
			}
			
			if(!claves2.ConjuntoVacio()) {
				pila.Apilar(claves2.Elegir());
				claves2.Sacar(claves2.Elegir());
			}
		}
		
		return pila;
	}

	public static ConjuntoTDA Interseccion(DiccionarioSimpleTDA DS1, DiccionarioSimpleTDA DS2) {
		ConjuntoTDA claves1 = new ConjuntoDinamico();
		ConjuntoTDA claves2 = new ConjuntoDinamico();
		ConjuntoTDA clavesInterseccion = new ConjuntoDinamico();
		
		claves1.InicializarConjunto();
		claves2.InicializarConjunto();
		clavesInterseccion.InicializarConjunto();
		
		claves1 = DS1.Claves();
		claves2 = DS2.Claves();
		
		while(!claves1.ConjuntoVacio()) {
			if(claves2.Pertenece(claves1.Elegir())) {
				clavesInterseccion.Agregar(claves1.Elegir());
			}
			claves1.Sacar(claves1.Elegir());
		}
		
		return clavesInterseccion;
	}
}
