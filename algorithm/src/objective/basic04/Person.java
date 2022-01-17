package objective.basic04;

public class Person extends Animal {
	
	public String language;
	
	public Person(String name, int age, String language) {
		super(name, age);
		this.language = language;
	}
	
	public void speaking() {
		System.out.println("speaking : "+this.language);
	}
	
	@Override
	public void printName() {
		System.out.println("Person's Name : "+ this.name);
	}
	
}
