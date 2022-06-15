package tp3Ejercicio4DecodificadorPeliculas;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    public double getPuntaje(){
        return this.puntaje;

    } 

    public LocalDate getFechaEstreno(){
        return this.fechaEstreno;
    }

    public List<Pelicula> getPelSimilares(){
        return this.pelSimimlares;
    }

    //itero listas de peliculas simialres y asigno la similaridad a estas
    private void añadirSimilar(Pelicula pel){
        this.pelSimimlares.add(pel);
    }

    private void asignarSimilaridad(){

        this.pelSimimlares.stream().forEach(c -> añadirSimilar(this));

    }




}
