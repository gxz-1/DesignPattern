package type2;

import java.util.Observable;
  
class someClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����weatherdata
		WeatherData weatherData = new WeatherData();
		
		//�����۲���
		baidusite baidu= new baidusite();
		sohusite sohusite = new sohusite();
		//ע��
		weatherData.registerObserver(baidu);
		weatherData.registerObserver(sohusite);
		
		//����
		System.out.println("֪ͨ����ע��Ĺ۲���");
		weatherData.setData(10f, 100f, 30.3f);
		
		//ȡ��ע��
		weatherData.removeObserver(sohusite);
		
		System.out.println("ȡ���Ѻ���");
		weatherData.notifyObserver();
	}

}
