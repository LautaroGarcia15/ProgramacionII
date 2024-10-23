package PracticarHacerTDAs;

public interface ColaPrioridadTDA {
	void InicializarCola();
	void Acolar(int x, int prioridad);
	void Desacolar();
	boolean ColaVacia();
	int Primero();
	int Priridad();
}
