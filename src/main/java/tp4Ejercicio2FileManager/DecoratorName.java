package tp4Ejercicio2FileManager;

public class DecoratorName extends FileDecorator {

	public DecoratorName(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getNombre();
	}


}
