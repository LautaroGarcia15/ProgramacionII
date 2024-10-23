package ModeloParcial2;

public class Ejercicio2 {
	
	public static int agarrarImpares(ArbolTDA a, ConjuntoTDA impares,int nivel) {
		int vueltas = nivel;
		if(!a.EsVacio()) {
			if(vueltas % 2 != 0) {
				impares.Agregar(a.Raiz());		
			}
			vueltas++;
			agarrarImpares(a.HijoIzquierdo(),impares,vueltas);
			agarrarImpares(a.HijoDerecho(),impares,vueltas);
		}
		return vueltas;
		
	}
}
