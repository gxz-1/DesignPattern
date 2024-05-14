
public class Screen {
	private Screen() {}
	
	private static Screen instance=new Screen();
	
	public static Screen getInstance() {
		return instance;
	}
	
	public void down() {
		System.out.println("½µÏÂÆÁÄ»");
	}
	
	public void up() {
		System.out.println("ÉıÆğÆÁÄ»");
	}
}
