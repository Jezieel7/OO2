package tp3Ejercicio3MovilYConexiones;

public class Dispositivo {
	private Calculator crcCalculator;
	private Ringer ringer;
	private Connection connection;
	private Display display;
	
	public Dispositivo() {
		this.crcCalculator = new CRC32_Calculator();
	}
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, (int) crc);
	}
	
	public void conectarCon(Connection connection) {
		this.connection = connection;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
	}
	
	public void configurarCRC(Calculator calculator) {
		this.crcCalculator = crcCalculator;
	}
	
}
