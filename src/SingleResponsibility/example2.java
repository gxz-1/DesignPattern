package SingleResponsibility;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoadVehicle rV = new RoadVehicle();
		rV.run("����");
		rV.run("��");
		
		//��ѭ�˵�һְ��ԭ�򣬵���������
		AirVehicle aV=new AirVehicle();
		aV.run("�ɻ�");
	}

}

class RoadVehicle{
	public void run(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"�ڹ�·��");
	}
}


class AirVehicle{
	public void run(String name) {
		System.out.println(name+"������");
	}
}