package LiskovSubstitution;
/*
 * �����滻ԭ��
 * ���ڸ�������࣬�Ѹ���ķ����滻Ϊ������ã����ܲ������仯��
 * ����֮���������о�����Ҫ��д����ķ�����
 * ��Ϊͨ����д����ķ�������µĹ��ܣ������̳���ϵ�ĸ����Բ���޸ĸ��࣬��Ҫ�޸����ࣩ
 * ��ˣ���ԭ���ĸ�������๲ͬ�̳�һ�����࣬��ԭ�еļ̳й�ϵ�滻���������ۺϡ���Ϲ�ϵ��
 * 
 */
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A().func1();

		new B().func1();//B��д��A
		new B().func2();
	}

}

class A {
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("A->func1");
	}
}

//B��̳�A����ԭ�����Ļ����������µĹ���
class B extends A {
	@Override
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("B->func1");
	}

	public void func2() {
		System.out.println("B->func2");
	}
}
