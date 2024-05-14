package type2;

class aUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iPhone p = new FoldediPhone(new vivo());
		p.call();
		p.open();
		p.close();
		iPhone p2 = new SmartiPhone(new xiaomi());
		p2.call();
		p2.open();
		p2.close();
	}

}
