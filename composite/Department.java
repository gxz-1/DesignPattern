
class Department extends OrganizationComponent{
	
	public Department(String name,String des) {
		super(name, des);
	}

	@Override
	protected void print() {
		System.out.println(getName());
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}

	@Override
	public void setDes(String des) {
		// TODO Auto-generated method stub
		super.setDes(des);
	}
}
