//���ģʽ

public class Manager {
	public static void main(String[] args) {
		//�Ӵ�С��������
		OrganizationComponent universitiy = new Universitiy("�廪��ѧ", "985");
		
		//����ѧԺ
		OrganizationComponent colleage1 = new Colleage("�����ѧԺ", "ѧ�������");
		OrganizationComponent colleage2 = new Colleage("��ѧѧԺ", "ѧ��ѧ��");
		
		//����ϵ
		OrganizationComponent department1=new Department("�������ѧ�뼼��", "��Ӳ����");
		OrganizationComponent department2=new Department("�������", "���Ϊ��");
		OrganizationComponent department3=new Department("ͳ����ѧ", "ѧͳ����ѧͦ�õ�");
		
		universitiy.add(colleage1);
		universitiy.add(colleage2);
		
		colleage1.add(department1);
		colleage1.add(department2);
		colleage2.add(department2);
		
		universitiy.print();
		
		//Դ����� Hashmap   Map---Component
	}
}
