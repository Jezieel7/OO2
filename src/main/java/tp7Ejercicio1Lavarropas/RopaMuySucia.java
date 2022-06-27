package tp7Ejercicio1Lavarropas;

public class RopaMuySucia extends ModoLavado{

	@Override
	public int lavado(Lavarropas lavarropas) {
		return super.primeraEtapa(lavarropas, 100, 100) 
				+ super.primeraEtapa(lavarropas, 100, 30) 
				+ super.segundaEtapa(lavarropas, 100, 15, 10);
	}

}
