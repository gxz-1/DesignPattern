package type5;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sheep implements Serializable// 实现Serializable(可序列化)接口
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

	//方法二：通过对象的序列化实现深拷贝
	Sheep func() {
		try {
			
			// 序列化
			ByteArrayOutputStream bos = new ByteArrayOutputStream();// 字节流输出
			ObjectOutputStream oos;
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);// 将对象本身以对象流的方式输入

			// 反序列化
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
