package tp3Ejercicio4DecodificadorPeliculas;

import java.util.Comparator;
import java.util.List;

public class Puntaje implements Recomendar{

    public List<Pelicula> recomendarPelis(Decodificador deco){
        return deco.noVista().stream().
        sorted(Comparator.comparingDouble(Pelicula::getPuntaje).
        thenComparing(Pelicula::getFechaEstreno))
        .limit(3).toList();
    }    

}