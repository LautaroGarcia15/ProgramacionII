package EjerciciosPreParcial2;

public class ConjuntoTA implements ConjuntoTDA {
	
	int [] a;
	int cant;
	
	public void InicializarConjunto() {
		a = new int[100];
		cant = 0;
	}

	
	public void Agregar(int x) {
		if(!this.Pertenece(x)) {
			a[cant] = x;
			cant++;
		}
	}

	
	public int Elegir() {
		return a[cant - 1];
	}

	
	public boolean ConjuntoVacio() {
		return cant == 0;
	}

	
	public void Sacar(int x) {
		int i = 0;
		while(i<cant && a[i]!=x) {
			i++;
		}
		if(i<cant) {
			a[i] = a[cant-1];
			cant--;
		}
	}

	
	public boolean Pertenece(int x) {
		int i = 0;
		while(i<cant && a[i]!=x) {
			i++;
		}
		return (i < cant);
	}

	public ConjuntoTDA diferencia(ConjuntoTDA conjunto) {
		ConjuntoTDA conjuntoFinal = new ConjuntoTA();
		conjuntoFinal.InicializarConjunto();
		
		for(int i = 0;i< this.cant; i++) {
			if(!conjunto.Pertenece(a[i])) {
				conjuntoFinal.Agregar(a[i]);
			}
		}
		
		return conjuntoFinal;
	}
	
	public int suma() {
		int suma = 0;
		for(int i = 0; i < this.cant; i++) {
			suma += a[i];
		} 
		return suma;
	}
	
	public void vaciar() {
		for(int i = 0; i<this.cant; i++) {
			a[i] = 0;
		}
	}
}
