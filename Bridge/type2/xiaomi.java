package type2;

public class xiaomi implements Brand{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("小米手机关机");
		
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("小米手机开机");
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("小米手机打电话");
	}

}
