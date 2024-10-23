package ModeloParcial2;

public class Ejercicio1 {
	public static TDAPila Intercaladas(DiccionarioSimpleTDA DS1, DiccionarioSimpleTDA DS2) {
		TDAPila pila = new PilaDinamica();
		ConjuntoTDA clavesDS1 = new ConjuntoDinamico();
		ConjuntoTDA clavesDS2 = new ConjuntoDinamico();
		
		pila.InicializarPila();
		
		clavesDS1 = DS1.Claves();
		clavesDS2 = DS2.Claves();
		
		while(!clavesDS1.ConjuntoVacio() || !clavesDS2.ConjuntoVacio()) {
			
			if(!clavesDS1.ConjuntoVacio()) {
				pila.Apilar(clavesDS1.Elegir());
				clavesDS1.Sacar(clavesDS1.Elegir());
			}
			
			if(!clavesDS2.ConjuntoVacio()) {
				pila.Apilar(clavesDS2.Elegir());
				clavesDS2.Sacar(clavesDS2.Elegir());
			}
		}
		return pila;
	}
	
	public static ConjuntoTDA Interseccion(DiccionarioSimpleTDA DS1, DiccionarioSimpleTDA DS2) {
		ConjuntoTDA conjunto = new ConjuntoDinamico();
		ConjuntoTDA clavesDS1 = new ConjuntoDinamico();
		ConjuntoTDA clavesDS2 = new ConjuntoDinamico();
		
		conjunto.InicializarConjunto();
		
		clavesDS1 = DS1.Claves();
		clavesDS2 = DS2.Claves();
		
		while(!clavesDS1.ConjuntoVacio()) {
			if(clavesDS2.Pertenece(clavesDS1.Elegir())) {
				conjunto.Agregar(clavesDS1.Elegir());
			}
			clavesDS1.Sacar(clavesDS1.Elegir());
		}
		return conjunto;
	}
}
