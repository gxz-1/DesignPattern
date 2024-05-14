package DependecyInversion;

public class example1 {
	public static void main(String[] args) {
		new Person().recive(new Email());
	}
}

//邮件消息类
class Email {
	public String getinFo() {
		// TODO Auto-generated method stub
		return "电子邮件信息。";
	}
}

//完成Person接收消息的功能
class Person {
	public void recive(Email e) {
		// TODO Auto-generated method stub
		System.out.println(e.getinFo());
	}
}
//问题：如果接收的不是邮件，而是微信、短信，Person类则需要增加相应的接收方法。
