package tp1Ejercicio1Twitter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	Usuario usuario;
	Tweet tweet;
	Tweet tweet2;
	
	@BeforeEach
	void setUp() throws Exception {
		this.tweet = new Tweet("Legolas es el personaje mas sobrevalorado del senior de los anillos");
		this.tweet2 = new Tweet("Batman begins no es la mejor pelicula de Batman");
		this.usuario = new Usuario();
	}
    
    @Test
    public void testAgregarTweet() {
    	this.usuario.agregarTweet(tweet);
    	this.usuario.agregarTweet(tweet2);
        assertEquals("Legolas es el personaje mas sobrevalorado del senior de los anillos", usuario.getTweets().get(0).getTexto());
        assertEquals("Batman begins no es la mejor pelicula de Batman", usuario.getTweets().get(1).getTexto());
    }
}
