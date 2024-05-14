package type3;

//单例模式（懒汉式）
//存在线程安全问题
public class Test3 {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getinstance();
		Singleton s2 = Singleton.getinstance();
		System.out.println("两者是否是同一个对象（单例）？" + String.valueOf(s1 == s2));
	}
}

class Singleton {

	// 1. 构造私有化
	private Singleton() {
	}

	// 2. 提供静态共有方法，使用时才创建
	private static Singleton instance;

	public static Singleton getinstance() {

		if (instance == null) {
			instance = new Singleton();
		} // 在多线程的情况下可能创建多个对象，不保证单例

		return instance;
	}
}