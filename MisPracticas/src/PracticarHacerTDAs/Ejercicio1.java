package PracticarHacerTDAs;

public class Ejercicio1 {
	public static PilaTDA ClavesAPila(DiccionarioMultipleTDA diccionario) {
		PilaTDA pila = new PilaDinamica();
		pila.inicializarPila();
		ConjuntoTDA Claves = new ConjuntoDinamico();
		Claves = diccionario.Claves();
		
		while(!Claves.ConjuntoVacio()) {
			pila.Agregar(Claves.Elegir());
			Claves.Sacar(Claves.Elegir());
		}
		return pila;
	}
	
	
}
