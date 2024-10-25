package EjerciciosPreParcial2;

public class Ejercicio {
	public static TDAPila ValoresMax(DiccionarioMultipleTDA diccionario) {
		TDAPila pila = new PilaDinamica();
		pila.InicializarPila();
		
		ConjuntoTDA claves = new ConjuntoDinamico();
		claves.InicializarConjunto();
		
		claves = diccionario.Claves();
		int claveMayor = 0;
		
		while(!claves.ConjuntoVacio()) {
			if(claves.Elegir() > claveMayor) {
				claveMayor = claves.Elegir();
			}
			claves.Sacar(claves.Elegir());
		}
		
		ConjuntoTDA valores = new ConjuntoDinamico();
		valores.InicializarConjunto();
		
		valores = diccionario.Recuperar(claveMayor);
		
		ColaPrioridadTDA colaPrioridad = new ColaPrioridadDinamica();
		colaPrioridad.InicializarCola();
		
		while(!valores.ConjuntoVacio()) {
			int valor = valores.Elegir();
			colaPrioridad.AcolarPrioridad(valor, valor);
			valores.Sacar(valor);
		}
		
		while(!colaPrioridad.ColaVacia()) {
			pila.Apilar(colaPrioridad.Primero());
			colaPrioridad.Desacolar();
		}
		
		return pila;
	} 

}
