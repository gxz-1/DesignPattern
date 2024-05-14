import java.util.List;
import java.util.LinkedList;

public class ObjectStructure {
	//ά����һ������
	private List<Person> persons=new LinkedList<>();
	
	//����
	void attach(Person person) {
		persons.add(person);
	}
	
	//�Ƴ�
	void detach(Person person) {
		persons.remove(person);
	}
	
	//��ʾ�������
	void diaplay(Action action) {
		for (Person p : persons) {
			p.accept(action);
		}
	}



}
