package type3;

//����ģʽ������ʽ��
//�����̰߳�ȫ����
public class Test3 {
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

	public static Singleton getinstance() {

		if (instance == null) {
			instance = new Singleton();
		} // �ڶ��̵߳�����¿��ܴ���������󣬲���֤����

		return instance;
	}
}