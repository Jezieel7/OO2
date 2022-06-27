package tp7Ejercicio3Proyectos;

public class Proyecto {
    private String titulo;
    private Emprendedor responsable;
    private double montoAlcanzar;
    private StateProyecto state;
    private double montoTotalRecibido;
    
    public Proyecto(String titulo, double montoAlcanzar, double montoTotalRecibido, Emprendedor responsable) {
		this.titulo = titulo;
		this.montoAlcanzar = montoAlcanzar;
		this.responsable = responsable;
		this.montoTotalRecibido = 0;
		this.state = new Vigente();
	}
    
    public void invertir(double monto) {
    	this.state.invertir(this, monto);
    }
    
    public void cancelar(){
    	this.state.cancelar(this);
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Emprendedor getResponsable() {
		return responsable;
	}

	public void setResponsable(Emprendedor responsable) {
		this.responsable = responsable;
	}

	public double getMontoAlcanzar() {
		return montoAlcanzar;
	}

	public void setMontoAlcanzar(double montoAlcanzar) {
		this.montoAlcanzar = montoAlcanzar;
	}

	public double getMontoTotalRecibido() {
		return montoTotalRecibido;
	}

	public void setMontoTotalRecibido(double montoTotalRecibido) {
		this.montoTotalRecibido = montoTotalRecibido;
	}

	public StateProyecto getState() {
		return state;
	}

	public void setState(StateProyecto state) {
		this.state = state;
	}

}
