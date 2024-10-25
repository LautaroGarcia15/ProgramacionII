package EjerciciosPreParcial2;

public class ColaPrioridadDinamica implements ColaPrioridadTDA {
	class Nodo{
		int info;
		int prioridad;
		Nodo sig;
	}
	Nodo primero;

	public void InicializarCola() {
		primero = null;
	}

	public void AcolarPrioridad(int x, int prioridad) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.prioridad = prioridad;
		
		if(primero == null || prioridad > primero.prioridad) {
			nuevo.sig = primero;
			primero = nuevo;
			
		}else {
			
			Nodo actual = primero;
			while(actual.sig != null && actual.sig.prioridad >= prioridad) {
				actual = actual.sig;
			}
			
			nuevo.sig = actual.sig;
			actual.sig = nuevo;
		}
	}

	public void Desacolar() {
		if(primero != null) {
			primero = primero.sig;
		}
	}

	public boolean ColaVacia() {
		return primero == null;
	}

	public int Primero() {
		return primero.info;
	}

	public int Prioridad() {
		return primero.prioridad;
	}

}
