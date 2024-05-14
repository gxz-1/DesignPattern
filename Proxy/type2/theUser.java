package type2;

public class theUser {

	public static void main(String[] args) {
		Teacher target = new Teacher();
		ProxyFactory pf = new ProxyFactory(target);
		Teacher pi = (Teacher) pf.getProxyinstance();
		pi.teach();

	}

}
