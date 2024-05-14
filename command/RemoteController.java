public class RemoteController {

	//��ť����������
	Command[] onCommands;
	Command[] offCommands;

	// ִ�г���������
	Command undoCommand;

	// ����������ɶ԰�ť��ʼ��

	public RemoteController() {

		onCommands = new Command[5];
		offCommands = new Command[5];

		for (int i = 0; i < 5; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}//���������ڳ�ʼ��
	}

	// �����ǵİ�ť��������Ҫ������
	public void setCommand(int num, Command onCommand, Command offCommand) {
		onCommands[num] = onCommand;
		offCommands[num] = offCommand;
	}

	// ���¿���ť
	public void onButtonWasPushed(int num) { // no 0
		// �ҵ��㰴�µĿ��İ�ť�� �����ö�Ӧ����
		onCommands[num].execute();
		// ��¼��εĲ��������ڳ���
		undoCommand = onCommands[num];

	}

	// ���¹ذ�ť
	public void offButtonWasPushed(int no) { // no 0
		// �ҵ��㰴�µĹصİ�ť�� �����ö�Ӧ����
		offCommands[no].execute();
		// ��¼��εĲ��������ڳ���
		undoCommand = offCommands[no];

	}
	
	// ���³�����ť
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

}
