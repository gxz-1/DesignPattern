
class begin {
	public static void main(String[] args) {
		//���� ���ݽṹ
		ObjectStructure os=new ObjectStructure();
		os.attach(new Man());
		os.attach(new Man());
		os.attach(new Woman());
		
		//�ɹ�
		Success success=new Success();
		os.diaplay(success);
	}
}
