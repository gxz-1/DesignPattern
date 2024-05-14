
public class Screen {
	private Screen() {}
	
	private static Screen instance=new Screen();
	
	public static Screen getInstance() {
		return instance;
	}
	
	public void down() {
		System.out.println("������Ļ");
	}
	
	public void up() {
		System.out.println("������Ļ");
	}
}
