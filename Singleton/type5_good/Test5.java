package type5_good;

//����ģʽ��˫�ؼ����doble check��
public class Test5 {
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

	// 2. volatile�ؼ����ñ������޸�����д�봢��
	private static volatile Singleton instance;

	//˫�ؼ�� ����̰߳�ȫ���⣬ͬʱ�������������
	public static Singleton getinstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}