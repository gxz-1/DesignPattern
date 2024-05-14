package type2;

//适配接口
 class VoltageAdapter implements Voltage5V {
	 
	 private Voltage220V voltage220V;//聚合关系
	 
	public VoltageAdapter(Voltage220V voltage220v) {
		super();
		voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		//获取到220V得电压
		int inV=voltage220V.output220V();
		System.out.println("使用对象适配器进行转化");
		int outV=inV/44;
		return outV;
	}



}
