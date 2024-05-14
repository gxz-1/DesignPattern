package type2;

public class Client {
//用户使用不同的建造者创建不同的产品对象
	public static void main(String[] args) {
		// 盖普通房子
		BuildCommonHouse c = new BuildCommonHouse();// 建造者 决定建造的具体过程
		Director dir = new Director();
		dir.setBuilder(c);
		House house = dir.construct();

		// 盖高楼
		BuildHighBuilding h = new BuildHighBuilding();// 决定建造的具体过程
		dir.setBuilder(h);
		house = dir.construct();
	}

}
