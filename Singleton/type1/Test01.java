package type1;

//����ʽ����̬��
//��װ�ص�ʱ��������ʵ�������������߳�ͬ�����⣬����������ڴ��˷ѡ�

public class Test01 {
public static void main(String[] args) {
	Singleton s1 = Singleton.getinstance();
	Singleton s2 = Singleton.getinstance();
	System.out.println("�����Ƿ���ͬһ�����󣨵�������"+String.valueOf(s1==s2));
	
}
}

class Singleton{
	
	//1. ������˽�л�����ֹnew����
	private Singleton() {}
	
	//2. ���ڲ�������̬����ʵ��
	private final static  Singleton instance=new Singleton();
	//final��֤ instance����ָ����������
	//static��֤�����ഴ��������Ϊ�๲�дӶ���֤Ψһ
		
	//3. �ṩһ�����еľ�̬���������ض���
	public static Singleton getinstance() {
		return instance;
	}
} 