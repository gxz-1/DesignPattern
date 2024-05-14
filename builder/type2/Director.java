package type2;

public class Director {
	Builder builder=null;

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}//用set方法或者构造函数构造builder
	
	//如何处理建造房子的过程由指挥者决定
	public House construct() {
		builder.buildBasic();
		builder.buildwalls();
		builder.roofed();
		return builder.buildHouse();
	}
	
	
}
