package PilaTDA;

public class Main {

	public static void main(String[] args) {
		TDAPila pila = new PilaDinamica();
		
		pila.InicializarPila();
		
		pila.Apilar(2);
		pila.Apilar(8);
		pila.Apilar(5);
		pila.Apilar(3);
		
		System.out.println( pila.Tope());
		
		pila.Desapilar();
		
		pila.PilaVacia();
		
		System.out.println( pila.Tope());
		
		
		/*TDAPila pila1 = new PilaTI(); //Este tipo de pilas sirve mas para pasar de una pila a otra
		TDAPila pila2 = new PilaTF();
		TDAPila pila3 = new PilaTI();
		TDAPila pila4 = new PilaTF();
		TDAPila pila5 = new PilaTI();

		
		pila1.InicializarPila();
		pila1.Apilar(5);
		pila1.Apilar(7);
		pila1.Apilar(2);
		pila1.Apilar(1);
		
		pila2.InicializarPila();
		pila2.Apilar(4);
		pila2.Apilar(9);
		pila2.Apilar(3);
		pila2.Apilar(6);
		pila2.Apilar(4);
		pila2.Apilar(7);
		
		pila3.InicializarPila();
		pila4.InicializarPila();
		pila5.InicializarPila();
		
		//pasarPila(pila1,pila3); 
		
		//copiarPila(pila1,pila3,pila5);
		
		//eliminarElementosImpares(pila2,pila4);
		
		//System.out.println(verificarOcurrencia(pila2,pila4,7));
		
		//System.out.println(verificarOcurrencia(pila2,pila4,4));
		
		InvertirPila(pila1);
		
	}
	public static void pasarPila(TDAPila origen, TDAPila destino) {
		while(!origen.PilaVacia()) {
			destino.Apilar(origen.Tope());
			origen.Desapilar();
			System.out.println(destino.Tope());
		}
	}
	
	public static void copiarPila(TDAPila origen, TDAPila aux, TDAPila destino) {
		while(!origen.PilaVacia()) {
			aux.Apilar(origen.Tope());
			origen.Desapilar();
		}
		while(!aux.PilaVacia()){
			destino.Apilar(aux.Tope());
			aux.Desapilar();
			System.out.println(destino.Tope());
		}
	}
	
	public static void eliminarElementosImpares(TDAPila pilaOrigen, TDAPila pilaAux) {
			while (!pilaOrigen.PilaVacia()) {
				if(pilaOrigen.Tope() % 2 == 0) {
					pilaAux.Apilar(pilaOrigen.Tope());
				}
				pilaOrigen.Desapilar();
			}
			
			while (!pilaAux.PilaVacia()) {
				pilaOrigen.Apilar(pilaAux.Tope());
				pilaAux.Desapilar();
				System.out.println(pilaOrigen.Tope());
			}
	}
	
	public static boolean verificarOcurrencia(TDAPila original, TDAPila aux, int x) {
		int contador = 0;
		
		while(!original.PilaVacia()) {
			int elemento = original.Tope();
			aux.Apilar(original.Tope());
			original.Desapilar();
			
			if(elemento == x) {
				contador +=1;
			}
		}
		
		while (!aux.PilaVacia()) {
	        original.Apilar(aux.Tope());
	        aux.Desapilar();
	    }
		
		return contador >= 2;

	}
	
	public static void InvertirPila(TDAPila pila) {
		TDAPila pilaAux1 = new PilaTI();
		TDAPila pilaAux2 = new PilaTI();
		
		pilaAux1.InicializarPila();
		pilaAux2.InicializarPila();
		
		while(!pila.PilaVacia()) {
			pilaAux1.Apilar(pila.Tope());
			pila.Desapilar();
		}
		
		while(!pilaAux1.PilaVacia()) {
			pilaAux2.Apilar(pilaAux1.Tope());
			pilaAux1.Desapilar();
		}
		
		while(!pilaAux2.PilaVacia()) {
			pila.Apilar(pilaAux2.Tope());
			pilaAux2.Desapilar();
			System.out.println(pila.Tope());
		}*/

	}

}
