package tp5Parte2Ejercicio1FacturacionLlamada;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	private SortedSet<String> guia = new TreeSet<String>();
 
	public SortedSet<String> getGuia() {
		return guia;
	}

	public void setGuia(SortedSet<String> guia) {
		this.guia = guia;
	}
	
	public boolean agregarTelefono(String str) {
		return this.guia.add(str);
//		boolean encontre = lista3.guia.contains(str);
//		if (!encontre) {
//			lista3.guia.add(str); 
//			encontre= true;
//			return encontre;
//		}
//		else {
//			encontre= false;
//			return encontre;
//		}
	}
	
	public void eliminarTelefono(String tel) {
		
		this.guia.remove(tel);
	
	}
}
