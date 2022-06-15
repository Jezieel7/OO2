package tp5Ejercicio1Spotify;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSpootify {
	
	Spootify spot;
	Usuario user;
	
	
	@BeforeEach
	void setUp() throws Exception {
		Autor justinBieber = new Autor("Justin Bieber");
		Autor oneDirection = new Autor("One Direction");
//		album Justin Bieber
		Album believe = new Album("Believe");
		Album purpose = new Album("Purpose");
//		album One Direction
		Album takeMeHome = new Album("Take Me Home");
//		album Believe Justin Bieber
		Tema boyfriend = new Tema("Boyfriend");
		Tema beAlright = new Tema("Be Alright");
//		album Purpose Justin Bieber
		Tema loveYourself = new Tema("Love Yourself");
		Tema sorry = new Tema("Sorry");
		Tema whatDoYouMean = new Tema("What Do You Mean?");
//		album Take Me Home One Direction
		Tema rockMe = new Tema("Rock Me");
		Tema kissYou = new Tema("Kiss You");
		Tema cmonCmon = new Tema("C'mon, C'mon");
		Tema overAgain = new Tema("Over Again");
		
//		Justin Bieber 
//		album -> believe
		believe.agregarTema(boyfriend);
		believe.agregarTema(beAlright);
//		alubum -> purpose
		purpose.agregarTema(loveYourself);
		purpose.agregarTema(sorry);
		purpose.agregatTema(whatDoYouMean);
		
		justinBieber.agregarAlbum(believe);
		justinBieber.agregarAlbum(purpose);
		
		
//		One Direction
		takeMeHome.agregarTema(rockMe);
		takeMeHome.agregarTema(kissYou);
		takeMeHome.agregarTema(cmonCmon);
		takeMeHome.agregarTema(overAgain);
		
		oneDirection.agregarAlbum(takeMeHome);
		
		spot.agregarAutor(oneDirection);
		spot.agregarAutor(justinBieber);
		
	}
	
	@Test
    public void testBuscarTitulo() {  //busca por tema
		
        assertTrue(spot.buscarTitulo("Boyfriend").contains(boyfriend));
        
        assertTrue(spot.buscarTitulo("Sorry").contains(sorry));
        assertTrue(spot.buscarTitulo("What Do You Mean?").contains(whatDoYouMean));
        
        assertTrue(spot.buscarTitulo("Rock Me").contains(rockMe));
        assertTrue(spot.buscarTitulo("Over Again").contains(overAgain));     
        
    }
	
	@Test
    public void testBuscarAutor() {
		List<Tema> justinTemas = new ArrayList<Tema>();
		justinTemas.add(loveYourself);
		justinTemas.add(sorry);
		justinTemas.add(whatDoYouMean);
		justinTemas.add(boyfriend);
		justinTemas.add(beAlright);
        assertEquals(justinTemas, spot.BuscarAutor("justinBieber"));
        
        List<Tema> oneTemas = new ArrayList<Tema>();
        oneTemas.add(rockMe);
        oneTemas.add(kissYou);
        oneTemas.add(cmonCmon);
        oneTemas.add(overAgain);
        assertEquals(oneDirection, spot.BuscarAutor("One Direction"));    
        
    }
	
	
	@Test
    public void testBuscarAlbum() {
		List<Tema> purposeTemas = new ArrayList<Tema>();
		purposeTemas.add(loveYourself);
		purposeTemas.add(sorry);
		purposeTemas.add(whatDoYouMean);
		assertEquals(purposeTemas, spot.BuscarAlbum("purpose"));
		
		List<Tema> believeTemas = new ArrayList<Tema>();
		believeTemas.add(boyfriend);
		believeTemas.add(beAlright);
        assertEquals(believeTemas, spot.BuscarAlbum("believe"));
        
        List<Tema> oneTemas = new ArrayList<Tema>();
        oneTemas.add(rockMe);
        oneTemas.add(kissYou);
        oneTemas.add(cmonCmon);
        oneTemas.add(overAgain);
        assertEquals(oneDirection, spot.BuscarAutor("One Direction"));    
        
    }
	
	
	public void testAgregarTema() {
		
	
		<Tema> listaTemas = new ArrayList<Tema>();
		listaTemas.add(loveYourself);
		listaTemas.add(sorry);
		listaTemas.add(whatDoYouMean);
		listaTemas.add(rockMe);
		
		user = new Usuario();
		user.setMyMusic(listaTemas);
		
		listaTemas.add(kissYou);
		assertEquals(listaTemas, user.agregarTema(kissYou));
	         
    }
	
	public void testQuitarTema() {
		
		
		<Tema> listaTemas = new ArrayList<Tema>();
		listaTemas.add(loveYourself);
		listaTemas.add(sorry);
		listaTemas.add(whatDoYouMean);
		listaTemas.add(rockMe);
		
		user = new Usuario();
		user.setMyMusic(listaTemas);
		
		listaTemas.remove(listaTemas.size() -1); //elimino el ultimo elemento(rockMe)
		assertEquals(listaTemas, user.quitarTema(rockMe));
	         
    }
	
	
	
	
	
}
