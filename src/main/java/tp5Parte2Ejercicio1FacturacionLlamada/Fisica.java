package tp5Parte2Ejercicio1FacturacionLlamada;

public class Fisica extends Persoona{
	
	private String doc;
	static double descuentoFis = 0;
	
	public Fisica (String data, String nombre,  String tele) {
		super(nombre, tele);
		this.setDoc(data);
	}
	
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	
	@Override
	public double aplicarDescuento(double monto) {
		return monto - Fisica.descuentoFis * monto;
	}
}
