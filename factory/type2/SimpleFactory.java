package type2;

class SimpleFactory {
	public static pizza createPizza(String pizzatype) {
		pizza p = null;
		System.out.println("使用简单工厂模式");

		if (pizzatype.equals("greek")) {
			p = new Greekpizza();
		} else if (pizzatype.equals("cheese")) {
			p = new cheesepizza();
		}
		return p;
	}
}
