package type3;

//深拷贝与浅拷贝
public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheep friend=new Sheep("Jack",5,"black",null);
		Sheep sheep1 = new Sheep("Tom",1,"white",friend);
		Sheep sheep2 = (Sheep)sheep1.clone();//克隆
		System.out.println(sheep1);
		System.out.println(sheep1.friend.hashCode());
		System.out.println(sheep2);
		System.out.println(sheep2.friend.hashCode());//两者哈希值相同，为同一对象，浅拷贝
	}

}
