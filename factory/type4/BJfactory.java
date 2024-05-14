package type4;

public class BJfactory implements absfactory{

	@Override
	public pizza createpizza(String pizzatype) {
		// TODO Auto-generated method stub
		pizza p=null;
		if(pizzatype.equals("cheese")) {
			p=new BJcheesepizza();
		}else if (pizzatype.equalsIgnoreCase("Greek")) {
			p=new BJGreekpizza();
		}
		return p;
	}

	
}
