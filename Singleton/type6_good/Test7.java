package type6_good;

//静态内部类
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton p1 = Singleton.getInstance();
		Singleton p2 = Singleton.getInstance();
		System.out.println("是否为单例？"+String.valueOf(p1.hashCode()==p2.hashCode()));
	}

}

//调用时才装载内部类，保证懒加载；静态保证线程安全
class Singleton{
	//1. 构造私有化
	private  Singleton() {}
	
	//2.创建内部类
	private static class SingletonInstance{
		private static final Singleton Instance=new Singleton();
	}
	
	//3. 返回单例
	public static Singleton getInstance() { 
		return SingletonInstance.Instance;
	}
}