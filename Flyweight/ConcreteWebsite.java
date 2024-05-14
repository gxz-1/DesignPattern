
class ConcreteWebsite extends WebSite{

	//共享的部分
	private String type="";//网站发布的类型
		
	
	public ConcreteWebsite(String type) {
		this.type=type;
	}


	@Override
	public void use(User use) {
		System.out.println(use.getName()+":网站的发布形式为"+type);
	}

}
