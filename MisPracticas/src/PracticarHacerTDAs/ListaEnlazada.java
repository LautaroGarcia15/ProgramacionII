package PracticarHacerTDAs;

public class ListaEnlazada {
	Nodo primero;
	Nodo ultimo;
	
	public ListaEnlazada(){
		this.primero = new Nodo();
	}
	
	public void add(int x) {
		Nodo nuevo = new Nodo();
		nuevo.setInfo(x);
		
		Nodo actual = this.primero;
		while(actual.getSig() != null) {
			actual = actual.getSig();
		}
		
		actual.setSig(nuevo);
	}
	
	public void Eliminar(int x) {
		Nodo previo = this.primero;
		Nodo actual = previo.getSig();
		
		while(actual != null && actual.getInfo() != x) {
			previo = actual;
			actual = actual.getSig();
		}
		
		if(actual != null) {
			previo.setSig(actual.getSig());
		}
	}
	
	public boolean ListaVacia() {
		Nodo actual = this.primero;
		
		return actual == null;
	}
	
	public boolean existe(int x) {
		Nodo actual = this.primero;
		while(actual != null && actual.getInfo() != x) {
			actual = actual.getSig();
		}
		if(actual != null) {
			return true;
		}
		return false;
	}
	
}
