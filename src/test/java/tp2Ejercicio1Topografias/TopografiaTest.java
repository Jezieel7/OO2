package tp2Ejercicio1Topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	Tierra tierra = new Tierra();
	Tierra tierra2 = new Tierra();
	Agua agua = new Agua();
	Agua agua2 = new Agua();
	Mixta mixta1;
	Mixta mixta2;
	Mixta mixta3;
	Mixta mixta4;
	
	
	@BeforeEach
	void setUp() throws Exception {
		Topografia[] topografias2 = new Topografia[4];
		topografias2[0] = this.tierra;
		topografias2[1] = this.tierra2;
		topografias2[2] = this.agua;
		topografias2[3] = this.agua2;
		this.mixta4 = new Mixta(topografias2);
		
		Topografia[] topografias = new Topografia[4];
		topografias[0] = this.tierra;
		topografias[1] = this.tierra2;
		topografias[2] = this.agua;
		topografias[3] = this.mixta4;
		this.mixta1 = new Mixta(topografias);
		this.mixta2 = new Mixta(topografias);
		this.mixta3 = new Mixta(topografias2);
	}
	
    @Test
    public void testGetProporcionDeAguaAtomica() {
        assertEquals(1, this.agua.getProporcionDeAgua());
        assertEquals(0, this.tierra.getProporcionDeAgua());
    }
    
    @Test
    public void testGetProporcionDeAguaMixta() {
        assertEquals(0.5, this.mixta4.getProporcionDeAgua());
        assertEquals(0.375, this.mixta1.getProporcionDeAgua());
    }
    
    @Test
    public void testIsIgual() {
        assertTrue(this.mixta1.isIgual(this.mixta2));
        assertTrue(this.mixta3.isIgual(this.mixta4));
        assertFalse(this.mixta1.isIgual(this.mixta3));
    }

}
