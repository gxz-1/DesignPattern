package DependecyInversion;
/*
 * �������ݵ����ַ�ʽ
 * 1.�ӿڴ���
 * 2.���췽������
 * 3.setter����
 */
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.�ӿڴ���
		
		//2.���췽������
		
		//3.setter��������
	}

}

//1.�ӿڴ���
interface p1{
	public void open(Msg1 msg);//Msg�ӿ���Ϊ�����Ĳ���
}

interface Msg1{
	public void send();
}


//ʵ�ֽӿ�
class realize1 implements p1{

	@Override
	public void open(Msg1 msg) {
		// TODO Auto-generated method stub
		msg.send();
	}
	
}
//ͨ������ʵ��Msg1�ӿ�ʵ�־��幦�ܣ������ͬ��

//2.���췽������
interface p2{
	public void open();
}

interface Msg2{
	public void send();
}

class realize2 implements p2{

	//Msg�ӿ���Ϊ��Ա
	private Msg2 msg;
	//���캯����ʼ��Msg
	public realize2(Msg2 msg) {
		this.msg = msg;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		msg.send();
	}
	
}

//3.setter��������
interface p3{
	public void open();
	
	//����setter������Msg��Ϊ��������
	public void setMsg(Msg3 msg);
}

interface Msg3{
	public void send();
}

class realize implements p3{
	//Msg��Ϊ��Ա����
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
