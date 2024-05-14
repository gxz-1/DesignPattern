import java.util.Iterator;
import java.util.List;

class InfoCollegeIterator implements Iterator{

	//以List方式存放
	List<Majority> majorities;
	int index=-1;
	
	public InfoCollegeIterator(List<Majority> majorities) {
		super();
		this.majorities = majorities;
	}
	

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index>=majorities.size()-1) {
			return false;
		}
		else {
			index++;
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return majorities.get(index);
	}
	
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		Iterator.super.remove();
	}
	
}
