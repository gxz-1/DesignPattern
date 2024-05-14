package type2;

class PureSoyaMilk extends SoyaMilk{

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		
	}
	
	// 钩子方法，决定是否需要添加配料
	boolean customerWantCondiments() {
		return false;
	}

}
