package ModeloParcial2;

public class ABB implements ArbolTDA{
	
	public class Nodo{
		int info;
		ArbolTDA hijoIzq;
		ArbolTDA hijoDer;
	}
	Nodo raiz;

	public boolean EsVacio() {
		return raiz == null;
	}

	public void InicializaArbol() {
		raiz = null;
	}

	public ArbolTDA HijoIzquierdo() {
		return raiz.hijoIzq;
	}

	public ArbolTDA HijoDerecho() {
		return raiz.hijoDer;
	}

	public int Raiz() {
		return raiz.info;
	}

	public void Agregar(int x) {
		if(raiz == null) {
			raiz = new Nodo();
			raiz.info = x;
			raiz.hijoIzq = new ABB();
			raiz.hijoIzq.InicializaArbol();
			raiz.hijoDer = new ABB();
			raiz.hijoDer.InicializaArbol();
		}else if(raiz.info>x) {
			raiz.hijoIzq.Agregar(x);
		}else if(raiz.info<x) {
			raiz.hijoDer.Agregar(x);
		}
	}

	public void Eliminar(int x) {	
		if(raiz != null) {
			if(raiz.info == x && raiz.hijoIzq.EsVacio() && raiz.hijoDer.EsVacio()) {
				raiz = null;
			}else if(raiz.info == x && !raiz.hijoIzq.EsVacio()) {
				raiz.info = mayor(raiz.hijoIzq);
				raiz.hijoIzq.Eliminar(x);
			}else if(raiz.info == x && raiz.hijoIzq.EsVacio()) {
				raiz.info = menor(raiz.hijoDer);
				raiz.hijoDer.Eliminar(x);
			}else if(raiz.info > x){
				raiz.hijoIzq.Eliminar(x);
			}else if(raiz.info < x) {
				raiz.hijoDer.Eliminar(x);
			}
		}
	}
	private int mayor(ArbolTDA a) {
		if (a.HijoDerecho() == null) {
			return a.Raiz();
		} else {
			return mayor(a.HijoDerecho());
		}
	}
	
	private int menor(ArbolTDA a) {
		if (a.HijoIzquierdo() == null) {
			return a.Raiz();
		} else {
			return menor(a.HijoIzquierdo());
		}
	}

}
