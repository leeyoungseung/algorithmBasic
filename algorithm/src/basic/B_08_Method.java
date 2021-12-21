/**
 * 08. 메서드
 * 메서드는 호출하면 특정한 기능을 수행하고 그 결과를 반환하는 코드의 집합으로 수학의 함수와 같은 기능을 한다. 
 * 
 */
package basic;

import java.util.Random;

public class B_08_Method {

	public static void main(String[] args) {
		B_08_Method method = new B_08_Method();
		// 1. 메서드 선언
		// [접근지시자][리턴할 자료형] 메서드명 (매개변수1, 2..) {...}
		
		// 2. 인자와 반환 
		// 1) 매개변수 X, 결과 값 반환 X
		method.printHello();
		
		// 2) 매개변수 O, 결과 값 반환 X
		method.printString("Bye Bye");
		
		// 3) 매개변수 X, 결과 값 반환 O
		System.out.println(method.getRandomNumber()); // 그대로 출력
		int randomNum = method.getRandomNumber();
		System.out.println(randomNum);
		
		// 4) 매개변수 O, 결과 값 반환 O
		System.out.println(method.getRandomNumberFromTo(5,10)); // 그대로 출력
		int randomNum2 = method.getRandomNumberFromTo(11,30);
		System.out.println(randomNum2);
		
		// 3. 정적(static) 메서드 
		// 인스턴스 없이도 사용가능한 메서드
		System.out.println(B_08_Method.getHelloWorld());
		
	}
	
	
	// 1) 매개변수 X, 결과 값 반환 X
	public void printHello() {
		System.out.println("Hello!!!");
	}
	
	// 2) 매개변수 O, 결과 값 반환 X 
	public void printString(String str) {
		if (str == null || str.equals("")) {
			/*
			 * 여기에서는 쓰이는 return은 값을 반환한다는 의미가 아니라,
			 * return이후의 메서드내부의 코드가 실행되지 않고, 
			 * 메서드를 호출한곳으로 코드실행의 흐름을 돌린다로 해석.  
			 * */
			return;  
		}
		
		System.out.println(str);
	}
	
	// 3) 매개변수 X, 결과 값 반환 O 
	public int getRandomNumber() {
		return new Random().nextInt(100)+1;
	}
	
	// 4) 매개변수 O, 결과 값 반환 O 
	public int getRandomNumberFromTo(int from, int to) {
		if (from <= 0 || to <= 0 ) {
			return 0;
		}
		return new Random().nextInt(to)+from;
	}
	
	// 정적 메서드
	public static String getHelloWorld() {
		return "Hello World!!";
	}
	
}
