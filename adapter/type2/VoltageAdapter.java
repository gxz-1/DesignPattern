package type2;

//����ӿ�
 class VoltageAdapter implements Voltage5V {
	 
	 private Voltage220V voltage220V;//�ۺϹ�ϵ
	 
	public VoltageAdapter(Voltage220V voltage220v) {
		super();
		voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		//��ȡ��220V�õ�ѹ
		int inV=voltage220V.output220V();
		System.out.println("ʹ�ö�������������ת��");
		int outV=inV/44;
		return outV;
	}



}
