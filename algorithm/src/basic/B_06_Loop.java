/**
 * 06. 반복문 
 *  반복문은 설정한 조건을 만족하지 않을 때까지
 *  반복문 내부의 코드를 실행하게 해주는 구문 입니다. 
 *  Java에서 반복문은 for문, 향상된 for문, while문, do-while문이 있습니다.
 */
package basic;

import java.util.ArrayList;

public class B_06_Loop {

	public static void main(String[] args) {
		/* 1. for문 
		 * 정해진 횟수만큼 반복하고자 할때 주로 사용됨.
		 * */
		for (int su1 = 0; su1 < 5; su1++) {
			System.out.println("for문 1 ["+ su1 +"] 번째 출력");
		}
		
		int su2;
		for (su2=5; su2>0; su2--) {
			System.out.println("for문 2 ["+ su2 +"] 번째 출력");
		}

		
		/* 2. 향상된 for문 
		 * List와 같은 자료구조와 함께 주로 사용됨.
		 * */
		ArrayList<String> list = new ArrayList<String>();
		list.add("String 1");
		list.add("String 2");
		list.add("String 3");
		list.add("String 4");
		
		for (String str : list) {
			System.out.println("for-each 1 " + str);
		}
		
		int [] array = new int[] {10, 11, 12, 13, 14};
		for (int su : array) {
			System.out.println("for-each 2 " + su);
		}
		
		
		/* 3. while문 
		 * 횟수지정이 없는 반복, 무한루프가 필요할 때 사용됨.
		 * */
		int su4 = 0;
		while (su4 < 10) {
			su4++;
			System.out.println("while문 1 ["+ su4 +"] 번째 출력");
		}
		
		boolean flg = true;
		su4 = 0;
		while (flg) {
		    su4++;
		    System.out.println("while문 2 ["+ su4 +"] 번째 출력");
			if (su4 >= 5) {
				flg = false;
				System.out.println("while문 탈출~!");
			}
		}
		
		
		/* 4. do-while문 
		 * 조건에 관계없이 반복문 안의 내용을 한번은 실행시키고자 할때 사용됨.
		 * ※ 거의 사용 안함
		 * */
		int su5 = 0;
		do {
			System.out.println("do-while문 1 ["+ su5 +"] 번째 출력");
		} while(su5 < -1) ;
		
		do {
			su5++;
			System.out.println("do-while문 2 ["+ su5 +"] 번째 출력");
		} while(su5 < 5) ;
		

		/* 5. break문 
		 * 반복문에서 탈출 하기
		 * break를 감싸고 있는 가장 가까운 for문으로 부터 탈출
		 * */
		for (int i=0; i<5; i++) {
			System.out.println("for문 i ["+ i +"] 번째 출력");
			for (int j=0; j<5; j++) {
				if (j == 3) {
					System.out.println("j의 값이 3이므로 for문 j 탈출");
					break;
				}
				System.out.println("for문 j ["+ j +"] 번째 출력");
			}
			
			if (i == 4) {
				System.out.println("i의 값이 4이므로 for문 i 탈출");
				break;
			}
		}
		
		
		/* 6. continue
		 * 컨티뉴를 만나면 컨티뉴 다음의 코드의 실행을 생략 하고, 반복문의 처음 (조건체크)으로 이동하게 된다.
		 * */
		int su6 = 0;
		while (su6 < 10) {
			su6++;
			if (su6 % 2 != 0) {
				continue;
			}
			System.out.println("while문  ["+ su6 +"] 번째 출력");
			
		}
		
		
		/* 7. label
		 * 반복문에 이름을 붙이는 것.
		 * 라벨을 사용하면 다중 for문 에서 한번에 탈출 가능.
		 * */ 
		label_1 : for (int i=0; i<5; i++) {
			System.out.println("for문 i ["+ i +"] 번째 출력");
			
			label_2 : for (int j=0; j<5; j++) {
				if (j == 3) {
					System.out.println("j의 값이 3이므로 for문 i 탈출");
					break label_1;
				}
			}
			
		}
		
	}
}
