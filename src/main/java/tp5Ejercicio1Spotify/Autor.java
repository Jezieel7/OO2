package tp5Ejercicio1Spotify;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Autor {
	
    private String name;
	private List<Album> albums;
	
	public String getName() {
		return name;
	}
	
	public List<Album> getAlbums(){
		return this.albums;
	}
	
//	itera sombre los albums del autor buscando un tema igual, retor na una lista con temas iguales
	public List<Tema> buscarTituloAutor(Tema tem) {
		
		return this.albums.stream()
				.map(t -> t.buscarTituloAlbum(tem))
				.flatMap(l -> l.stream())
				.collect(Collectors.toList());
				
		
					
	}
	
}
