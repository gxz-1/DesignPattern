package SingleResponsibility;

public class example1 {

	public static void main(String[] args) {
		vehicle v = new vehicle();
		v.run("����");
		v.run("��");
		v.run("�ɻ�");//�˴��ɻ�Υ���˵�һְ��ԭ��
	}

}

class vehicle{
	public void run(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"�ڹ�·��");
	}
}