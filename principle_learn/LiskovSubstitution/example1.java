package LiskovSubstitution;
/*
 * 里氏替换原则
 * 对于父类和子类，把父类的方法替换为子类调用，功能不发生变化。
 * 简言之，在子类中尽量不要重写父类的方法。
 * 因为通过重写父类的方法完成新的功能，整个继承体系的复用性差（若修改父类，还要修改子类）
 * 因此，把原来的父类和子类共同继承一个基类，把原有的继承关系替换成依赖、聚合、组合关系。
 * 
 */
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A().func1();

		new B().func1();//B重写了A
		new B().func2();
	}

}

class A {
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("A->func1");
	}
}

//B类继承A并在原方法的基础上增加新的功能
class B extends A {
	@Override
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("B->func1");
	}

	public void func2() {
		System.out.println("B->func2");
	}
}
