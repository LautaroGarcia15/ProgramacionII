package ColaConPrioridadTDA;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ColaPrioridadTDA colaPrioridadDinamica = new ColaPrioridadDinamica();
		colaPrioridadDinamica.InicializarCola();
		
		colaPrioridadDinamica.AcolarPrioridad(5, 1);
		colaPrioridadDinamica.AcolarPrioridad(6, 1);
		colaPrioridadDinamica.AcolarPrioridad(7, 1);
		colaPrioridadDinamica.AcolarPrioridad(9, 1);
		colaPrioridadDinamica.AcolarPrioridad(1, 2);
		
		System.out.println(encontrarPrioridad(colaPrioridadDinamica,1));
		
		/*ColaPrioridadTDA cola1 = new ColaPrioridadTDA1();
		ColaPrioridadTDA cola2 = new ColaPrioridadTDA1();
		ColaTDA colaNormal = new ColaEstrategia1();
		
		//INICIALIZACION DE COLAS
		cola1.InicializarCola();
		cola2.InicializarCola();
		colaNormal.InicializarCola();
		
		//CARGA DE DATOS 
		cola1.AcolarPrioridad(9, 2);
		cola1.AcolarPrioridad(8, 3);
		cola1.AcolarPrioridad(7, 1);
		cola1.AcolarPrioridad(6, 4);
		
		cola2.AcolarPrioridad(3, 4);
		cola2.AcolarPrioridad(4, 3);
		cola2.AcolarPrioridad(9, 1);
		cola2.AcolarPrioridad(5, 2);
		
		colaNormal.Acolar(5);
		colaNormal.Acolar(2);
		colaNormal.Acolar(4);
		colaNormal.Acolar(8);
		
		//CombinarColas(cola1, cola2);
		
		//InvertirCola(colaNormal);
		
		System.out.println(SumarPares(cola1));*/
		
	}
	//ejercicio Cola Con Prioridad Dinamica
	public static List encontrarPrioridad(ColaPrioridadTDA colaDinamica, int prioridad) {
		List<Integer> valores = new ArrayList<>();
		while(!colaDinamica.ColaVacia()){
			
			if(colaDinamica.Prioridad() == prioridad) {
				valores.add(colaDinamica.Primero());
			}
			
			colaDinamica.Desacolar();
			
		}
		return valores;
	}
	
	public static void CombinarColas(ColaPrioridadTDA c1, ColaPrioridadTDA c2) {
		ColaPrioridadTDA colaAux = new ColaPrioridadTDA1();
		colaAux.InicializarCola();
		
		while(!c2.ColaVacia() ) {
			colaAux.AcolarPrioridad(c2.Primero(), c2.Prioridad());
			c2.Desacolar();
		}
		
		while(!c1.ColaVacia() ) {
			colaAux.AcolarPrioridad(c1.Primero(), c1.Prioridad());
			c1.Desacolar();	
		}
		
		System.out.println(colaAux.Primero());
	}
	
	public static void InvertirCola(ColaTDA colaOriginal) {
		ColaPrioridadTDA colaAux = new ColaPrioridadTDA1();
		colaAux.InicializarCola();
		int a  = 0;
		
		while(!colaOriginal.ColaVacia()) {
			colaAux.AcolarPrioridad(colaOriginal.Primero(), a);
			colaOriginal.Desacolar();
			a++;
			System.out.println(colaAux.Primero());

		}

		while(!colaAux.ColaVacia()) {
			colaOriginal.Acolar(colaAux.Primero());
			colaAux.Desacolar();

			System.out.println(colaOriginal.Primero());
		}
	}
	
	public static int SumarPares(ColaPrioridadTDA cola) {
		int sumador = 0;
		
		while(!cola.ColaVacia()) {
			if(cola.Prioridad()%2==0) {
				sumador += cola.Primero();				
			}
			cola.Desacolar();
		}
		return sumador;
			
	}
}
