import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College{
	
	List<Majority> majorities;

	public InfoCollege(List<Majority> majorities) {
		super();
		this.majorities = majorities;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "信息工程学院";
	}

	@Override
	public void addMajorty(String name, String desc) {
		// TODO Auto-generated method stub
		Majority m = new Majority();
		m.setDesc(desc);
		m.setName(name);
		
		majorities.add(m);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new InfoCollegeIterator(majorities);
	}


}
