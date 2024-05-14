import java.util.ArrayList;
import java.util.List;

class Careteker {
	private List<Memento> mList=new ArrayList<Memento>();
	
	public void add(Memento memento) {
		mList.add(memento);
	}
	
	//获取到第index个备忘录对象
	public Memento get(int index) {
		return mList.get(index);
	}
}
