package type1;

//������󣬾�̬����
public class TeacherProxy implements aTeacher{

	private aTeacher target;
	
	public TeacherProxy(aTeacher target) {
		this.target=target;
	}
	@Override
	public void teach() {
		System.out.println("��ʼ�����");
		
		target.teach();
		
		System.out.println("�������");
	}
	
}
