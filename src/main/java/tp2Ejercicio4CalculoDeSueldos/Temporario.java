package tp2Ejercicio4CalculoDeSueldos;

public class Temporario extends Empleado{

	private double horasTrabajadas;
	
	public Temporario(double hs) {
		this.horasTrabajadas= hs;
	}
	
	@Override
	public double sueldoBasico() {
		
		return super.sueldoBasico() + 300*this.horasTrabajadas;
	}

}
