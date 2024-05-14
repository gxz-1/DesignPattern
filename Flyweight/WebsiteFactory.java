import java.util.HashMap;

//�䵱�أ���վ�����࣬�������󷵻ؾ��幤����
class WebsiteFactory {

	// ���ϣ��䵱�ص�����
	private HashMap<String, ConcreteWebsite> pool = new HashMap<String, ConcreteWebsite>();

	// ������վ�����ͣ�����һ����վ�����û���򴴽�һ����վ
	public WebSite getWebSiteCategory(String type) {
		if (!pool.containsKey(type)) {
			// û���򴴽�
			pool.put(type, new ConcreteWebsite(type));
		}

		return pool.get(type);
	}
	
	//���س��е���վ����
	public int getnum() {
		return pool.size();
	}

}
