package tp3Ejercicio3MovilYConexiones;

public abstract class ConnectionAdapter implements Connection{
	private FourGconnection fourGConnection;
	
	@Override
	public String sendData(String data, Integer crc) {
		return this.fourGConnection.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.fourGConnection.symb();
	}

}
