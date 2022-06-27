package tp7Ejercicio1Lavarropas;

public class RopaDelicada extends ModoLavado{
	
	@Override
	public int lavado(Lavarropas lavarropas) {
		return super.primeraEtapa(lavarropas, 100, 40) 
				+ super.segundaEtapa(lavarropas, 100, 15, 0);
	}

}
