package type1;
//缺点：把产品（房子）和创造房子的过程（建房子）封装在一起，耦合性强
//解决方式：把两者进行解耦---建造者模式
class Client {
	public static void main(String[] args) {
		new commonhouse().build();
	}
}
