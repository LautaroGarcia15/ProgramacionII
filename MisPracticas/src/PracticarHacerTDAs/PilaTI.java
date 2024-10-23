package PracticarHacerTDAs;

public class PilaTI implements PilaTDA{
	int [] a;
	int indice;

	@Override
	public void inicializarPila() {
		a = new int [100];
		indice = 0;
	}

	@Override
	public void Agregar(int x) {
		for (int i = indice -1; i>=0;i--) {
			a[i+1] = a[i];
		}
		a[0] = x;
		indice++;
	}

	@Override
	public void Deasapilar() {
		for (int i = 0;i<indice;i++) {
			a[i] = a[i+1];
		}
		indice--;
	}

	@Override
	public int Tope() {
		return a[0];
	}

	@Override
	public boolean PilaVacia() {
		return indice == 0;
	}

}
