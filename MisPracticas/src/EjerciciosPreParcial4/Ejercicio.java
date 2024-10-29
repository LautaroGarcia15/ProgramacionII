package EjerciciosPreParcial4;

public class Ejercicio {
	public static TDAPila valoresMaximos(DiccionarioMultipleTDA dic) {
		TDAPila pila = new PilaDinamica();
		pila.InicializarPila();
		
		ConjuntoTDA claves = dic.Claves();
		
		while(!claves.ConjuntoVacio()) {
			ConjuntoTDA valores = dic.Recuperar(claves.Elegir());
			int ValorMax = 0;
			while(!valores.ConjuntoVacio()) {
				if(valores.Elegir() > ValorMax) {
					ValorMax = valores.Elegir();
				}
				valores.Sacar(valores.Elegir());
			}
			pila.Apilar(ValorMax);
			claves.Sacar(claves.Elegir());
		}
		
		return pila;
		
	}
	
	public static int ClaveConMasValores(DiccionarioMultipleTDA dic) {
		int claveMayor = 0;
		int cantValores = 0;
		ConjuntoTDA claves = dic.Claves();
		
		while(!claves.ConjuntoVacio()) {
			ConjuntoTDA valores = dic.Recuperar(claves.Elegir());
			int cantValoresActual = 0;
			while(!valores.ConjuntoVacio()) {
				cantValoresActual++;
				valores.Sacar(valores.Elegir());
			}
			if (cantValoresActual > cantValores) {
				cantValores = cantValoresActual;
				claveMayor = claves.Elegir();
			}
			claves.Sacar(claves.Elegir());
		}
		
		return claveMayor;
	}
}
