package ArbolBinario;

public class Main {

	public static void main(String[] args) {
		ArbolTDA arbol = new ABB();
		Lista lista = new Lista();
		arbol.InicializaArbol();
		
		arbol.Agregar(5);
		arbol.Agregar(9);
		arbol.Agregar(8);
		arbol.Agregar(7);
		arbol.Agregar(2);
		arbol.Agregar(1);
		arbol.Agregar(3);
		
		AgarrarHojas(arbol,lista);
		System.out.println(lista.toString());
	}
	
	public static void AgarrarHojas(ArbolTDA arbol, Lista lista) {
		if(!arbol.EsVacio()){
			if(arbol.HijoDerecho().EsVacio() && arbol.HijoIzquierdo().EsVacio()) {
				lista.add(arbol.Raiz());
			}
			if(!arbol.HijoDerecho().EsVacio()) {
				AgarrarHojas(arbol.HijoDerecho(), lista);
			}
			if(!arbol.HijoIzquierdo().EsVacio()) {
			AgarrarHojas(arbol.HijoIzquierdo(), lista);
			}
		}
	}
	
	public static void alturas(ArbolTDA arbol, Lista lista, int altura) {
		int nivel = altura;
		if(!arbol.EsVacio()) {
			lista.add(arbol.Raiz()  nivel); 
		}
	}

}
