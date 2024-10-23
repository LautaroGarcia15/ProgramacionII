package ModeloParcialEj2;

public class Main {

	public static void main(String[] args) {
		Ejercicio ejercicio = new Ejercicio();
		DiccionarioMultipleTDA diccionario = new DicMultipleA();
		TDAPila pila = new PilaTF();
		
		diccionario.InicializarDiccionario();
		
		diccionario.Agregar(1, 5);
		diccionario.Agregar(1, 3);
		diccionario.Agregar(2, 8);
		diccionario.Agregar(5, 7);
		diccionario.Agregar(6, 9);
		diccionario.Agregar(6, 1);
		diccionario.Agregar(6, 5);
		
		
		pila = ejercicio.valoresOrdenadosPila(diccionario);
		
		while(!pila.PilaVacia()) {
			System.out.println(pila.Tope());
			pila.Desapilar();
		}
	}

}
