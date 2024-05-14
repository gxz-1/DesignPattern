

public class TheaterFacade {

	// 聚合各个子系统的对象
	Light light;
	Screen screen;
	DVDplayer dplayer;

	public TheaterFacade() {
		Light light = Light.getInstance();
		Screen screen = Screen.getInstance();
		DVDplayer dplayer = DVDplayer.getInstance();
	}

	void begin() {
		light.on();
		screen.down();
		dplayer.play();
	}
	
	void end() {
		screen.up();
	}
	
	void Client() {
		begin();
		end();
	}
	
}
