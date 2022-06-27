package tp7Ejercicio1Lavarropas;

public class Lavarropas {
	private ModoLavado estrategia;
	private int porcentajeAgua;
	
	public Lavarropas() {
		this.porcentajeAgua = 0;
		this.estrategiaLavadoDiario();
	}
	
	public int getPorcentajeAgua() {
		return porcentajeAgua;
	}

	public void agregarAgua(int porcentaje) {
		this.porcentajeAgua = porcentaje;
	}
	
	public void agregarJabonEnPolvo() {
		
	}
	
	public void lavar(int minutos) {
		
	}
	
	public void vaciarAgua() {
		this.porcentajeAgua = 0;
	}
	
	public void agregarEnjuague() {
		
	}
	
	public void enjuaga(int minutos) {
		
	}
	
	public void centrifugar(int minutos) {
		
	}
	
	public int lavado() {
		return this.estrategia.lavado(this);
	}
	
	public void cambiarEstrategia(ModoLavado estrategia) {
		this.estrategia = estrategia;
	}
	
	public void estrategiaLavadoDiario() {
		this.estrategia = new LavadoDiario();
	}
	
	public void estrategiaRopaDelicada() {
		this.estrategia = new RopaDelicada();
	}
	
	public void estrategiaRopaMuySucia() {
		this.estrategia = new RopaMuySucia();
	}
}
