package type2;

class Drinker {
	public static void main(String[] args) {
		//�����춹����

		System.out.println("----�� �� �� �� �� ��----");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk(); 
		redBeanSoyaMilk.make();

		System.out.println("---- �� �� �� �� �� �� ----"); 
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk(); 
		peanutSoyaMilk.make();
		
		System.out.println("---- �� �� �� �� �� ----"); 
		SoyaMilk puresoyamilk = new PureSoyaMilk(); 
		peanutSoyaMilk.make();

	}
}
