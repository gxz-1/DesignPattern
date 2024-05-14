package LiskovSubstitution;
/*
 * 里氏替换的实现
 */

//创建基础类
class Base {
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("Base->func1");
	}
}

//A继承基类
class Aa extends Base {
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("Aa->func1");
	}
}

//B继承基类
class Bb extends Base {
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("Bb->func1");
	}

	public void func2() {
		// TODO Auto-generated method stub
		System.out.println("Bb->func2");
	}
}

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a=new Aa();
		Bb b=new Bb();
		a.func1();
		
		b.func1();
		b.func2();
	}

}
