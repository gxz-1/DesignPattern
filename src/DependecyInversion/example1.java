package DependecyInversion;

public class example1 {
	public static void main(String[] args) {
		new Person().recive(new Email());
	}
}

//�ʼ���Ϣ��
class Email {
	public String getinFo() {
		// TODO Auto-generated method stub
		return "�����ʼ���Ϣ��";
	}
}

//���Person������Ϣ�Ĺ���
class Person {
	public void recive(Email e) {
		// TODO Auto-generated method stub
		System.out.println(e.getinFo());
	}
}
//���⣺������յĲ����ʼ�������΢�š����ţ�Person������Ҫ������Ӧ�Ľ��շ�����
