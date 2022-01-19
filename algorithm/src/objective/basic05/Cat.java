package objective.basic05;

import objective.basic04.Animal;

public class Cat extends Animal {

	protected String breed;
	protected String cryingSound = "Niya~!";
	
	public Cat(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	
	public void crying() {
		System.out.println(this.cryingSound);
	}
	
	public void crying(int count) {
		if (count < 1) return;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<count; i++) {
			System.out.println(this.cryingSound);
			sb.append(this.cryingSound);
		}
		System.out.println(sb.toString());
	}
	
	@Override
	public void printName() {
		System.out.println("Cat's Name : "+ this.name);
	}
}
