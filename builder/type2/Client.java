package type2;

public class Client {
//�û�ʹ�ò�ͬ�Ľ����ߴ�����ͬ�Ĳ�Ʒ����
	public static void main(String[] args) {
		// ����ͨ����
		BuildCommonHouse c = new BuildCommonHouse();// ������ ��������ľ������
		Director dir = new Director();
		dir.setBuilder(c);
		House house = dir.construct();

		// �Ǹ�¥
		BuildHighBuilding h = new BuildHighBuilding();// ��������ľ������
		dir.setBuilder(h);
		house = dir.construct();
	}

}
