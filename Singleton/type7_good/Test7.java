package type7_good;

//枚举模式
public class Test7 {
	public static void main(String[] args) {
		
		Singleton instance1 =Singleton.Instance;
		Singleton instance2 =Singleton.Instance;
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
		instance1.sayOK();
		instance2.sayOK();
	}

}

enum Singleton{
	Instance;//属性
	public void sayOK() {
		System.out.println("okkkk");
	}
}