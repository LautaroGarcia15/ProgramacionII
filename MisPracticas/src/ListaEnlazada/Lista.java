package ListaEnlazada;

public class Lista {
	Nodo primero;
	Nodo ultimo;
	
	public Lista() {
		this.primero = new Nodo();
	}
	
	public void add(int x) {
		Nodo nuevo = new Nodo();
		nuevo.setInfo(x);
		
		Nodo pivote = new Nodo();
		pivote = this.primero;
		while(pivote.getNext() != null) {
			pivote = pivote.getNext();
		}
		pivote.setNext(nuevo);
	}
	
	public String toString(){
		Nodo pivote; 
		String out = "";
		pivote = primero.getNext();
		while(pivote != null) {
			out = out + "" + pivote.getInfo();
			pivote = pivote.getNext();
		}
		return out;
	}
	
	public Nodo existe(int value) {
		Nodo pivote;
		String out = "";
		
		pivote = primero.getNext();
		while(pivote != null) {
			if(pivote.getInfo() == value) {
				return pivote;
			}else {
				pivote = pivote.getNext();
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
