import java.util.Iterator;

class ComputerCollege implements College{

	Majority[] majorities;
	int num=0;//数组个数
	
	public ComputerCollege(Majority[] majorities) {
		this.majorities = majorities;
		num=majorities.length;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "计算机学院";
	}

	@Override
	public void addMajorty(String name, String desc) {
		// TODO Auto-generated method stub
		//创建
		Majority m = new Majority();
		m.setDesc(desc);
		m.setName(name);
		//放入数组
		majorities[num]=m;
		num++;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ComputerCollegeIterator(majorities);
	}
	
}
