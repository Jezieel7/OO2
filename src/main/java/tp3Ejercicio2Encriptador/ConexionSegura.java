package tp3Ejercicio2Encriptador;

public class ConexionSegura extends Conexion{
	private Encriptador encriptador;
	
	public ConexionSegura() {
		this.encriptador = new Rc4();
	}
	
	@Override
	public void enviar(String mensaje) {
		String mensajeEncriptado = this.encriptador.encriptar(mensaje);
		super.enviar(mensajeEncriptado);
	}
}
