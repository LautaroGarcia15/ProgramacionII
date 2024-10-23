package PracticarHacerTDAs;

public class ColaPrioridadDinamica implements ColaPrioridadTDA{
	class Nodo{
		int info;
		int prioridad;
		Nodo sig;
	}
	Nodo primero;

	@Override
	public void InicializarCola() {
		primero= null;
	}

	@Override
	public void Acolar(int x, int prioridad) {
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
			nuevo.sig =actual.sig;
			actual.sig = nuevo;
		}
	}

	@Override
	public void Desacolar() {
		if(primero != null) {
			primero = primero.sig;
		}
	}

	@Override
	public boolean ColaVacia() {
		return primero == null;
	}

	@Override
	public int Primero() {
		return primero.info;
	}

	@Override
	public int Priridad() {
		return primero.prioridad;
	}

}
