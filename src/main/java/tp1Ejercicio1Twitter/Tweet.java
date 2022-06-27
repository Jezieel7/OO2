package tp1Ejercicio1Twitter;

public class Tweet {
	private String texto;
	private Tweet original;
	
	public Tweet(String texto) {
		this.texto = texto;
	}
	
	public Tweet(String texto,Tweet tweet) {
		this.original = tweet;
		this.texto = texto;
	}
	
	public String getTexto(){
		return this.texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Tweet getOriginal() {
		return original;
	}

	public void setOriginal(Tweet original) {
		this.original = original;
	}
	
}
