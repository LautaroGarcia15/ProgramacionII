package PracticarHacerTDAs;

public class ColaPrioridad1 implements ColaPrioridadTDA {
	class Elemento{
		int valor;
		int prioridad;
	}
	
	Elemento [] elementos;
	int indice;
	
	@Override
	public void InicializarCola() {
		indice = 0;
		elementos = new Elemento[100];
	}
	@Override
	public void Acolar(int x, int prioridad) {
		int i = indice;
		for(; i>0 && elementos[i-1].prioridad >= prioridad;i--) {
			elementos[i] = elementos [i-1];
		}
		
		elementos[i] = new Elemento();
		elementos[i].valor = x;
		elementos[i].prioridad = prioridad;
		indice++;
	}
	@Override
	public void Desacolar() {
		elementos[indice-1] = null;
		indice--;
	}
	@Override
	public boolean ColaVacia() {
		return indice == 0;
	}
	@Override
	public int Primero() {
		return elementos[indice - 1].valor;
	}
	@Override
	public int Priridad() {
		return elementos[indice - 1].prioridad;
	}
	
}
