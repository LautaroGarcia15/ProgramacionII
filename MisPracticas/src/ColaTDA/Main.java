package ColaTDA;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ColaTDA cola1 = new ColaEstrategia1();
		ColaTDA cola2 = new ColaEstrategia2();
		ColaTDA cola3 = new ColaEstrategia3();
		ColaTDA cola4 = new ColaEstrategia1();
		
		//Inicializacion de colas
		
		cola1.InicializarCola();
		cola2.InicializarCola();
		cola3.InicializarCola();
		cola4.InicializarCola();
		
		//COLA1
		cola1.Acolar(1);
		cola1.Acolar(5);
		cola1.Acolar(9);
		cola1.Acolar(3);
		
		//COLA2
		cola2.Acolar(0);
		cola2.Acolar(2);
		cola2.Acolar(4);
		cola2.Acolar(3);
		
		//COLA3
		cola3.Acolar(7);
		cola3.Acolar(4);
		cola3.Acolar(5);
		cola3.Acolar(6);
		
		//pasarDeUnaColaAOtra(cola1, cola4);
		
		//System.out.println(ComparacionPrimeroUltimo(cola1,cola2));
		
		//invertirColaPilas(cola1);
		
		//invertirCola(cola1);
		
	}
	
	public static void pasarDeUnaColaAOtra(ColaTDA origen, ColaTDA destino) {
		while(!origen.ColaVacia()) {
			destino.Acolar(origen.Primero());
			origen.Desacolar();
		}
	}
	
	public static void invertirCola(ColaTDA cola) { 
		ArrayList<Integer> aux = new ArrayList<>();
		int i;
		
		while(!cola.ColaVacia()) {
			aux.add(cola.Primero());
			cola.Desacolar();
		}
		
		for(i = aux.size() -1; i >= 0 ;i--) {
			cola.Acolar(aux.get(i));
			System.out.println(cola.Primero());
		}
	}
	
	public static void invertirColaPilas(ColaTDA cola) {
		TDAPila pila = new PilaTF();
		
		pila.InicializarPila();
		
		while(!cola.ColaVacia()) {
			pila.Apilar(cola.Primero());
			cola.Desacolar();
		}
		
		while(!pila.PilaVacia()) {
			cola.Acolar(pila.Tope());
			pila.Desapilar();
			
			System.out.println(cola.Primero());
		}
	}
	
	public static boolean ComparacionPrimeroUltimo(ColaTDA c1, ColaTDA c2) {
		int ultimoC1 = 0;
		int ultimoC2 = 0;
		
		while (!c1.ColaVacia()) {
			ultimoC1 = c1.Primero();
			c1.Desacolar();
		}
		
		while (!c2.ColaVacia()) {
			ultimoC2 = c2.Primero();
			c2.Desacolar();
		}
		return ultimoC1 == ultimoC2;
	}
} 