package type2;

//接口，让WaetherData来实现
interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
