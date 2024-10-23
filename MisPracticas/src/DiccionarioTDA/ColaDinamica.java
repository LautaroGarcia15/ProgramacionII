package DiccionarioTDA;

public class ColaDinamica implements ColaTDA {
	class Nodo{
		int info;
		Nodo sig;
	}
	Nodo primero;
	Nodo ultimo;

	public void InicializarCola() {
		primero = null;
		ultimo = null;
	}

	public void Acolar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = null;
		
        // Agregar directamente el nuevo nodo al final
        if (ultimo != null) {
        	ultimo.sig = nuevo;
        }
        ultimo = nuevo;

        // Si la cola estaba vacía, ahora el frente también es el nuevo nodo
        if (primero == null) {
        	primero = ultimo;
        }
	}

	public void Desacolar() {
		primero = primero.sig;
		
		if(primero == null) {
			ultimo = null;
		}
	}

	public boolean ColaVacia() {
		return primero == null;
	}

	public int Primero() {

		return primero.info;
	}

}
