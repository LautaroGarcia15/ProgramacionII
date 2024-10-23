package ModeloParcialEj1;

public interface ConjuntoExtendidoTDA {
	
	void InicializarConjunto();
	
	void Agregar(int x);
	
	int Elegir();
	
	boolean ConjuntoVacio();
	
	void Sacar(int x);
	
	boolean Pertenece(int x);
	
	public ConjuntoExtendidoTDA diferencia(ConjuntoExtendidoTDA otro);
	
	public int suma();
	
	public void vaciar();
	
	public void mostrar();
	
}
