package ModeloParcialEj1;

public class ConjuntoTA implements ConjuntoExtendidoTDA {
	
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


	public ConjuntoExtendidoTDA diferencia(ConjuntoExtendidoTDA otro) {
		ConjuntoExtendidoTDA conjuntoFinal = new ConjuntoTA();
		conjuntoFinal.InicializarConjunto();
		
		for(int i = 0; i<cant;i++) {
			if(!otro.Pertenece(a[i])){
				conjuntoFinal.Agregar(a[i]);
			}
		}
		return conjuntoFinal;
	}


	public int suma() {
		int suma = 0;
		int i = 0;
		while(i<cant) {
			suma += a[i];
			i++;
		}
		return suma;
	}


	public void vaciar() {
		int i = 0;
		while(i<cant) {
			a[i] = 0;
			i++;
		}
	}
	
	public void mostrar() {
		for(int i = 0;i< cant; i++) {
			System.out.println(a[i]);
		}
	}

}
