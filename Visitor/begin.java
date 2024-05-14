
class begin {
	public static void main(String[] args) {
		//创建 数据结构
		ObjectStructure os=new ObjectStructure();
		os.attach(new Man());
		os.attach(new Man());
		os.attach(new Woman());
		
		//成功
		Success success=new Success();
		os.diaplay(success);
	}
}
