package type2;

public class SmartiPhone extends iPhone {
	public SmartiPhone(Brand brand) {
		// TODO Auto-generated constructor stub
		super(brand);
	}

	public void open() {
		super.open();
		System.out.println("�����ֻ�");
	}

	public void close() {
		super.close();
		System.out.println("�����ֻ�");
	}

	public void call() {
		super.call();
		System.out.println("�����ֻ�");
	}
}
