package type4;

public class Test4 {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getinstance();
		Singleton s2 = Singleton.getinstance();
		System.out.println("�����Ƿ���ͬһ�����󣨵�������" + String.valueOf(s1 == s2));

	}
}

class Singleton {

	// 1. ����˽�л�
	private Singleton() {
	}

	// 2. �ṩ��̬���з�����ʹ��ʱ�Ŵ���
	private static Singleton instance;

	//��������̰߳�ȫ����
	public static synchronized Singleton getinstance() {


		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
}