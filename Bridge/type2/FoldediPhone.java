package type2;

public class FoldediPhone extends iPhone {
	public FoldediPhone(Brand brand) {
		// TODO Auto-generated constructor stub
		super(brand);
	}

	public void open() {
		super.open();
		System.out.println("�۵��ֻ�");
	}

	public void close() {
		super.close();
		System.out.println("�۵��ֻ�");
	}

	public void call() {
		super.call();
		System.out.println("�۵��ֻ�");
	}
}
