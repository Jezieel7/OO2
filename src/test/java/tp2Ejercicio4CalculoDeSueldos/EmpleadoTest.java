package tp2Ejercicio4CalculoDeSueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

	Empleado temporario;
	Empleado temporario2;
	Empleado pasante;
	Empleado pasante2;
	Empleado planta;
	Empleado planta2;
	
	@BeforeEach
	void setUp() throws Exception {
		temporario = new Temporario(300);
		temporario2 = new Temporario(1500);
		pasante= new Pasante(10);
		pasante2= new Pasante(0);
		planta=  new Planta(100);
		planta2 = new Planta(5);
	}
    @Test
    public void testSueldobasico() {
        assertEquals(110000, temporario.sueldoBasico());
        assertEquals(20000, pasante.sueldoBasico());
        assertEquals(50000, planta.sueldoBasico());
    }
	
    @Test
    public void testSueldoAdicional() {
        
    	assertEquals(0, temporario.sueldoAdicional());
        temporario.setEsposado(true);
        temporario.setNiñes(5);
        assertEquals(15000, temporario.sueldoAdicional());
        
    	assertEquals(20000, pasante.sueldoAdicional());
    	assertEquals(0, pasante2.sueldoAdicional());
        
        assertEquals(200000, planta.sueldoAdicional());
        planta2.setEsposado(true);
        planta2.setNiñes(4);
        assertEquals(23000, planta2.sueldoAdicional());
    }
	
}
