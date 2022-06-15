package tp2Ejercicio4CalculoDeSueldos;

public class Planta extends Empleado{

	private int antiguo;
	
	public Planta (int ant) {
		this.antiguo= ant;
	}
	
	@Override
	public double sueldoBasico(){
		return 50000;
	}
	@Override
	public double sueldoAdicional() {
		return super.sueldoAdicional() + 2000*this.antiguo;
	}
	
	
}
