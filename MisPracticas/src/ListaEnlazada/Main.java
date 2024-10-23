package ListaEnlazada;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.add(5);
		lista.add(6);
		lista.add(8);
		lista.add(9);

		
		System.out.println(lista.toString());
		
		lista.eliminar(6);
		
		System.out.println(lista.toString());
		
		System.out.println(lista.existe(6));
		System.out.println(lista.existe(8));
		
		System.out.println(lista.listaVacia());
		
		lista.eliminar(5);
		lista.eliminar(8);
		lista.eliminar(9);
		
		System.out.println(lista.listaVacia());
		
		
	}

}
