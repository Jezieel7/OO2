package tp7Ejercicio2Pagos;

public class DebitoGateway {
	private boolean autorizarMontoConCBU(double unMonto, String cbu) {
		return true;
	}

	public boolean pagarMontoConCBU(double unMonto, String cbu) {
		return (autorizarMontoConCBU(unMonto,cbu)) ? true : false;
	}
}
