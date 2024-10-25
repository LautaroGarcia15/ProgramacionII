package EjerciciosPreParcial;

public class Ejercicio2 {
	public static ColaTDA InvertirCola(ColaTDA cola) {
		int a [] = new int [100];
		int pos = 0;
		
		while(!cola.ColaVacia()) {
			a[pos] = cola.Primero();
			cola.Desacolar();
			pos++;
		}
		
		for(int i = pos - 1  ;i >= 0 && a[i] != 0; i--) {
			cola.Acolar(a[i]);
		}
		
		return cola;
	}
}
