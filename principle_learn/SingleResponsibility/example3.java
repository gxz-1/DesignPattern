package SingleResponsibility;

public class example3 {
	public static void main(String[] args) {
		vehicle2 v = new vehicle2();
		v.runRoad("����");
		v.runAir("��");
		v.runAir("�ɻ�");
	}
}

//��Ȼû������������������ص�һְ�𣬵��ڷ���������
class vehicle2 {
	public void runRoad(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "��·��");
	}

	public void runAir(String name) {
		System.out.println(name + "������");
	}
}