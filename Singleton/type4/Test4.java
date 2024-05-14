package type4;

public class Test4 {
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

	//加锁解决线程安全问题
	public static synchronized Singleton getinstance() {


		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
}