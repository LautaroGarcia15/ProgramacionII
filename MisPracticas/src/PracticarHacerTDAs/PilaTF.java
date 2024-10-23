package PracticarHacerTDAs;

public class PilaTF implements PilaTDA {
	int [] a;
	int indice;
	
	@Override
	public void inicializarPila() {
		a = new int[100];
		indice = 0;
	}

	@Override
	public void Agregar(int x) {
		a[indice] = x;
		indice++;
	}

	@Override
	public void Deasapilar() {
		indice--;
	}

	@Override
	public int Tope() {
		return a[indice-1];
	}

	@Override
	public boolean PilaVacia() {
		return indice == 0; 
	}

}
