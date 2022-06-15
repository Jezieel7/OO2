package tp2Ejercicio4CalculoDeSueldos;

public abstract class Empleado {
	
	private boolean esposado;
	private int niñes;
	
	public void setEsposado(boolean esp) {
		this.esposado = esp;
	}
	
	public void setNiñes(int nin) {
		this.niñes= nin;
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
		return (esposado)? 5000 + 2000*this.niñes : 2000*this.niñes;
	}
	
	public double sueldoDescuento() {
		return this.sueldoBasico()*0.13 + this.sueldoAdicional()* 0.05;
	}
}
