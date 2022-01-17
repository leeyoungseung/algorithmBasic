package objective.basic04;

public class Dog extends Animal {
	
	protected String breed;
	protected String cryingSound = "Wang~!";
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	
	public void crying() {
		System.out.println(this.cryingSound);
	}
	
	@Override
	public void printName() {
		System.out.println("Dog's Name : "+ this.name);
	}
	
}
