package type1;

//代理对象，静态代理
public class TeacherProxy implements aTeacher{

	private aTeacher target;
	
	public TeacherProxy(aTeacher target) {
		this.target=target;
	}
	@Override
	public void teach() {
		System.out.println("开始代理吧");
		
		target.teach();
		
		System.out.println("代理结束");
	}
	
}
