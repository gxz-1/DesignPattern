import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator{

	
	//����������Ҫ֪��majorities���������ķ�ʽ���
	Majority[] majorities;
	int pos;//������λ��
	
	
	//����������majorities 
	public ComputerCollegeIterator(Majority[] majorities) {
		super();
		this.majorities = majorities;
	}

	//�ж��Ƿ�����һ��Ԫ��
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
