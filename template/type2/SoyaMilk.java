package type2;

//�����࣬��ʾ����
abstract class SoyaMilk {

//ģ�巽��, make , ģ�巽���������� final , ��������ȥ����. 
	final void make() {

		select();
		
		//���ݹ��ӷ��������Ƿ��������
		if(customerWantCondiments()) {
			addCondiments();
			}

		soak();
		beat();

	}

//ѡ����
	void select() {
		System.out.println("��һ����ѡ��õ����ʻƶ�	");
	}

//��Ӳ�ͬ�����ϣ� ���󷽷�,  �������ʵ��
	abstract void addCondiments();

//����

	void soak() {
		System.out.println("�������� �ƶ������Ͽ�ʼ���ݣ� ��Ҫ 3 Сʱ ");
	}

	void beat() {
		System.out.println("���Ĳ����ƶ������Ϸŵ�������ȥ����	");
	}

	// ���ӷ����������Ƿ���Ҫ�������
	boolean customerWantCondiments() {
		return true;
	}

}
