package type2;
//对象适配器：将 Adapter 类作修改，不是继承 src 类，而是持有 src 类的实例，以解决兼容性的问题。 
//即：持有 src 类，实现 dst  类接口，完成 src到dst 的适配
class user{
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}
}
