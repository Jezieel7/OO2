package tp4Ejercicio2FileManager;

public class DecoratorFechaCreacion extends FileDecorator {

	public DecoratorFechaCreacion(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getFechaCreacion().toString();
	}


}
