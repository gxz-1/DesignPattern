package type1;

//饿汉式（静态）
//类装载的时候完成类的实例化，避免了线程同步问题，但可能造成内存浪费。

public class Test01 {
public static void main(String[] args) {
	Singleton s1 = Singleton.getinstance();
	Singleton s2 = Singleton.getinstance();
	System.out.println("两者是否是同一个对象（单例）？"+String.valueOf(s1==s2));
	
}
}

class Singleton{
	
	//1. 构造器私有化，防止new创建
	private Singleton() {}
	
	//2. 类内部创建静态对象实例
	private final static  Singleton instance=new Singleton();
	//final保证 instance不能指向其他对象，
	//static保证创建类创建对象且为类共有从而保证唯一
		
	//3. 提供一个共有的静态方法，返回对象
	public static Singleton getinstance() {
		return instance;
	}
} 