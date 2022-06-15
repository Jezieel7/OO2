package tp5Parte2Ejercicio1FacturacionLlamada;

public class Juridica extends Persoona{
	
	private String cuit;
	static double descuentoJur = 0.15; //esto va aca????
	
	
	public Juridica(String Data, String nombre, String tele) {
		super(nombre, tele);
		this.setCuit(Data);
		
	}
	
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	@Override
	public double aplicarDescuento(double monto) {
		return monto - Juridica.descuentoJur * monto;
	} 
	
}
