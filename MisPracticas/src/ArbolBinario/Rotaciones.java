package ArbolBinario;

public class Rotaciones {
	public void preOrder(ArbolTDA a) {
		if(!a.EsVacio()) {
			System.out.println(a.Raiz());
			preOrder(a.HijoIzquierdo());
			preOrder(a.HijoDerecho());
		}
	}
	
	public void inOrder(ArbolTDA a) {
		if(!a.EsVacio()) {
			inOrder(a.HijoIzquierdo());
			System.out.println(a.Raiz());
			inOrder(a.HijoDerecho());
		}
	}
	
	public void postOrder(ArbolTDA a) {
		if(!a.EsVacio()) {
			postOrder(a.HijoIzquierdo());
			postOrder(a.HijoDerecho());
			System.out.println(a.Raiz());		
		}
	}
}
