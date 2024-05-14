import java.util.ArrayList;
import java.util.List;

class Universitiy extends OrganizationComponent{

	//列表中存放学院
	List<OrganizationComponent> leaves=new ArrayList<OrganizationComponent>();
	
	public Universitiy(String name,String des) {
		super(name, des);
	}
	
	//重写add方法
	@Override
	protected void add(OrganizationComponent oc) {
		leaves.add(oc);
	}

	//重写remove
	@Override
	protected void remove(OrganizationComponent oc) {
		leaves.remove(oc);
	}

	@Override
	protected void print() {
		System.out.println("---------------"+getName()+"-----------------");
		for (OrganizationComponent uni: leaves) {
			uni.print();
		}
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
