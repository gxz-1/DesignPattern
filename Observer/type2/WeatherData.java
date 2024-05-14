package type2;

import java.util.ArrayList;
class WeatherData implements Subject {

	private float temperatrue;
	private float pressure;
	private float humidity;
	//�۲��߼���
	private ArrayList<Observer> observers;

	public WeatherData() {
		observers=new ArrayList<Observer>();
	}

	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	//�������и���ʱ���͵��� setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//����dataChange�� �����µ���Ϣ ���͸� ���뷽 currentConditions
		notifyObserver();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		//�������еĹ۲��߲�֪ͨ
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(getTemperature(), getPressure(), getHumidity());
		}
	}
	


}
