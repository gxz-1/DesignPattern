package type4;

import java.util.Scanner;
//���ô��빤������Ϊ����
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
