package type3;

import java.util.Scanner;
//工厂方法模式： 抽象一个工厂方法
public abstract class Order {
	abstract pizza createPizza(String pizzaType);
	
	public Order() {
		pizza p=null;
		String pizzaType;
		do {
			pizzaType=new Scanner(System.in).next();
			p=createPizza(pizzaType);
			p.prepare();
			p.bake();
			p.box();
		} while (true);
	}
}
