package objective.basic04;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Happy", 3, "Akita");
		Person person = new Person("David", 20, "English");
		
		// System.out.println(dog.age);   // privateのため、子クラスで使えない。
		System.out.println(dog.name);     // protectedのため、子クラスで使える。
		System.out.println(dog.getAge()); // publicのため、子クラスで使える。
		
		
		// 共通機能を親に定義すると、子クラスでは子クラスなりのコードを実装すればよい。
		System.out.println("Dog's Age : "+dog.getAge());
		System.out.println("Person's Age : "+person.getAge());
		
		// 子クラスなりの機能
		dog.crying();
		person.speaking();
		
		// override
		dog.printName();
		person.printName();
	}
}
