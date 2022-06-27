package tp1Ejercicio3MediaPlayer;

public class VideoStreamAdapter implements Media{
	private VideoStream video;
	
	public void play() {
		this.video.reproduce();
	}
}
