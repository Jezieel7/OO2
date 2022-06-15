package tp1Ejercicio1Twitter;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void agregarUsuario(Usuario usuario) {
		if(this.usuarios.isEmpty()) {
			this.usuarios.add(usuario);
		}else {
			if(this.usuarios.stream()
					.filter((Usuario u) -> u.verificarScreenName(usuario.getScreenName()))
					.findFirst().orElse(null) == null)
					this.usuarios.add(usuario);
		}
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuario.eliminarTweets();
		this.usuarios.remove(usuario);
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
