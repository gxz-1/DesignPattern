
abstract class OrganizationComponent {
	
	private String name;//����
	private String des;//˵��

	protected void add(OrganizationComponent oc) {
		//Ĭ��ʵ�� ��Ҷ�ӽ��ʹ��
		throw new UnsupportedOperationException();
	}
	
	protected void remove(OrganizationComponent oc) {
		//Ĭ��ʵ�� 
		throw new UnsupportedOperationException();
	}

	protected abstract void print();//�����ӡ����
	
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
