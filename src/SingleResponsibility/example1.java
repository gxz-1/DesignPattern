package SingleResponsibility;

public class example1 {

	public static void main(String[] args) {
		vehicle v = new vehicle();
		v.run("汽车");
		v.run("火车");
		v.run("飞机");//此处飞机违反了单一职责原则
	}

}

class vehicle{
	public void run(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"在公路上");
	}
}