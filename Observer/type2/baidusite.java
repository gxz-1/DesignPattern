package type2;

class baidusite implements Observer{
	// �¶ȣ���ѹ��ʪ��
		private float temperature;
		private float pressure;
		private float humidity;

		//���� ������������� WeatherData �����ã���ʹ������ģʽ
		public void update(float temperature, float pressure, float humidity) {
			this.temperature = temperature;
			this.pressure = pressure;
			this.humidity = humidity;
			display();
		}

		//��ʾ
		public void display() {
			System.out.println("�ٶ���վ�ṩ---");
			System.out.println("***Today mTemperature: " + temperature + "***");
			System.out.println("***Today mPressure: " + pressure + "***");
			System.out.println("***Today mHumidity: " + humidity + "***");
		}
}
