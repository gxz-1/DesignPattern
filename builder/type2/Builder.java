package type2;

//����Ľ�����
public abstract class Builder {
	
	protected House house = new House();

	// �����������д�ã����󷽷�
	public abstract void buildBasic();

	public abstract void buildwalls();

	public abstract void roofed();

	// ������
	public House buildHouse() {
		return house;
	}
}
