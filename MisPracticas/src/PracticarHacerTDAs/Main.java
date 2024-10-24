package PracticarHacerTDAs;

public class Main {

	public static void main(String[] args) {
		Ejercicio1 ejercicio1 = new Ejercicio1();
		DiccionarioMultipleTDA diccionario = new DiccionarioMultipleDinamico();
		PilaTDA pila = new PilaDinamica();
		
		diccionario.InicializarDiccionario();
		diccionario.AgregarValor(5, 8);
		diccionario.AgregarValor(6, 9);
		diccionario.AgregarValor(5, 3);
		diccionario.AgregarValor(8, 4);
		diccionario.AgregarValor(7, 8);
		
		pila = ejercicio1.ClavesAPila(diccionario);
		
		while(!pila.PilaVacia()) {
			System.out.println(pila.Tope());
			pila.Deasapilar();
		}
	}

}
