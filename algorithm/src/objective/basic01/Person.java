package objective.basic01;

public class Person {
	
	String eye;
	String nose;
	String mouth;
	String hand;
	String foot;
	
	public void eat() {
		System.out.println("eat");
	}
	
	public void sleep() {
		System.out.println("sleep");
	}
	
	public void defecate() {
		System.out.println("defecate");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.eat();
		String eye = person.eye;
		System.out.println(eye);
	}
	
}
