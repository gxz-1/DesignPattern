package type5;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sheep implements Serializable// ʵ��Serializable(�����л�)�ӿ�
{
	String name;
	int age;
	String color;
	Sheep friend;

	public Sheep(String name, int age, String color, Sheep friend) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.friend = friend;
	}

	//��������ͨ����������л�ʵ�����
	Sheep func() {
		try {
			
			// ���л�
			ByteArrayOutputStream bos = new ByteArrayOutputStream();// �ֽ������
			ObjectOutputStream oos;
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);// ���������Զ������ķ�ʽ����

			// �����л�
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			return (Sheep) ois.readObject();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
