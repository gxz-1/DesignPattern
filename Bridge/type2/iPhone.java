package type2;

//�䵱���� �����ֻ���Ʒ��

abstract class iPhone {
	//���Ʒ��
	private Brand brand;
	
	//������
	public iPhone(Brand brand) {
		super();
		this.brand=brand;
	}
	
	protected void close() {
		brand.close();
	}
	
	protected void open() {
		brand.open();
	}
	
	protected void call() {
		brand.call();
	}
}
