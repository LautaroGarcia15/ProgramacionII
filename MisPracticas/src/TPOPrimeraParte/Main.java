package TPOPrimeraParte;

public class Main {

	public static void main(String[] args) {
		TDAPila pila = new PilaTF();
		DiccionarioMultipleTDA diccionario = new DicMultipleA();
		
		pila.InicializarPila();
		diccionario.InicializarDiccionario();
		
		diccionario.Agregar(3, 1);
		diccionario.Agregar(3, 3);
		diccionario.Agregar(3, 5);
		diccionario.Agregar(3, 7);
		
		diccionario.Agregar(5, 3);
		
		diccionario.Agregar(1, 4);
		diccionario.Agregar(1, 2);
		
		diccionario.Agregar(7, 4);
		diccionario.Agregar(7, 5);

		for(int i = 0; i<diccionario.cantClaves;i++) {
			
		}
		
	}
	

}
