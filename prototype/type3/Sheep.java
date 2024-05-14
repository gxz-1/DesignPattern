package type3;

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

	@Override
	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
