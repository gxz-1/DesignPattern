package type2;
//�������������� Adapter �����޸ģ����Ǽ̳� src �࣬���ǳ��� src ���ʵ�����Խ�������Ե����⡣ 
//�������� src �࣬ʵ�� dst  ��ӿڣ���� src��dst ������
class user{
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}
}
