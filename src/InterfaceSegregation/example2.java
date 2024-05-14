package InterfaceSegregation;
/*
 * example�Ľ��������
 * ���ӿ�Interface1���Ϊ�����ļ����ӿڣ���A����C�ֱ���������Ҫ�Ľӿڽ���������ϵ�������ýӿڸ���ԭ��
 * �ӿ�Interface1�г��ֵķ���������ʵ��������Ϊ�����ӿڴ���ʵ��
 */

interface IInterface1{
	void operation1();
}

interface interface2{
	void operation2();
	void operation3();
}

interface interface3{
	void operation4();
	void operation5();
}
class Bb implements IInterface1,interface2{

	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		System.out.println("B->operation1");
	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
		System.out.println("B->operation2");
	}

	@Override
	public void operation3() {
		// TODO Auto-generated method stub
		System.out.println("B->operation3");
	}

	
}

class Dd implements IInterface1,interface3{
	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		System.out.println("D->operation1");
	}

	@Override
	public void operation4() {
		// TODO Auto-generated method stub
		System.out.println("D->operation4");
	}

	@Override
	public void operation5() {
		// TODO Auto-generated method stub
		System.out.println("D->operation5");
	}
}

class Aa{
	public void depend1(interface1 i) {
		i.operation1();
	}
	
	public void depend2(interface2 i) {
		i.operation2();
	}
	
	public void depend3(interface2 i) {
		i.operation3();
	}
}

class Cc{
	public void depend1(interface1 i) {
		i.operation1();
	}
	
	public void depend4(interface3 i) {
		i.operation4();
	}
	
	public void depend5(interface3 i) {
		i.operation5();
	}
}

public class example2{
	public static void main(String[] args) {
		
		A a = new A();
		a.depend1(new B());//A��ͨ���ӿ�����B��
		a.depend2(new B());
		a.depend3(new B());
		
		C c = new C();
		c.depend1(new D());//C��ͨ���ӿ�����D��
		c.depend4(new D());
		c.depend5(new D());
		
	}
}
