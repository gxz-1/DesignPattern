
class theClient {
	public static void main(String[] args) {
		//����һ������
		WebsiteFactory wf = new WebsiteFactory();
		
		//�ͻ�1Ҫһ����������ʽ��������վ
		WebSite webSite1 = wf.getWebSiteCategory("����");
		webSite1.use(new User("����"));
		
		//�ͻ�2Ҫһ���Բ�����ʽ��������վ
		WebSite webSite2 = wf.getWebSiteCategory("����");
		webSite2.use(new User("����"));
		
		//�ͻ�3Ҫһ���Բ�����ʽ��������վ
		WebSite webSite3 = wf.getWebSiteCategory("����");
		webSite3.use(new User("����"));
		
		System.out.println("��վʵ�ʹ����ٸ���"+wf.getnum());
	}
}
