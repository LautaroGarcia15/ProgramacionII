package DiccionarioTDA;

public class DicSimpleDinamico implements DiccionarioSimpleTDA {
	class Nodo{
		int clave;
		int valor;
		Nodo sig;
	}
	Nodo primero;

	public void InicializarDiccionario() {
		primero = null;
	}

	public void Agregar(int clave, int valor) {
		Nodo actual = new Nodo();
		actual = primero;
		
		//si la clave esxite
		while(actual != null){
			if(actual.clave == clave) {
				actual.valor = valor;
				return;
			}
			actual = actual.sig;
		}
		
		//si la clave no exitse
		Nodo nuevo = new Nodo();
		nuevo.clave = clave;
		nuevo.valor = valor;
		nuevo.sig = primero;
		primero = nuevo;
		
	}

	public void Eliminar(int clave) {
		if(primero.clave == clave) {
			primero = primero.sig;
		}else {
			Nodo actual = new Nodo();
			while(actual.sig != null && actual.sig.clave != clave) {
				actual = actual.sig;
			}
			
			if(actual.sig != null) {
				actual.sig = actual.sig.sig;
			}
		}
	}

	public int Recuperar(int clave) {
		int valorEncontrado = 0;
		Nodo actual = new Nodo();
		actual = primero;
		
		while(actual != null) {
			if(actual.clave == clave) {
				valorEncontrado =  actual.valor;
			}
			actual = actual.sig;
		}
		return valorEncontrado;
	}

	public ConjuntoTDA Claves() {
		ConjuntoTDA conjuntoClaves = new ConjuntoDinamico();
		conjuntoClaves.InicializarConjunto();
		
		Nodo actual = primero;
		
		while(actual != null) {
			conjuntoClaves.Agregar(actual.clave);
			actual = actual.sig;
		}
		
		return conjuntoClaves;
	}

}
