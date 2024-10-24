package PracticarHacerTDAs;

public class ConjuntoDinamico implements ConjuntoTDA{
	class Nodo{
		int info;
		Nodo sig;
	}
	Nodo primero;

	@Override
	public void InicializarConjunto() {
		primero = null;
	}

	@Override
	public void Agregar(int x) {
		if(!Pertenece(x)) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			nuevo.sig = primero;
			primero = nuevo;
		}
	}

	@Override
	public void Sacar(int x) {
		if(primero.info == x) {
			primero = primero.sig;
		}else {
			Nodo actual = primero;
			while(actual.sig != null && actual.sig.info != x) {
				actual = actual.sig;
			}
			if(actual.sig != null) {
				actual.sig = actual.sig.sig;
			}
		}
	}

	@Override
	public int Elegir() {
		return primero.info;
	}

	@Override
	public boolean Pertenece(int x) {
		Nodo actual = primero;
		
		while(actual != null) {
			if(actual.info == x) {
				return true;
			}
			actual = actual.sig;
		}
		return false;
	}

	@Override
	public boolean ConjuntoVacio() {
		return primero == null;
	}

	
}
