package type3;

public class BJOrder extends Order {

	@Override
	pizza createPizza(String pizzaType) {
		// TODO Auto-generated method stub
		pizza p=null;
		if(pizzaType.equals("cheese")) {
			p=new BJcheesepizza();
		}else if (pizzaType.equalsIgnoreCase("Greek")) {
			p=new BJGreekpizza();
		}
		return p;
	}

}
