package tp2Ejercicio4CalculoDeSueldos;

public class Pasante extends Empleado{

	private int examen;
	
	public Pasante(int examen) {
		this.examen = examen;
	}

	@Override
	public double sueldoAdicional() {
		return 2000 * this.examen;
	}
	
}
