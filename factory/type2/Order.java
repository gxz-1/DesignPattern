package type2;

import java.util.Scanner;
//�򵥹���ģʽ
class Order {
	pizza p=null;
	public Order() {
		// TODO Auto-generated constructor stub
		do {
			System.out.println("����Ҫɶpizza");
			String pizzatype=new Scanner(System.in).next();//�û�����
			p=SimpleFactory.createPizza(pizzatype);
			
					if(p!=null)
					{
						p.prepare();
						p.bake();
						p.box();
						
					}
					else {
						System.out.println("û������pizza");
						break;
					}
		} while (true);
	}

}