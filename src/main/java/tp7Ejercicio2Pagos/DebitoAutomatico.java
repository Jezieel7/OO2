package tp7Ejercicio2Pagos;

public class DebitoAutomatico implements MedioDePago {

	private DebitoGateway debitoGateway;
	
	@Override
	public boolean pagar(Cliente cliente, double monto) {
		return debitoGateway.pagarMontoConCBU(monto, cliente.getCBU());
	}

}
