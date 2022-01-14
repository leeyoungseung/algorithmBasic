package objective.basic02;

public class Main {
	
	public static void main(String[] args) {
		// 생성자 
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("Happy", 100);
		Dog dog3 = new Dog("Mary", 200, "Akita");
		
		
		// 멤버변수 
		System.out.println("####################");
		System.out.println("First Dog's Name : " + dog1.name);
		System.out.println("Second Dog's Name : " + dog2.name);
		System.out.println();
		
		// 스태틱 변수는 모든 인스턴스에서 공유하는 값이다.
		System.out.println("####################");
		System.out.println("First Dog's Breed : " + dog1.breed);
		System.out.println("Second Dog's Breed : " + dog2.breed);
		System.out.println("Third Dog's Breed : " + dog3.breed);
		System.out.println("Dog's Breed : " + Dog.breed);
		System.out.println();
		
		Dog.breed = "Nothing";
		System.out.println("####################");
		System.out.println("First Dog's Breed : " + dog1.breed);
		System.out.println("Second Dog's Breed : " + dog2.breed);
		System.out.println("Third Dog's Breed : " + dog3.breed);
		System.out.println("Dog's Breed : " + Dog.breed);
		System.out.println();
		
		// 모든 스태틱 변수의 값이 변해 있음.
		System.out.println("####################");
		System.out.println("First Dog's CryingSound : " + dog1.cryingSound);
		System.out.println("Second Dog's CryingSound : " + dog2.cryingSound);
		System.out.println("Third Dog's CryingSound : " + dog3.cryingSound);
		System.out.println("Dog's CryingSound : " + Dog.cryingSound);
		System.out.println();
		
		// final로 변경제한
		// Dog.cryingSound = "Wang~!, Wang~!";
		// dog1.cryingSound = "Uoo Wang~!";
		
		
		// 메서드
		System.out.println("####################");
		// 반환값 X / 매개변수 X
		dog3.eat();
		
		// 반환값 X / 매개변수 O
		dog3.eat("Meat");
		
		// 반환값 O / 매개변수 X
		String dog3Name = dog3.getName();
		System.out.println("Third Dog's Name : " + dog3Name);
		
		// 반환값 O / 매개변수 O
		int hp = dog3.sleep(120);
		System.out.println("Recovered HP : "+hp);
		
		// 정적 메서드
		Dog.crying();
		Dog.getBreed();
		
	}	
	
	
}
