package tp7Ejercicio2Pagos;

public class DineroMail implements MedioDePago {

	private DineroMailGateway dineroMailGateway;
	
	@Override
	public boolean pagar(Cliente cliente, double monto) {
		return dineroMailGateway.realizarPagoParaEmail(cliente.getEmail(), monto);
	}

}
