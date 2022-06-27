package tp7Ejercicio1Lavarropas;

public abstract class ModoLavado {

	public abstract int lavado(Lavarropas lavarropas);
	
    public int primeraEtapa(Lavarropas lavarropas, int porcentajeAgua, int minutosLavado){
    	lavarropas.agregarAgua(porcentajeAgua);
    	lavarropas.agregarJabonEnPolvo();
    	lavarropas.lavar(minutosLavado);
    	lavarropas.vaciarAgua();
        return minutosLavado;
    }
    
    public int segundaEtapa (Lavarropas lavarropas, int porcentajeAgua, int minutosEnjuague , int minutosCentrifugado) {
    	lavarropas.agregarEnjuague();
    	lavarropas.enjuaga(minutosEnjuague);
    	lavarropas.centrifugar(minutosCentrifugado);
        return minutosEnjuague + minutosCentrifugado;
    }
	
}
