package DependecyInversion;
/*
 * 依赖传递的三种方式
 * 1.接口传递
 * 2.构造方法传递
 * 3.setter传递
 */
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.接口传递
		
		//2.构造方法传递
		
		//3.setter方法传递
	}

}

//1.接口传递
interface p1{
	public void open(Msg1 msg);//Msg接口作为方法的参数
}

interface Msg1{
	public void send();
}


//实现接口
class realize1 implements p1{

	@Override
	public void open(Msg1 msg) {
		// TODO Auto-generated method stub
		msg.send();
	}
	
}
//通过具体实现Msg1接口实现具体功能，后面的同理。

//2.构造方法传递
interface p2{
	public void open();
}

interface Msg2{
	public void send();
}

class realize2 implements p2{

	//Msg接口作为成员
	private Msg2 msg;
	//构造函数初始化Msg
	public realize2(Msg2 msg) {
		this.msg = msg;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		msg.send();
	}
	
}

//3.setter方法传递
interface p3{
	public void open();
	
	//创建setter方法，Msg作为函数参数
	public void setMsg(Msg3 msg);
}

interface Msg3{
	public void send();
}

class realize implements p3{
	//Msg作为成员变量
	private Msg3 msg;
	
	@Override
	public void setMsg(Msg3 msg) {
		// TODO Auto-generated method stub
		this.msg=msg;
	}
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		msg.send();
	}
	
}
