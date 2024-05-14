package type2;

//��type1���ƣ�ֻ��������ʵ�������ھ�̬�������

public class Test2 {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getinstance();
		Singleton s2 = Singleton.getinstance();
		System.out.println("�����Ƿ���ͬһ�����󣨵�������"+String.valueOf(s1==s2));

	}
}

class Singleton{
	
	//1. ������˽�л�����ֹnew����
	private Singleton() {
		
	}
	
	//2. ���ڲ�������̬����ʵ��
	private static  Singleton instance;
	
	static {//�ھ�̬������д�����������
		instance=new Singleton();
	}
		
	//3. �ṩһ�����еľ�̬���������ض���
	public static Singleton getinstance() {
		return instance;
	}
} 