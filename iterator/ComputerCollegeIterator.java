import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator{

	
	//这里我们需要知道majorities是以怎样的方式存放
	Majority[] majorities;
	int pos;//遍历的位置
	
	
	//构造器传入majorities 
	public ComputerCollegeIterator(Majority[] majorities) {
		super();
		this.majorities = majorities;
	}

	//判断是否有下一个元素
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (pos>=majorities.length||majorities[pos]==null) {
			return false;
		}
		else {			
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Majority m=majorities[pos];
		pos++;
		return m;
	}
	
	public void remove() {
		
	}

}
