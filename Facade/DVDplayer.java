
public class DVDplayer {
	
	private DVDplayer() {}
	
	private static DVDplayer instance= new DVDplayer();
	
	public static DVDplayer getInstance() {
		return instance;
	}
	
	
	public void play() {
		System.out.println("DVD is playing...");
	}

}
	
