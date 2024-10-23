package ArbolBinario;

public interface ArbolTDA{
	boolean EsVacio();    //Indica si el arbol está vacio
    void InicializaArbol();//Crea un arbol vacio
    ArbolTDA HijoIzquierdo();//Devuelve el sub-Arbol izquierdo
    ArbolTDA HijoDerecho();    //Devuelve el sub-Arbol derecho
    int Raiz();//Devuelve la raiz de un árbol, si es que existe.
    void Agregar(int x);    // agrega un elemento x
    void Eliminar(int x); // elimina un elemento x 
}
