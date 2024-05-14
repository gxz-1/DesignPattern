package type2;

import java.util.Scanner;
//简单工厂模式
class Order {
	pizza p=null;
	public Order() {
		// TODO Auto-generated constructor stub
		do {
			System.out.println("你想要啥pizza");
			String pizzatype=new Scanner(System.in).next();//用户输入
			p=SimpleFactory.createPizza(pizzatype);
			
					if(p!=null)
					{
						p.prepare();
						p.bake();
						p.box();
						
					}
					else {
						System.out.println("没有这种pizza");
						break;
					}
		} while (true);
	}

}