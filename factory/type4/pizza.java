package type4;

abstract class pizza {
	private String name;

	// 原材料不同，设置成抽象
	public abstract void prepare();

	public void bake() {
		System.out.println(name + "baking;");
	}

	public void cut() {
		System.out.println(name + "cutting;");
	}

	public void box() {
		System.out.println(name + "boxing;");
	}

	public void setName(String name) {
		this.name = name;
	}
}
