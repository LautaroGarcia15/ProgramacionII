package EjerciciosPreParcial;

public class Main {

	public static void main(String[] args) {
		Ejercicio ejercicio1 = new Ejercicio();
		TDAPila pila1 = new PilaDinamica();
		TDAPila pila2 = new PilaDinamica();
		
		pila1.InicializarPila();
		pila2.InicializarPila();
		
		pila1.Apilar(1);
		pila1.Apilar(2);
		pila1.Apilar(3);
		pila1.Apilar(4);
		pila1.Apilar(5);
		pila1.Apilar(2);
		pila1.Apilar(2);
		pila1.Apilar(2);
		
		//ejercicio1.PasarPila(pila1, pila2);
		
		//ejercicio1.PasarPilaIgual(pila1, pila2);
		
		while(!pila2.PilaVacia()) {
			System.out.println(pila2.Tope());
			pila2.Desapilar();
		}
		
		//ejercicio1.InvertirPila(pila1);
		
		ejercicio1.eliminarImpares(pila1);
		
		while(!pila1.PilaVacia()) {
			System.out.println(pila1.Tope());
			pila1.Desapilar();
		}
		
		//System.out.println(ejercicio1.VerificarOcurrencia(pila1, 2));
		
		System.out.println("EJERCICIO COLAS");
		
		Ejercicio2 ejercicio2 = new Ejercicio2();
		ColaTDA cola = new ColaDinamica();
		cola.InicializarCola();
		
		cola.Acolar(1);
		cola.Acolar(5);
		cola.Acolar(10);
		cola.Acolar(9);
		cola.Acolar(2);
		
		ejercicio2.InvertirCola(cola);
		
		while(!cola.ColaVacia()) {
			System.out.println(cola.Primero());
			cola.Desacolar();
		}
		
		System.out.println("EJERCICIO COLAS CON PRIORIDAD");
		Ejercicio3 ejercicio3 = new Ejercicio3();
		ColaPrioridadTDA cola1 = new ColaPrioridadDinamica();
		ColaPrioridadTDA cola2 = new ColaPrioridadDinamica();
		ColaPrioridadTDA colaFinal = new ColaPrioridadDinamica();
		colaFinal.InicializarCola();
		
		cola1.InicializarCola();
		cola2.InicializarCola();
		
		cola1.AcolarPrioridad(8, 1);
		cola1.AcolarPrioridad(6, 2);
		cola1.AcolarPrioridad(4, 3);
		
		cola2.AcolarPrioridad(5, 3);
		cola2.AcolarPrioridad(2, 4);
		cola2.AcolarPrioridad(9, 5);
		
		colaFinal = ejercicio3.combinarColas(cola1, cola2);
		
		while(!colaFinal.ColaVacia()) {
			System.out.println(colaFinal.Primero());
			colaFinal.Desacolar();
		}
		
		ColaTDA cola3 = new ColaDinamica();
		cola3.InicializarCola();
		
		cola3.Acolar(8);
		cola3.Acolar(5);
		cola3.Acolar(2);
		cola3.Acolar(7);
		
		System.out.println("EJERCICIO COLAS CON PRIORIDAD 2");
		
		ejercicio3.InvertirColaPrioridad(cola3);
		while(!cola3.ColaVacia()) {
			System.out.println(cola3.Primero());
			cola3.Desacolar();
		}
	}

}
