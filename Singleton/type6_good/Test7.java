package type6_good;

//��̬�ڲ���
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton p1 = Singleton.getInstance();
		Singleton p2 = Singleton.getInstance();
		System.out.println("�Ƿ�Ϊ������"+String.valueOf(p1.hashCode()==p2.hashCode()));
	}

}

//����ʱ��װ���ڲ��࣬��֤�����أ���̬��֤�̰߳�ȫ
class Singleton{
	//1. ����˽�л�
	private  Singleton() {}
	
	//2.�����ڲ���
	private static class SingletonInstance{
		private static final Singleton Instance=new Singleton();
	}
	
	//3. ���ص���
	public static Singleton getInstance() { 
		return SingletonInstance.Instance;
	}
}