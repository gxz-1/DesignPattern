package type3;

public class Sheep implements Cloneable//ʵ��Cloneable�ӿ�
{
	String name;
	int age;
	String color;
	Sheep friend;//������Ϊ��Ա����
	

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
