package SingleResponsibility;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoadVehicle rV = new RoadVehicle();
		rV.run("汽车");
		rV.run("火车");
		
		//遵循了单一职责原则，但开销过大
		AirVehicle aV=new AirVehicle();
		aV.run("飞机");
	}

}

class RoadVehicle{
	public void run(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"在公路上");
	}
}


class AirVehicle{
	public void run(String name) {
		System.out.println(name+"在天上");
	}
}