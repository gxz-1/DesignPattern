package DependecyInversion;

//example1�Ľ��˼·
/*
 * ������ת---˼·������ӿڱ��
 * �������ӿ�IReceiver,��ʾ�����ߣ�Person��ӿڷ�����������������ʵ�ֽӿ�
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
		return "�������յ�";
	}
	
}

class Wechat implements IReceiver{

	@Override
	public String getInFo() {
		// TODO Auto-generated method stub
		return "΢�����յ�";
	}
	
}

class people{
	//�˴�
	public void receiver(IReceiver iReceiver){
		System.out.println(iReceiver.getInFo());;
	}
}