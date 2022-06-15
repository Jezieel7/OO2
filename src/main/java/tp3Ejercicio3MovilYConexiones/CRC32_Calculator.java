package tp3Ejercicio3MovilYConexiones;

import java.util.zip.CRC32;

public class CRC32_Calculator extends Calculator{
	
	@Override
	public Integer crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		return (int) crc.getValue();
	};
}
