package tp5Ejercicio1Spotify;

import java.util.List;

public class Album {
	
	private String name;
	private List<Tema> temas;
	
	public String getName() {
		return name;
	}
	
	public List<Tema> buscarTituloAlbum(Tema tem){
		
		return this.temas.stream().
					filter(a -> a.getName().equals(tem.getName())).
					toList();
	}
	
}
