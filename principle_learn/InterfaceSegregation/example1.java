package InterfaceSegregation;

/*
 * 接口隔离原则
 * 客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应建立在最小接口上.
 * 
 * 类A通过接口interface1依赖类B，
 * 类c通过接Ointerface1依赖类D，
 * 如果接口Interface1对于类A和类c来说不是最小接口（例中A只使用1，2，3，C只使用1，4，5）
 * 那么类B和类D必须去实现他们不需要的方法
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
		a.depend1(new B());//A类通过接口依赖B类
		a.depend2(new B());
		a.depend3(new B());

		C c = new C();
		c.depend1(new D());//C类通过接口依赖D类
		c.depend4(new D());
		c.depend5(new D());

	}
}
