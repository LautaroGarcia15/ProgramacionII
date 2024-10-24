package PracticarHacerTDAs;

public class DiccionarioMultipleDinamico implements DiccionarioMultipleTDA{
	class Nodo{
		int clave;
		ConjuntoTDA valores;
		Nodo sig;
	}
	Nodo primero;

	@Override
	public void InicializarDiccionario() {
		primero = null;
	}

	@Override
	public void AgregarValor(int clave, int valor) {
		Nodo actual = primero;
		while (actual != null) {
			if(actual.clave == clave) {
				actual.valores.Agregar(valor);
				return;
			}
			actual = actual.sig;
		}
		
		Nodo nuevo = new Nodo();
		nuevo.clave = clave;
		nuevo.valores = new ConjuntoDinamico();
		nuevo.valores.InicializarConjunto();
		nuevo.valores.Agregar(valor);
		nuevo.sig = primero;
		primero = nuevo;
	}

	@Override
	public void EliminarClave(int clave) {
		if(primero.clave == clave) {
			primero = primero.sig;
		}else {
			Nodo actual = primero;
			while(actual.sig != null && actual.sig.clave != clave) {
				actual = actual.sig;
			}
			if(actual != null) {
				actual.sig = actual.sig.sig;
			}
		}
	}

	@Override
	public void EliminarValor(int valor) {
		Nodo actual = primero;
		while(actual != null) {
			if(actual.valores.Pertenece(valor)) {
				actual.valores.Sacar(valor);
			}
			actual = actual.sig;
		}
	}

	@Override
	public ConjuntoTDA Recuperar(int clave) {
		Nodo actual = primero;
		while(actual != null) {
			if(actual.clave == clave) {
				return actual.valores;
			}
		}
		ConjuntoTDA conjuntoVacio = new ConjuntoDinamico();
		conjuntoVacio.InicializarConjunto();
		return conjuntoVacio;
	}

	@Override
	public ConjuntoTDA Claves() {
		ConjuntoTDA Claves = new ConjuntoDinamico();
		Claves.InicializarConjunto();
		
		Nodo actual = primero;
		while(actual!= null) {
			Claves.Agregar(actual.clave);
			actual = actual.sig;
		}
		return Claves;
	}

}
