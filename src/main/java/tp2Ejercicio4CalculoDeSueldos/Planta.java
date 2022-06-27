package tp2Ejercicio4CalculoDeSueldos;

public class Planta extends Empleado{

	private int antiguedad;
	
	public Planta (int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	@Override
	public double sueldoBasico(){
		return 50000;
	}
	@Override
	public double sueldoAdicional() {
		return super.sueldoAdicional() + (2000 * this.antiguedad);
	}
	
	
}
