package tp1Ejercicio2Biblioteca;

public class MainBiblioteca {

	public static void main(String[] args) {
		Socio socio = new Socio("Frailejon", "Frailejon@gmail.com", "123");
		Socio socio2 = new Socio("Ernesto", "Ernesto@gmail.com", "456");
		Socio socio3 = new Socio("Perez", "Perez@gmail.com", "789");
		Biblioteca biblioteca;
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(socio);
		biblioteca.agregarSocio(socio2);
		biblioteca.agregarSocio(socio3);
		System.out.println(biblioteca.exportarSocios());
	}
}
