package EjerciciosPreParcial4;

public class ConjuntoDinamico implements ConjuntoTDA{
	class Nodo{
		int info;
		Nodo sig;
	}
	Nodo primero;

	public void InicializarConjunto() {
		primero = null;
	}

	public void Agregar(int x) {
		if(!Pertenece(x)) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			nuevo.sig = primero;
			primero = nuevo;
		}
		
	}

	public int Elegir() {
		return primero.info;
	}

	public boolean ConjuntoVacio() {
		return primero == null;
	}

	public void Sacar(int x) {
		if(primero.info == x) {
			primero = primero.sig;
		}else {
			Nodo actual = new Nodo();
			actual = primero;
			
			while(actual.sig != null && actual.sig.info != x) {
				actual = actual.sig;
			}
			if(actual.sig != null) {
				actual.sig = actual.sig.sig;
			}
		}
	}

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
}
