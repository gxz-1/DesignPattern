package type4;

public class LDfactory implements absfactory{

	@Override
	public pizza createpizza(String pizzatype) {
		pizza p=null;
		if(pizzatype.equals("cheese")) {
			p=new LDcheesepizza();
		}else if (pizzatype.equalsIgnoreCase("Greek")) {
			p=new LDGreekpizza();
		}
		return p;
	}

}
