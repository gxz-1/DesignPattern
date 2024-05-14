package type2;

import java.util.Observable;
  
class someClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建weatherdata
		WeatherData weatherData = new WeatherData();
		
		//创建观察者
		baidusite baidu= new baidusite();
		sohusite sohusite = new sohusite();
		//注册
		weatherData.registerObserver(baidu);
		weatherData.registerObserver(sohusite);
		
		//测试
		System.out.println("通知各个注册的观察者");
		weatherData.setData(10f, 100f, 30.3f);
		
		//取消注册
		weatherData.removeObserver(sohusite);
		
		System.out.println("取消搜狐后");
		weatherData.notifyObserver();
	}

}
