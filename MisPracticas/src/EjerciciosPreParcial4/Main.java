package EjerciciosPreParcial4;

public class Main {

	public static void main(String[] args) {
		Ejercicio ejercicio = new Ejercicio();
		DiccionarioMultipleTDA dic = new DicMultipleDinamico();
		TDAPila pila = new PilaDinamica();
		
		dic.InicializarDiccionario();
		pila.InicializarPila();
		
		dic.Agregar(3, 1);
		
		
		dic.Agregar(5, 3);
		
		dic.Agregar(1, 4);
		dic.Agregar(1, 2);
		
		dic.Agregar(7, 4);
		dic.Agregar(7, 5);
		
		/*pila = ejercicio.valoresMaximos(dic);
		
		while(!pila.PilaVacia()) {
			System.out.println(pila.Tope());
			pila.Desapilar();
		}*/
		
		System.out.println("La clave con mayor cantidad de valores es: "+ ejercicio.ClaveConMasValores(dic));
		
	}

}
