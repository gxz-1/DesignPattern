package type2;

//通过实现Clonable接口内的clone方法实现克隆
public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheep sheep1 = new Sheep("Tom",1,"white");
		Sheep sheep2 = (Sheep)sheep1.clone();//克隆
		System.out.println(sheep1);
		System.out.println(sheep2);
	}

}
