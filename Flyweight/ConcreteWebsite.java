
class ConcreteWebsite extends WebSite{

	//����Ĳ���
	private String type="";//��վ����������
		
	
	public ConcreteWebsite(String type) {
		this.type=type;
	}


	@Override
	public void use(User use) {
		System.out.println(use.getName()+":��վ�ķ�����ʽΪ"+type);
	}

}
