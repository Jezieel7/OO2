package tp2Ejercicio1Topografias;

public abstract class Topografia {
	
	public boolean equals(Topografia otra) {
		return (this.getProporcionDeAgua() == otra.getProporcionDeAgua());
	}
	
	public abstract double getProporcionDeAgua();
	
	public boolean isIgual(Topografia otra) {
		return this.equals(otra);
	};
}
