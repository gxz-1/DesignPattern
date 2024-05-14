package type4;

public class Sheep implements Cloneable//实现Cloneable接口
{
	String name;
	int age;
	String color;
	Sheep friend;//对象作为成员变量
	
	public Sheep(String name, int age, String color,Sheep friend) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.friend=friend;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + "]";
	}

	//1.重写克隆方法实现深拷贝
	protected Object clone() {
		Sheep sheep=null;
		try {
			sheep=(Sheep)super.clone();//这里完成基本数据类型的克隆
			//对引用类型进行单独处理
			if(sheep.friend!=null) {
				sheep.friend=(Sheep)this.friend.clone();//调用成员变量的Clone方法				
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Object)sheep;
	}
}
