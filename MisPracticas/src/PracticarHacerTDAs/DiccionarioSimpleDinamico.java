package PracticarHacerTDAs;

public class DiccionarioSimpleDinamico implements DiccionarioSimpleTDA{
	class Nodo{
		int clave;
		int valor;
		Nodo sig;
	}
	Nodo primero;

	@Override
	public void InicializarDiccionario() {
		primero = null;
	}

	@Override
	public void Agregar(int clave, int valor) {
		Nodo actual = primero;
		
		while(actual != null) {
			if(actual.clave == clave) {
				actual.valor = valor;
				return;
			}
			actual = actual.sig;
		}
		
		Nodo nuevo = new Nodo();
		nuevo.clave = clave;
		nuevo.valor = valor;
		nuevo.sig = primero;
		primero = nuevo;
	}

	@Override
	public void Eliminar(int clave) {
		if(primero.clave == clave) {
			primero = primero.sig;
		}else{
			Nodo actual = primero;
			while(actual.sig != null && actual.sig.clave != clave) {
				actual = actual.sig;
			}
			if(actual.sig != null) {
				actual.sig = actual.sig.sig;
			}
		}
	}

	@Override
	public int Recuperar(int clave) {
		int ValorEncontrado = 0;
		Nodo actual = primero;
		
		while(actual != null) {
			if(actual.clave == clave) {
				ValorEncontrado = actual.valor;
			}
			actual = actual.sig;
		}
		return ValorEncontrado;
	}

	@Override
	public ConjuntoTDA Claves() {
		ConjuntoTDA Claves = new ConjuntoDinamico();
		Claves.InicializarConjunto();
		
		Nodo actual = primero;
		while(actual != null) {
			Claves.Agregar(actual.clave);
			actual = actual.sig;
		}
		return Claves;
	}

}
