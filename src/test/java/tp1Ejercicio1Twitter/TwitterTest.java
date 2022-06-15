package tp1Ejercicio1Twitter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Twitter twitter;
	Usuario usuario;
	Usuario usuario2;
	Tweet tweet;
	Tweet tweet2;
	List<Tweet> tweets;
	
	@BeforeEach
	void setUp() throws Exception {
		this.tweet = new Tweet("Legolas es el personaje mas sobrevalorado del senior de los anillos");
		this.tweet2 = new Tweet("Batman begins no es la mejor pelicula de Batman");
		this.tweets = new ArrayList<Tweet>();
		this.tweets.add(tweet);
		this.tweets.add(tweet2);
		this.usuario = new Usuario("Jezieel8", this.tweets);
		this.usuario2 = new Usuario("FrailejonErnestoPerez", this.tweets);
		this.twitter = new Twitter();
	}
    
    @Test
    public void testAgregarUsuario() {
		this.twitter.agregarUsuario(usuario);
		this.twitter.agregarUsuario(usuario2);
        assertEquals("Jezieel8", twitter.getUsuarios().get(0).getScreenName());
        assertEquals("FrailejonErnestoPerez", twitter.getUsuarios().get(1).getScreenName());
        this.twitter.agregarUsuario(usuario2);
    }
    
    @Test
    public void testEliminarUsuario() {
		this.twitter.agregarUsuario(usuario);
		this.twitter.agregarUsuario(usuario2);
        twitter.eliminarUsuario(this.usuario);
        assertEquals("FrailejonErnestoPerez", twitter.getUsuarios().get(0).getScreenName());
    }
}
