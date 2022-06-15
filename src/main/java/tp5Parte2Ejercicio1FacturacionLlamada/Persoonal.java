package tp5Parte2Ejercicio1FacturacionLlamada;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persoonal {
	List<Persoona> lista1 = new ArrayList<Persoona>();
	List<Llamada> lista2 = new ArrayList<Llamada>();
	GuiaTelefonica lista3 = new GuiaTelefonica(); 
//	static double descuentoJur = 0.15;
//	static double descuentoFis = 0;
	
	public boolean agregarTelefono(String str) {
		return this.lista3.agregarTelefono(str);
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
	
	public Persoona registrarUsuario(Persoona persona) {
		
//		Persoona var = new Persoona(data, nombre, type);		
//		if (t.equals("fisica")) {
////			var.setNya(nombre);
////			String tel = lista3.guia.last();
////			lista3.guia.remove(tel);
////			var.setT(t);
////			var.setTel(tel);
//			var.setDoc(data);
//		}
//		else if (t.equals("juridica")) {
////			String tel = lista3.guia.last();
////			lista3.guia.remove(tel);
////			var.nya =nombre;
////			var.t =t;
////			var.tel = tel;
//			var.cuit =data;
//		}
//		persona.sis = this;
		lista3.eliminarTelefono(persona.getTel());
		lista1.add(persona);
		return persona;
		 
	}
	
	
//	metodo reciebe una persona, crea una nuerva lista sin la persona
	public boolean eliminarUsuario(Persoona p) {
//		guardo en la guia el numero de la persona eliminada
		this.agregarTelefono(p.getTel());
//		si lo elimina exitosamente reotra true
		return this.lista1.remove(p);
		
	}
	
	public Llamada registrarLlamada(Llamada llamad) {
//		Llamada x = new Llamada();
//		x.tipoDeLlamada = t;
//		x.setEmisor(emisor.tel);
//		x.setRemitente(remitente.getTel());
//		x.dur= d;
		lista2.add(llamad);
		llamad.añadirLlamadaEmisor(llamad);
//		emisor.lista1.add(llamad);
		return llamad;		
	}
	

	public double calcularMontoTotalLlamadas(Persoona p) {
		
//		Persoona aux = null;
//		for (Persoona pp : lista1) {
//			if (pp.tel == p.getTel()) {
//				aux = pp;
//				break;
//			}
//		}
//		si no existe la persona retorna 0, sino calcula el monto
		if (!existeUsuario(p)) return 0;
		
		return p.getLista1().stream()
				.mapToDouble(l -> (l.getEmisor().aplicarDescuento(l.calcularCosto())))
				.sum();
					
			
//			double c = 0;
//			for (Llamada l : p.getLista1()) {
//				double auxc = 0;
//				if (l.tipoDeLlamada == "nacional") {
//					auxc += l.dur *3 + (l.dur*3*0.21);
//				} else if (l.tipoDeLlamada == "internacional") {
//					auxc += l.dur *200 + (l.dur*200*0.21);
//				}
//				auxc += l.calcularCosto();
//				if (aux.t == "fisica") {
//					auxc -= auxc*descuentoFis;
//				} else if(aux.t == "juridica") {
//					auxc -= auxc*descuentoJur;
//				}
//				c += p.aplicarDescuento(auxc);
			
		
		
	}

	public int cantidadDeUsuarios() {
		return lista1.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return lista1.contains(persona);
	}
	
}
