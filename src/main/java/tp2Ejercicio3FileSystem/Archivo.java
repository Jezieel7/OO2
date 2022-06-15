package tp2Ejercicio3FileSystem;

import java.time.LocalDate;

public class Archivo implements FileSystem {
	private String nombre;
	private LocalDate fecha;
	private int tamano;
	
	public Archivo(String nombre, LocalDate fecha, int tamano) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = tamano;
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return tamano;
	}
	
	@Override
	public Archivo archivoMasGrande() {
		return this;
	}
	
	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
}
