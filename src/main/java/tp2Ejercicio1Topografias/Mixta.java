package tp2Ejercicio1Topografias;

import java.util.Arrays;

public class Mixta extends Topografia{
	private Topografia[] topografias;
	
	public Mixta(Topografia[] topografias) {
		this.topografias = new Topografia[4];
		for(int i=0; i < topografias.length; i++)
			this.topografias[i] = topografias[i];
	};
	
	@Override
	public double getProporcionDeAgua() {
		return (Arrays.asList(this.topografias).stream()
		.mapToDouble(t -> t.getProporcionDeAgua()).sum()) / 4;
	};
}
