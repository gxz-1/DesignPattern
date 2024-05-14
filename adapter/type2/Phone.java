package type2;
/*
 * 类适配器模式：将某个类的接口转换成客户端期望的另一个接口表示，
 * 主的目的是兼容性，让原本因接口不匹配不能一起工作的两个类可以协同工作。
 */
class Phone {


	//充电
	public void charging(Voltage5V voltage5v) {
		if(voltage5v.output5V()==5) {
			System.out.println("电压为5V，可以充电");
		}
		else if (voltage5v.output5V()>5) {
			System.out.println("大于5V不能充电");
		}
	}

}
//1)	Java 是单继承机制， 因为这要求 dst 必须是接口，有一定局限性;
//2)	src 类的方法在 Adapter 中都会暴露出来，也增加了使用的成本。

