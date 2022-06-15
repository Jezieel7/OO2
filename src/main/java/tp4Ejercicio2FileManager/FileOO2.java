package tp4Ejercicio2FileManager;

import java.time.LocalDate;

public interface FileOO2 {

	public String prettyPrint();
	
	public String getNombre();
	public String getExtension();
	public Double getTamanio();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
	
}
