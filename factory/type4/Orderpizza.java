package type4;

import java.util.Scanner;
//利用传入工厂类作为参数
public class Orderpizza {
	public void setfactory(absfactory factory) {
		pizza p = null;
		do {
			String ordertype = new Scanner(System.in).next();
			p = factory.createpizza(ordertype);
			p.prepare();
			p.bake();
			p.box();
		} while (true);
	}
}
