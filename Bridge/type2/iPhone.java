package type2;

//充当桥梁 连接手机和品牌

abstract class iPhone {
	//组合品牌
	private Brand brand;
	
	//构造器
	public iPhone(Brand brand) {
		super();
		this.brand=brand;
	}
	
	protected void close() {
		brand.close();
	}
	
	protected void open() {
		brand.open();
	}
	
	protected void call() {
		brand.call();
	}
}
