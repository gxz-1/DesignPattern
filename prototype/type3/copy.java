package type3;

//�����ǳ����
public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheep friend=new Sheep("Jack",5,"black",null);
		Sheep sheep1 = new Sheep("Tom",1,"white",friend);
		Sheep sheep2 = (Sheep)sheep1.clone();//��¡
		System.out.println(sheep1);
		System.out.println(sheep1.friend.hashCode());
		System.out.println(sheep2);
		System.out.println(sheep2.friend.hashCode());//���߹�ϣֵ��ͬ��Ϊͬһ����ǳ����
	}

}
