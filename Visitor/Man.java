
class Man extends Person{

	@Override
	void accept(Action action) {
		// TODO Auto-generated method stub
		action.getManResult(this);
	}

}
