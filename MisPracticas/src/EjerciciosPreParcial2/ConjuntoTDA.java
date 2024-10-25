package EjerciciosPreParcial2;

public interface ConjuntoTDA {
	
	void InicializarConjunto();
	
	void Agregar(int x);
	
	int Elegir();
	
	boolean ConjuntoVacio();
	
	void Sacar(int x);
	
	boolean Pertenece(int x);
	
	public ConjuntoTDA diferencia(ConjuntoTDA conjunto);
	
	public int suma();
	
	public void vaciar();
	
}
