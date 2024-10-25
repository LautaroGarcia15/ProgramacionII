package EjerciciosPreParcial;

public class Ejercicio3 {
	
	public static ColaPrioridadTDA combinarColas(ColaPrioridadTDA cola1, ColaPrioridadTDA cola2) {
		ColaPrioridadTDA colaFinal = new ColaPrioridadDinamica();
		colaFinal.InicializarCola();
		
		while(!cola1.ColaVacia()) {
			colaFinal.AcolarPrioridad(cola1.Primero(), cola1.Prioridad());
			cola1.Desacolar();
		}
		
		while(!cola2.ColaVacia()) {
			colaFinal.AcolarPrioridad(cola2.Primero(), cola2.Prioridad());
			cola2.Desacolar();
		}
		
		return colaFinal;
	}
	
	public static ColaTDA InvertirColaPrioridad(ColaTDA cola) {
		ColaPrioridadTDA colaFinal = new ColaPrioridadDinamica();
		colaFinal.InicializarCola();
		
		int prioridad = 0;
		while(!cola.ColaVacia()) {
			colaFinal.AcolarPrioridad(cola.Primero(), prioridad);
			cola.Desacolar();
			prioridad++;
		}
		
		while(!colaFinal.ColaVacia()) {
			cola.Acolar(colaFinal.Primero());
			colaFinal.Desacolar();
		}
		
		return cola;
	}

}
