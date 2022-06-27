package tp7Ejercicio3Proyectos;

public class Vigente implements StateProyecto{
	@Override
	public void invertir(Proyecto proyecto, double monto) {
		if((proyecto.getMontoTotalRecibido() + monto) >= proyecto.getMontoAlcanzar())
			proyecto.setState(new Conformado());
		proyecto.setMontoTotalRecibido(proyecto.getMontoTotalRecibido() + monto);
	}

	@Override
	public void cancelar(Proyecto proyecto) {
		proyecto.setState(new Cancelado());
	}
}
