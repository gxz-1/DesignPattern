package DependecyInversion;

//example1的解决思路
/*
 * 依赖倒转---思路是面向接口编程
 * 引入抽象接口IReceiver,表示接收者，Person与接口发生依赖，而具体类实现接口
 * 
 */
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		people p= new people();
		p.receiver(new mail());
		p.receiver(new Wechat());
	}

}

interface IReceiver{
	public String getInFo();
}

class mail implements IReceiver{

	@Override
	public String getInFo() {
		// TODO Auto-generated method stub
		return "邮箱已收到";
	}
	
}

class Wechat implements IReceiver{

	@Override
	public String getInFo() {
		// TODO Auto-generated method stub
		return "微信已收到";
	}
	
}

class people{
	//此处
	public void receiver(IReceiver iReceiver){
		System.out.println(iReceiver.getInFo());;
	}
}