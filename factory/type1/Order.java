package type1;

import java.util.Scanner;

public class Order {
	public Order() {
		// TODO Auto-generated constructor stub

		do {
			pizza p = null;
			Scanner s = new Scanner(System.in);
			String pizzatype = s.next();
			
			if (pizzatype.equals("greek")) {
				p = new Greekpizza();
			} else if (pizzatype.equals("cheese")) {
				p = new cheesepizza();
			} else {
				break;
			}

			p.setName(pizzatype);
			p.prepare();
			p.bake();
			p.cut();
			p.box();
		} while (true);

	}
}
