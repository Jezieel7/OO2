package tp5Parte2Ejercicio1FacturacionLlamada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersoonalTest {
	
	Persoonal sistema;
	Persoona emisorPersonaFisca, remitentePersonaFisica, emisorPersonaJuridica, remitentePersonaJuridica;
	
	Persoona juri1, juri2, fis1, fis2;
	Llamada nac1, nac2, nac3, nac4, inter1, inter2, inter3, inter4;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Persoonal();
		this.sistema.agregarTelefono("2214444554");
		this.sistema.agregarTelefono("2214444555");
		this.sistema.agregarTelefono("2214444556");
		this.sistema.agregarTelefono("2214444557");
		
		
		fis1 = new Fisica("11555666", "Marcelo Tinelli", "2214444554");
		this.emisorPersonaFisca = sistema.registrarUsuario(fis1);
		fis2 = new Fisica("00000001", "Mirtha Legrand", "2214444555");
		this.remitentePersonaFisica = sistema.registrarUsuario(fis2);
		juri1 = new Juridica("17555222","Felfort", "2214444556");
		this.emisorPersonaJuridica = sistema.registrarUsuario(juri1);
		juri2 = new Juridica("25765432","Moovistar", "2214444557");
		this.remitentePersonaJuridica = sistema.registrarUsuario(juri2);
		  
		nac1 = new Nacionales(emisorPersonaJuridica, remitentePersonaFisica, 10); 
		this.sistema.registrarLlamada(nac1);
		inter1 = new Internacional(emisorPersonaFisca, remitentePersonaFisica, 8);
		this.sistema.registrarLlamada(inter1);
		nac2 = new Nacionales(emisorPersonaJuridica, remitentePersonaJuridica, 5);
		this.sistema.registrarLlamada(nac2);
		inter2 = new Internacional(emisorPersonaJuridica, remitentePersonaJuridica, 7);
		this.sistema.registrarLlamada(inter2);
		nac3 = new Nacionales(emisorPersonaFisca, remitentePersonaFisica, 15);
		this.sistema.registrarLlamada(nac3);
		inter3 = new Internacional(emisorPersonaFisca, remitentePersonaFisica, 45);
		this.sistema.registrarLlamada(inter3);
		nac4 = new Nacionales(emisorPersonaFisca, remitentePersonaJuridica, 13);
		this.sistema.registrarLlamada(nac4);
		inter4 = new Internacional(emisorPersonaFisca, remitentePersonaJuridica, 17);
		this.sistema.registrarLlamada(inter4);
		
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		assertEquals(this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 15105.640000000001);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 3131.7825000000003);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica), 0);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica), 0);
	}
	
	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		this.sistema.agregarTelefono("2214444558"); 
		Persoona fis3 = new Fisica("2444555", "Chiche Gelblung", "221444458");
		
		this.sistema.registrarUsuario(fis3);
		
		assertEquals(this.sistema.cantidadDeUsuarios(), 5);
		assertTrue(this.sistema.existeUsuario(fis3));
		
	}
	
	@Test
	void testEliminarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		assertTrue(this.sistema.existeUsuario(emisorPersonaFisca));
		this.sistema.eliminarUsuario(emisorPersonaFisca);
		assertEquals(this.sistema.cantidadDeUsuarios(), 3);
		assertFalse(this.sistema.existeUsuario(emisorPersonaFisca));
	}

}
