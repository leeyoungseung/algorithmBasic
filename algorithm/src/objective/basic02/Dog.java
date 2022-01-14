package objective.basic02;

public class Dog {

	// 멤버변수 
	String name;
	int hp;
	
	// 정적(static) 멤버변수
	static String breed;
	static final String cryingSound = "Wang~!";
	
	
	// 인스턴스 메서드 
	public void eat() {
		System.out.println("eat");
	}
	
	// 메서드 오버로딩
	public void eat(String food) {
		System.out.println("eat : "+food);
	}
		
	public String getName() {
		return name;
	}
	
	public int sleep(int time) {
		System.out.println("sleep");
		this.hp = time;
		return this.hp;
	}
	
	// 스테틱 메서드
	public static String getBreed() {
		return breed;
	}
	
	public static void crying() {
		System.out.println(cryingSound);
	}
	
	// 생성자 (기본)
	public Dog() {

	}
	
	// 생성자 (파라미터 설정)
	public Dog(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	
	// 생성자 (생성자 오버로딩 응용)
	public Dog(String name, int hp, String breed) {
		this(name, hp);
		this.breed = breed;
	}
	
}
