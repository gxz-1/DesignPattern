
class Originator {
	private String state;
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state=state;
	}
	
	//编写一个方法，可以保存一个状态对象 Memento
	public Memento saveStateMemento() {
		return new Memento(state);
	}
	
	//通过备忘录对象恢复对象
	public void getStateMemento(Memento memento) {
		state=memento.getState();
	}
}
