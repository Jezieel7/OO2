package tp3Ejercicio3MovilYConexiones;

public class WifiConn implements Connection{
	private String pict;

	@Override
	public String sendData(String data, Integer crc) {
		return null;
	}

	@Override
	public String pict() {
		return this.pict;
	}
	
	
}
