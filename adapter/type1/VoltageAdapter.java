package type1;

//适配接口
 class VoltageAdapter extends Voltage220V implements Voltage5V {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		//获取到220V得电压
		int inV=output220V();
		int outV=inV/44;
		return outV;
	}



}
