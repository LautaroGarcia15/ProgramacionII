package EjerciciosPreParcial2;

public class DicMultipleDinamico implements DiccionarioMultipleTDA{
	class Nodo{
		int clave;
		ConjuntoTDA valores;
		Nodo sig;
	}
	Nodo primero;

	public void InicializarDiccionario() {
		primero = null;
	}

	public void Agregar(int clave, int valor) {
		Nodo actual = new Nodo();
		actual = primero;
		
		//si la clave existe
		while(actual != null && actual.clave != clave) {
			actual = actual.sig;
		}
		
		//si no existe
		if(actual != null){
			actual.valores.Agregar(valor);
		}else {
			Nodo nuevo = new Nodo();
			nuevo.clave = clave;
			nuevo.valores = new ConjuntoDinamico();
			nuevo.valores.InicializarConjunto();
			nuevo.valores.Agregar(valor);
			nuevo.sig = primero;
			primero = nuevo;
		}
	}

	public void Eliminar(int clave) {
		if(primero.clave == clave) {
			primero = primero.sig;
		}else {
			Nodo actual = new Nodo();
			actual = primero;
			
			while(actual.sig != null && actual.sig.clave != clave) {
				actual = actual.sig;
			}
			
			if(actual.sig != null) {
				actual.sig = actual.sig.sig;
			}
		}
	}

	public void EliminarValor(int clave, int valor) {
		Nodo actual = new Nodo();
		
		while(actual.sig != null && actual.sig.clave != clave) {
			actual = actual.sig;
		}
		if(actual.sig != null) {
			actual.valores.Sacar(valor);
			
			if(actual.valores.ConjuntoVacio()) {
				Eliminar(clave);
			}
		}
	}

	public ConjuntoTDA Recuperar(int clave) {
		Nodo actual = new Nodo();
		actual = primero;
		
		while(actual != null && actual.clave != clave) {
			actual = actual.sig;
		}
		
		if(actual != null) {
			return actual.valores;
		}
		
		ConjuntoTDA conjuntoClaves = new ConjuntoDinamico();
		conjuntoClaves.InicializarConjunto();
		return conjuntoClaves;
	}

	public ConjuntoTDA Claves() {
		ConjuntoTDA conjuntoClaves = new ConjuntoDinamico();
		conjuntoClaves.InicializarConjunto();
		Nodo actual = new Nodo();
		actual = primero;
		
		while(actual != null) {
			conjuntoClaves.Agregar(actual.clave);
			actual = actual.sig;
		}
		return conjuntoClaves;
	}

}
