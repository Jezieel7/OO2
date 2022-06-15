package tp4Ejercicio2FileManager;

public class DecoratorTamanio extends FileDecorator {

	public DecoratorTamanio(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getTamanio().toString();
	}


}
