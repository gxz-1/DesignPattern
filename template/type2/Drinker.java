package type2;

class Drinker {
	public static void main(String[] args) {
		//制作红豆豆浆

		System.out.println("----制 作 红 豆 豆 浆----");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk(); 
		redBeanSoyaMilk.make();

		System.out.println("---- 制 作 花 生 豆 浆 ----"); 
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk(); 
		peanutSoyaMilk.make();
		
		System.out.println("---- 制 作 纯 豆 浆 ----"); 
		SoyaMilk puresoyamilk = new PureSoyaMilk(); 
		peanutSoyaMilk.make();

	}
}
