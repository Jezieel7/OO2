package tp5Parte2Ejercicio1FacturacionLlamada;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	protected List<Llamada> lista1 = new ArrayList<Llamada>();
	protected String nya;
	protected String tel;
//	protected Persoonal sis; -> es una atributo innecesario???? xq todas las personas tiene el mismo 
//								sistema
	
	
	public Persoona(String nombre, String tel) {
		this.nya = nombre;
		this.tel = tel;
		 
	}
	
	
	public List<Llamada> getLista1() {
		return lista1;
	}
	public void setLista1(List<Llamada> lista1) {
		this.lista1 = lista1;
	}
	
	public String getNya() {
		return nya;
	}
	public void setNya(String nya) {
		this.nya = nya;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void añadirLlamada(Llamada llam) {
		this.lista1.add(llam);
	}
	
	public abstract double aplicarDescuento(double monto);
	
}
