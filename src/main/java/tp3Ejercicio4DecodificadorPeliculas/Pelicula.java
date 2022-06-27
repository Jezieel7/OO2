package tp3Ejercicio4DecodificadorPeliculas;

import java.time.LocalDate;
import java.util.List;

public class Pelicula {
    
    private List<Pelicula> pelSimimlares;
    private String titulo;
    private LocalDate fechaEstreno;
    private double puntaje;

    public Pelicula (String titulo, LocalDate fecha, double puntaje, List<Pelicula> sim){
        this.titulo = titulo;
        this.fechaEstreno = fecha;
        this.puntaje = puntaje;
        this.pelSimimlares = sim;
        this.asignarSimilaridad();
    }

    public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public double getPuntaje(){
        return this.puntaje;
    } 

    public LocalDate getFechaEstreno(){
        return this.fechaEstreno;
    }

    public List<Pelicula> getPelSimilares(){
        return this.pelSimimlares;
    }

    private void añadirSimilar(Pelicula pel){
        this.pelSimimlares.add(pel);
    }

    private void asignarSimilaridad(){
        this.pelSimimlares.stream().forEach(c -> añadirSimilar(this));
    }

}
