package type2;

public class BuildHighBuilding extends Builder{

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("给高楼打地基10米");
	}

	@Override
	public void buildwalls() {
		// TODO Auto-generated method stub
		System.out.println("给高楼砌墙20cm");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("给高楼盖透明屋顶");
	}

}
