package type1;

public class Sheep {
	String name;
	int age;
	String color;
	
	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
}
