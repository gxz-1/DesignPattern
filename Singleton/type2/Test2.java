package type2;

//与type1类似，只不过将类实例化放在静态代码块中

public class Test2 {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getinstance();
		Singleton s2 = Singleton.getinstance();
		System.out.println("两者是否是同一个对象（单例）？"+String.valueOf(s1==s2));

	}
}

class Singleton{
	
	//1. 构造器私有化，防止new创建
	private Singleton() {
		
	}
	
	//2. 类内部创建静态对象实例
	private static  Singleton instance;
	
	static {//在静态代码块中创建单例对象
		instance=new Singleton();
	}
		
	//3. 提供一个共有的静态方法，返回对象
	public static Singleton getinstance() {
		return instance;
	}
} 