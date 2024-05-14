
class theClient {
	public static void main(String[] args) {
		//创建一个工厂
		WebsiteFactory wf = new WebsiteFactory();
		
		//客户1要一个以新闻形式发布的网站
		WebSite webSite1 = wf.getWebSiteCategory("新闻");
		webSite1.use(new User("张三"));
		
		//客户2要一个以博客形式发布的网站
		WebSite webSite2 = wf.getWebSiteCategory("博客");
		webSite2.use(new User("李四"));
		
		//客户3要一个以博客形式发布的网站
		WebSite webSite3 = wf.getWebSiteCategory("博客");
		webSite3.use(new User("王五"));
		
		System.out.println("网站实际共多少个？"+wf.getnum());
	}
}
