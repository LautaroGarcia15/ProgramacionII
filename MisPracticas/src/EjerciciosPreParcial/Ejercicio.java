package EjerciciosPreParcial;

public class Ejercicio {
	
	public static TDAPila PasarPila(TDAPila pila1, TDAPila pila2) {
		while (!pila1.PilaVacia()) {
			pila2.Apilar(pila1.Tope());
			pila1.Desapilar();;
		}
		return pila2;
	}
	
	public static TDAPila PasarPilaIgual(TDAPila pila1, TDAPila pila2) {
		TDAPila aux = new PilaDinamica();
		while (!pila1.PilaVacia()) {
			aux.Apilar(pila1.Tope());
			pila1.Desapilar();;
		}
		
		while (!aux.PilaVacia()) {
			pila2.Apilar(aux.Tope());
			aux.Desapilar();;
		}
		return pila2;
	}
	
	public static TDAPila InvertirPila(TDAPila pila1) {
		TDAPila aux1 = new PilaDinamica();
		TDAPila aux2 = new PilaDinamica();
		
		while (!pila1.PilaVacia()) {
			aux1.Apilar(pila1.Tope());
			pila1.Desapilar();;
		}
		while (!aux1.PilaVacia()) {
			aux2.Apilar(aux1.Tope());
			aux1.Desapilar();;
		}
		
		while (!aux2.PilaVacia()) {
			pila1.Apilar(aux2.Tope());
			aux2.Desapilar();;
		}
		return pila1;
	}
	
	public static int VerificarOcurrencia(TDAPila pila1, int x) {
		int contador = 0;
		while(!pila1.PilaVacia()) {
			if(pila1.Tope() == x) {
				contador ++;
			}
			pila1.Desapilar();
		}
		return contador;
	}
	
	public static TDAPila eliminarImpares(TDAPila pila1) {
		TDAPila aux1 = new PilaDinamica();
		aux1.InicializarPila();
		while (!pila1.PilaVacia()) {
			
			if(pila1.Tope() % 2 == 0) { 
				aux1.Apilar(pila1.Tope());
				}
			pila1.Desapilar();;
		}
		
		while (!aux1.PilaVacia()) {
			pila1.Apilar(aux1.Tope());
			aux1.Desapilar();;
		}
		
		return pila1;
	}
	
}
