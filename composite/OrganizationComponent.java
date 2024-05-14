
abstract class OrganizationComponent {
	
	private String name;//名字
	private String des;//说明

	protected void add(OrganizationComponent oc) {
		//默认实现 供叶子结点使用
		throw new UnsupportedOperationException();
	}
	
	protected void remove(OrganizationComponent oc) {
		//默认实现 
		throw new UnsupportedOperationException();
	}

	protected abstract void print();//抽象打印方法
	
	public OrganizationComponent() {
		// TODO Auto-generated constructor stub
	}
	
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	
}
