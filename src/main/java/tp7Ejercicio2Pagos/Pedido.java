package tp7Ejercicio2Pagos;

public class Pedido {
	private Cliente cliente;
	
	public double monto() {
		return 0;
	}
	
	public boolean pagarCon(MedioDePago medio) {
		return medio.pagar(this.cliente, this.monto());
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
