package tp2Ejercicio3FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio implements FileSystem{
	
	private String nombre;
	private LocalDate fecha;
	private static int CONTENIDO = 32;
	private List<FileSystem> files;
	
	public Directorio(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.files = new ArrayList<FileSystem>();
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return this.files.stream()
				.mapToInt(f -> f.tamanoTotalOcupado())
				.sum() + Directorio.CONTENIDO;
	}
	
	@Override
	public Archivo archivoMasGrande() {
		return this.files.stream()
				.map(f -> f.archivoMasGrande())
				.max(Comparator.comparingInt(c -> c.tamanoTotalOcupado()))
				.orElse(null);
	}
	
	@Override
	public Archivo archivoMasNuevo() {
		return this.files.stream()
				.map(f -> f.archivoMasNuevo())
				.max(Comparator.comparing(c -> c.getFecha()))
				.orElse(null);
	}
	
	public void agregar(FileSystem file) {
		this.files.add(file);
	}
}
