package objective.basic04;

public class Animal {
	protected String name;
	private int age;
	
	public Animal() {}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printName() {
		System.out.println(this.name);
	}
	
	public int getAge() {
		return this.age;
	}
	
	protected void eat() {
		System.out.println("eat");
	}
	
	protected void sleep() {
		System.out.println("sleep");
	}
}
