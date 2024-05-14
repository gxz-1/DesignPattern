package type5;



//深拷贝
//方法二：通过对象的序列化实现深拷贝
public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheep friend=new Sheep("Jack",5,"black",null);
		Sheep sheep1 = new Sheep("Tom",1,"white",friend);
				
		Sheep sheep2=sheep1.func();//实现序列化
		
		System.out.println(sheep1);
		System.out.println(sheep1.friend.hashCode());
		System.out.println(sheep2);
		System.out.println(sheep2.friend.hashCode());
	}

}
