
class Woman extends Person{

	
	//说明
	//1. 使用双分派 首先在客户端程序中，将具体状态作为参数传递Women中
	//2. 然后调用方法将自己作为参数。
	@Override
	void accept(Action action) {
		// TODO Auto-generated method stub
		action.getWomanResult(this);
	}

}
