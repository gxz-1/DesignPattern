package InterfaceSegregation;

/*
 * �ӿڸ���ԭ��
 * �ͻ��˲�Ӧ������������Ҫ�Ľӿڣ���һ�������һ���������Ӧ��������С�ӿ���.
 * 
 * ��Aͨ���ӿ�interface1������B��
 * ��cͨ����Ointerface1������D��
 * ����ӿ�Interface1������A����c��˵������С�ӿڣ�����Aֻʹ��1��2��3��Cֻʹ��1��4��5��
 * ��ô��B����D����ȥʵ�����ǲ���Ҫ�ķ���
 */
interface interface1 {
	void operation1();

	void operation2();

	void operation3();

	void operation4();

	void operation5();

}

class B implements interface1 {

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

	@Override
	public void operation4() {
		// TODO Auto-generated method stub
		System.out.println("B->operation4");
	}

	@Override
	public void operation5() {
		// TODO Auto-generated method stub
		System.out.println("B->operation5");
	}

}

class D implements interface1 {
	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		System.out.println("D->operation1");
	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
		System.out.println("D->operation2");
	}

	@Override
	public void operation3() {
		// TODO Auto-generated method stub
		System.out.println("D->operation3");
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

class A {
	public void depend1(interface1 i) {
		i.operation1();
	}

	public void depend2(interface1 i) {
		i.operation2();
	}

	public void depend3(interface1 i) {
		i.operation3();
	}
}

class C {
	public void depend1(interface1 i) {
		i.operation1();
	}

	public void depend4(interface1 i) {
		i.operation4();
	}

	public void depend5(interface1 i) {
		i.operation5();
	}
}

public class example1 {
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
