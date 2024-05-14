import java.util.HashMap;

//充当池，网站工厂类，根据需求返回具体工厂类
class WebsiteFactory {

	// 集合，充当池的作用
	private HashMap<String, ConcreteWebsite> pool = new HashMap<String, ConcreteWebsite>();

	// 根据网站的类型，返回一个网站，如果没有则创建一个网站
	public WebSite getWebSiteCategory(String type) {
		if (!pool.containsKey(type)) {
			// 没有则创建
			pool.put(type, new ConcreteWebsite(type));
		}

		return pool.get(type);
	}
	
	//返回池中的网站数量
	public int getnum() {
		return pool.size();
	}

}
