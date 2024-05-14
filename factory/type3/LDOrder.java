package type3;

public class LDOrder extends Order {

	@Override
	pizza createPizza(String pizzaType) {
		// TODO Auto-generated method stub
		pizza p=null;
		if(pizzaType.equals("cheese")) {
			p=new LDcheesepizza();
		}else if (pizzaType.equalsIgnoreCase("Greek")) {
			p=new LDGreekpizza();
		}
		return p;
	}

}
