import java.util.List;
import java.util.LinkedList;

public class ObjectStructure {
	//维护了一个集合
	private List<Person> persons=new LinkedList<>();
	
	//增加
	void attach(Person person) {
		persons.add(person);
	}
	
	//移除
	void detach(Person person) {
		persons.remove(person);
	}
	
	//显示测评情况
	void diaplay(Action action) {
		for (Person p : persons) {
			p.accept(action);
		}
	}



}
