package type2;

//ͨ��ʵ��Clonable�ӿ��ڵ�clone����ʵ�ֿ�¡
public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheep sheep1 = new Sheep("Tom",1,"white");
		Sheep sheep2 = (Sheep)sheep1.clone();//��¡
		System.out.println(sheep1);
		System.out.println(sheep2);
	}

}
