package tp3Ejercicio2Encriptador;

public class Mensajero {
	
	private Conexion conexion;
	
	public Mensajero() {
		this.conexion = new ConexionSegura();
	}
	
	public void enviar(String mensaje) {
		this.conexion.enviar(mensaje);
	}
}
