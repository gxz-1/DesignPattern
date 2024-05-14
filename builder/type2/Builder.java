package type2;

//抽象的建造者
public abstract class Builder {
	
	protected House house = new House();

	// 将建造的流程写好，抽象方法
	public abstract void buildBasic();

	public abstract void buildwalls();

	public abstract void roofed();

	// 建房子
	public House buildHouse() {
		return house;
	}
}
