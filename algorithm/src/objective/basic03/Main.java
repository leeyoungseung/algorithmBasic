package objective.basic03;

import objective.basic02.Dog;

public class Main {
	
	public static void main(String[] args) {
		Dog dog = new Dog("Mary", 200, "Akita");
		Bird bird = new Bird("Wings", "Long-beak");
		
		// public 
		System.out.println("Dog's Name : " + dog.name); // 접근 O
		
		// default
		//System.out.println("Dog's hp : " + dog.hp);     // 같은 패키지가 아니므로 접근 X
		
		// private
		// System.out.println("Bird's wing : "+bird.wing); // private이므로 접근할 수 없음
		 System.out.println("Bird's wing : "+bird.getWing()); // get메서드를 사용하여 접근 O
		
		// protected
		System.out.println("Bird's beak : "+bird.beak); // 같은 패키지 이므로 접근 O
		
	}

}
