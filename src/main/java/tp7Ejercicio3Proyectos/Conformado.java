package tp7Ejercicio3Proyectos;

public class Conformado implements StateProyecto{
	@Override
	public void invertir(Proyecto proyecto, double monto) {
		proyecto.setMontoTotalRecibido(proyecto.getMontoTotalRecibido() + monto);
	}

	@Override
	public void cancelar(Proyecto proyecto) {
		
	}
}
