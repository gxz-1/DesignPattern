package type2;
/*
 * ��������ģʽ����ĳ����Ľӿ�ת���ɿͻ�����������һ���ӿڱ�ʾ��
 * ����Ŀ���Ǽ����ԣ���ԭ����ӿڲ�ƥ�䲻��һ���������������Эͬ������
 */
class Phone {


	//���
	public void charging(Voltage5V voltage5v) {
		if(voltage5v.output5V()==5) {
			System.out.println("��ѹΪ5V�����Գ��");
		}
		else if (voltage5v.output5V()>5) {
			System.out.println("����5V���ܳ��");
		}
	}

}
//1)	Java �ǵ��̳л��ƣ� ��Ϊ��Ҫ�� dst �����ǽӿڣ���һ��������;
//2)	src ��ķ����� Adapter �ж��ᱩ¶������Ҳ������ʹ�õĳɱ���

