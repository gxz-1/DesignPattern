package type2;

public class Director {
	Builder builder=null;

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}//��set�������߹��캯������builder
	
	//��δ����췿�ӵĹ�����ָ���߾���
	public House construct() {
		builder.buildBasic();
		builder.buildwalls();
		builder.roofed();
		return builder.buildHouse();
	}
	
	
}
