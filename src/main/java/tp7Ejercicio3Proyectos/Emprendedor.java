package tp7Ejercicio3Proyectos;

import java.util.ArrayList;
import java.util.List;

public class Emprendedor {
	private List<Proyecto> proyectos;

	public Emprendedor() {
		proyectos = new ArrayList<Proyecto>();
	}
	
	public void anadirProyecto(Proyecto p) {
		proyectos.add(p);
	}
}
