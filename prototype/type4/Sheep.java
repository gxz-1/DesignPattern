package type4;

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

	//1.��д��¡����ʵ�����
	protected Object clone() {
		Sheep sheep=null;
		try {
			sheep=(Sheep)super.clone();//������ɻ����������͵Ŀ�¡
			//���������ͽ��е�������
			if(sheep.friend!=null) {
				sheep.friend=(Sheep)this.friend.clone();//���ó�Ա������Clone����				
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Object)sheep;
	}
}
