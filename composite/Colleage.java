import java.util.ArrayList;
import java.util.List;

public class Colleage extends OrganizationComponent{
	
	//�б��д��ϵ
	List<OrganizationComponent> leaves=new ArrayList<OrganizationComponent>();
	
	public Colleage(String name,String des) {
		super(name, des);
	}
	
	//��дadd����
	@Override
	protected void add(OrganizationComponent oc) {
		leaves.add(oc);
	}

	//��дremove
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
