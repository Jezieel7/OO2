package tp2Ejercicio4CalculoDeSueldos;

public abstract class Empleado {
	
	private boolean casado;
	private int hijos;
	
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	public void setHijos(int hijos) {
		this.hijos= hijos;
	}
	
	public double sueldo() {
		return (this.sueldoBasico() 
				+ this.sueldoAdicional()
				* (1 - this.sueldoDescuento()));
	}
	
	public double sueldoBasico() {
		return 20000;
	}
	
	public double sueldoAdicional() {
		return (this.casado) ? (5000 + 2000  * this.hijos) : (2000 * this.hijos);
	}
	
	public double sueldoDescuento() {
		return (this.sueldoBasico() * 0.13) + (this.sueldoAdicional() * 0.05);
	}
}
