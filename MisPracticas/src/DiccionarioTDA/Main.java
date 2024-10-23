package DiccionarioTDA;

public class Main {

	public static void main(String[] args) {
		DiccionarioMultipleTDA dicMultiple = new DicMultipleDinamico();
		ColaPrioridadTDA colaPrioridad = new ColaPrioridadDinamica();
		
		dicMultiple.InicializarDiccionario();
		colaPrioridad.InicializarCola();
		
		colaPrioridad.AcolarPrioridad(5, 1);
		colaPrioridad.AcolarPrioridad(6, 1);
		colaPrioridad.AcolarPrioridad(7, 1);
		colaPrioridad.AcolarPrioridad(9, 2);
		colaPrioridad.AcolarPrioridad(1, 2);
		colaPrioridad.AcolarPrioridad(8, 3);
		colaPrioridad.AcolarPrioridad(3, 4);
		
		System.out.println(pasarColaPrioridadDicMultiple(colaPrioridad,dicMultiple).Recuperar(1).Elegir());
		System.out.println(pasarColaPrioridadDicMultiple(colaPrioridad,dicMultiple).Recuperar(2).Elegir());
		System.out.println(pasarColaPrioridadDicMultiple(colaPrioridad,dicMultiple).Recuperar(3).Elegir());
		System.out.println(pasarColaPrioridadDicMultiple(colaPrioridad,dicMultiple).Recuperar(4).Elegir());

		
		/*ColaTDA cola = new ColaDinamica();
		DiccionarioSimpleTDA diccionarioSimple = new DicSimpleDinamico();
		
		cola.InicializarCola();
		diccionarioSimple.InicializarDiccionario();
		
		cola.Acolar(6);
		cola.Acolar(2);
		cola.Acolar(7);
		cola.Acolar(8);
		cola.Acolar(5);
        
        System.out.println(pasarColaDicSimple(cola, diccionarioSimple).Recuperar(1));
        System.out.println(pasarColaDicSimple(cola, diccionarioSimple).Recuperar(2));
        System.out.println(pasarColaDicSimple(cola, diccionarioSimple).Recuperar(3));
        System.out.println(pasarColaDicSimple(cola, diccionarioSimple).Recuperar(4));
        System.out.println(pasarColaDicSimple(cola, diccionarioSimple).Recuperar(5));*/
	}
	//ejercicio de diccionario simple dinamico
	public static DiccionarioSimpleTDA pasarColaDicSimple(ColaTDA cola, DiccionarioSimpleTDA dicSimple) {
		int contador = 1;
		while(!cola.ColaVacia()) {
			dicSimple.Agregar(contador, cola.Primero());
			cola.Desacolar();
			contador++;
		}
		return dicSimple;
	}
	
	public static DiccionarioMultipleTDA pasarColaPrioridadDicMultiple(ColaPrioridadTDA cola,DiccionarioMultipleTDA dicMultiple){
		while(!cola.ColaVacia()) {
			dicMultiple.Agregar(cola.Prioridad(), cola.Primero());
			cola.Desacolar();
		}
		return dicMultiple;
	}
	
}
