package type1;

//����ӿ�
 class VoltageAdapter extends Voltage220V implements Voltage5V {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		//��ȡ��220V�õ�ѹ
		int inV=output220V();
		int outV=inV/44;
		return outV;
	}



}
