package tp7Ejercicio1Lavarropas;

public class LavadoDiario extends ModoLavado {

	@Override
	public int lavado(Lavarropas lavarropas) {
		return super.primeraEtapa(lavarropas, 50, 20) 
				+ super.segundaEtapa(lavarropas, 50, 7, 3);
	}

}
