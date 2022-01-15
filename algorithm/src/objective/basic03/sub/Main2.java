package objective.basic03.sub;

import objective.basic03.Bird;

public class Main2 {

	public static void main(String[] args) {
		Bird bird = new Bird("Wings", "Long-beak");
		// System.out.println("Bird's beak : "+bird.beak); // 다른 패키지 이므로 접근 X
		System.out.println("Bird's beak : "+bird.getBeak());
	}
}
