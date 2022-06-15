package tp4Ejercicio2FileManager;

public class DecoratorFechaModificacion extends FileDecorator {

	public DecoratorFechaModificacion(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getFechaModificacion().toString();
	}


}
