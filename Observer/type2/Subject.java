package type2;

//�ӿڣ���WaetherData��ʵ��
interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
