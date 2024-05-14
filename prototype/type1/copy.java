package type1;
//传统的克隆方式
public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheep sheep1 = new Sheep("Tom",1,"white");
		Sheep sheep2=new Sheep(sheep1.getName(),sheep1.getAge(),sheep1.getColor());//克隆羊
	}

}
