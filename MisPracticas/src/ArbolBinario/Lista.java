package ArbolBinario;

public class Lista {
	Nodo primero;
	Nodo ultimo;
	
	public Lista() {
		this.primero = new Nodo();
	}
	
	public void add(int x) {
		Nodo nuevo = new Nodo();
		nuevo.setInfo(x);
		
		Nodo actual = new Nodo();
		actual = this.primero;
		while(actual.getNext() != null) {
			actual = actual.getNext();
		}
		actual.setNext(nuevo);
	}
	
	public String toString(){
		Nodo actual; 
		String out = "";
		actual = primero.getNext();
		while(actual != null) {
			out = out + "" + actual.getInfo();
			actual = actual.getNext();
		}
		return out;
	}
	
	public Nodo existe(int value) {
		Nodo actual;
		String out = "";
		
		actual = primero.getNext();
		while(actual != null) {
			if(actual.getInfo() == value) {
				return actual;
			}else {
				actual = actual.getNext();
			}
		}
		return null;
	}
	
	public void eliminar(int value) {
		Nodo prev;
		Nodo pivote;
		
		prev = this.primero;
		pivote = prev.getNext();
		
		while ((pivote != null) && (pivote.getInfo() != value)) {
			prev = pivote;
			pivote = prev.getNext();
		}
		
		if(pivote != null) {
			prev.setNext(pivote.getNext());
		}
		
	}
	
	public boolean listaVacia() {
		Nodo pivote;
		
		pivote = primero.getNext();
		if (pivote == null) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
