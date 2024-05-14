package SingleResponsibility;

public class example3 {
	public static void main(String[] args) {
		vehicle2 v = new vehicle2();
		v.runRoad("汽车");
		v.runAir("火车");
		v.runAir("飞机");
	}
}

//虽然没有在类这个级别上遵守单一职责，但在方法上遵守
class vehicle2 {
	public void runRoad(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "在路上");
	}

	public void runAir(String name) {
		System.out.println(name + "在天上");
	}
}