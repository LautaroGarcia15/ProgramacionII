package PracticarHacerTDAs;

public interface DiccionarioMultipleTDA {
	void InicializarDiccionario();
	void AgregarValor(int clave, int valor);
	void EliminarClave(int clave);
	void EliminarValor(int valor);
	ConjuntoTDA Recuperar(int clave);
	ConjuntoTDA Claves();
	
}
