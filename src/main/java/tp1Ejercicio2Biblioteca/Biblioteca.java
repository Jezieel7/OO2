package tp1Ejercicio2Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Socio> socios;
	private JsonAdapter exporter;

	public Biblioteca() {
		socios = new ArrayList<>();
		exporter = new JacksonAdapter();
	}

	public void agregarSocio(Socio socio) {
		socios.add(socio);
	}

	/**
	 * Retorna la representación JSON de la colección de socios.
	 */
	public String exportarSocios() {
		return exporter.exportar(socios);
	}

	public JsonAdapter getExporter() {
		return exporter;
	}

	public void setExporter(JsonAdapter exporter) {
		this.exporter = exporter;
	}
}
