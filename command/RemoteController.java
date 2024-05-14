public class RemoteController {

	//按钮的命令数组
	Command[] onCommands;
	Command[] offCommands;

	// 执行撤销的命令
	Command undoCommand;

	// 构造器，完成对按钮初始化

	public RemoteController() {

		onCommands = new Command[5];
		offCommands = new Command[5];

		for (int i = 0; i < 5; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}//空命令用于初始化
	}

	// 给我们的按钮设置你需要的命令
	public void setCommand(int num, Command onCommand, Command offCommand) {
		onCommands[num] = onCommand;
		offCommands[num] = offCommand;
	}

	// 按下开按钮
	public void onButtonWasPushed(int num) { // no 0
		// 找到你按下的开的按钮， 并调用对应方法
		onCommands[num].execute();
		// 记录这次的操作，用于撤销
		undoCommand = onCommands[num];

	}

	// 按下关按钮
	public void offButtonWasPushed(int no) { // no 0
		// 找到你按下的关的按钮， 并调用对应方法
		offCommands[no].execute();
		// 记录这次的操作，用于撤销
		undoCommand = offCommands[no];

	}
	
	// 按下撤销按钮
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

}
