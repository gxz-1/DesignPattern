package type5_good;

//单例模式（双重检查型doble check）
public class Test5 {
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

	// 2. volatile关键字让变量有修改立即写入储存
	private static volatile Singleton instance;

	//双重检查 解决线程安全问题，同时解决懒加载问题
	public static Singleton getinstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}