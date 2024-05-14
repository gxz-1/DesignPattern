
class cClient {
	public static void main(String[] args) {
		Originator originator=new Originator();
		Careteker careteker = new Careteker();
		
		originator.setState("状态#1 ");
		
		careteker.add(originator.saveStateMemento());//保存了当前的状态
		
		originator.setState("状态#2");
		
		careteker.add(originator.saveStateMemento());		
		
		originator.setState("状态#3");
		
		careteker.add(originator.saveStateMemento());
		
		//恢复状态2
		originator.getStateMemento(careteker.get(1));
		System.out.println("当前状态："+originator.getState());
	}
}
