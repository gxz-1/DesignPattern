package type3;

import java.util.Scanner;
//��������ģʽ�� ����һ����������
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
