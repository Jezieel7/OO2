package tp3Ejercicio4DecodificadorPeliculas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Decodificador {
    
    private List<Pelicula> grilla;
    private List<Pelicula> vistas;
    
    private Recomendar recom;


    public Decodificador(List<Pelicula> grilla2){

        this.grilla = grilla2;
        this.vistas = new ArrayList<Pelicula>();
        this.recom = new Novedad();
    }

    public List<Pelicula> getGrilla(){
     return this.grilla;   
    }

    public List<Pelicula> getVistas(){
        return this.vistas;
    }

    public void agregarPeliculaGrilla(Pelicula pel){

        this.grilla.add(pel);
    }

    public void peliculaVista(Pelicula pel){

        this.vistas.add(pel);
    }

    public List<Pelicula> recomendarPelis(){

        return recom.recomendarPelis(this);
    }

    /*
    public void cambioNovedad(){
        this.recom = new Novedad();
    }
    */

    public void cambioEstrategia(Recomendar re){
        this.recom = re;
    }

    public boolean noVisto(Pelicula pel){

        return this.vistas.contains(pel);

    }

    public List<Pelicula> noVista(){
        return this.grilla.stream().
                filter(c -> noVisto(c)).
                toList();
    }

}
