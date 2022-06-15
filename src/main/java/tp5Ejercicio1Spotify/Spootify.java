package tp5Ejercicio1Spotify;

import java.util.List;
import java.util.stream.Collectors;

public class Spootify {
	
	
	private List<Usuario> users;
	private List<Autor> autores;
	
//	itera en autores buscando temas iguales y los retorna
	public List<Tema> buscarTitulo(Tema tem){
		
		return this.autores.stream()
			.map(a -> a.buscarTituloAutor(tem))
			.flatMap(l -> l.stream())
			.collect(Collectors.toList());
			
		
	}
	
	public List<Tema> buscarAutor(Autor aut){
		
		
	}
	
	public List<Tema> buscarAlbum(Album al){
	
	
	}
	
	
}
