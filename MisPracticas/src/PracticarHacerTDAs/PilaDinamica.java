package PracticarHacerTDAs;

public class PilaDinamica implements PilaTDA {
	class Nodo{
		int info;
		Nodo sig;
	}
	Nodo primero;

	@Override
	public void inicializarPila() {
		primero = null;
	}

	@Override
	public void Agregar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = primero;
		primero = nuevo;
	}

	@Override
	public void Deasapilar() {
		primero = primero.sig;
	}

	@Override
	public int Tope() {
		return primero.info;
	}

	@Override
	public boolean PilaVacia() {
		return primero == null;
	}
	

}
