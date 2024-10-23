package ModeloParcialEj2;

public class Ejercicio {
	
	public TDAPila valoresOrdenadosPila(DiccionarioMultipleTDA diccionario) {
		TDAPila pila = new PilaTF();
		ConjuntoTDA claves = new ConjuntoTA();
		ConjuntoTDA valores = new ConjuntoTA();
		int[] valoresLista = new int[100]; 
		
		claves = diccionario.Claves();
		int claveMayor  = 0;
		int clave = 0;
		int pos = 0;
		int valor  = 0;
		
		while(!claves.ConjuntoVacio()) {
			clave = claves.Elegir();
			
			if(clave > claveMayor) {
				claveMayor = clave;
			}
			
			claves.Sacar(clave);
		}
		
		valores = diccionario.Recuperar(claveMayor);
		
		while(!valores.ConjuntoVacio()) {
			valor = valores.Elegir();
			valoresLista[pos] = valor;
			valores.Sacar(valor);
		}
		
		for(int i = 0;i<valoresLista.length;i++) {
			pila.Apilar(valoresLista[i]);
		}
		
		return pila;
	}
}
