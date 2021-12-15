/**
 * 05. 조건문
 *  조건문은 조건을 걸어서 코드를 실행할지를 제어해주는 구문으로
 *  조건이 true면 조건문 내부의 코드가 실행됩니다. 
 *  Java에서 조건문은 if문 switch문, 삼항연산자가 있습니다. 
 */
package basic;

public class B_05_Conditions {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		
		// 1. if문 
		// 1) if문 단일사용
		System.out.println("########## 1-1) if문 단일사용  ##########");
		// 조건이 일치하므로 실행됨 
		if (a < b) {
			System.out.println(a +" 보다 "+ b +"이 크다");
		}
		
		// 조건이 일치하지 않으므로 실행되지 않음
		if (a < c) {
			System.out.println(a +" 보다 "+ c +"이 크다");
		}		
		
		// AND나 OR연산자를 사용해서 여러조건의 비교가 가능
		if (a < b && a == c) {
			System.out.println(a +" 보다 "+ c +"이 크고, " + a +"과 "+ c +"은 같다");
		}
		
	    // 2) if-else문
		System.out.println("########## 1-2) if-else문  ##########");
		if (a < c) {
			System.out.println(a +" 보다 "+ c +"이 크다");
			
		} else {
			System.out.println("조건 불일치!!");
			
		}
		
		// 3) if-else if문 
		System.out.println("########## 1-3) if-else if문  ##########");
		if (a < c) {
			System.out.println(a +" 보다 "+ c +"이 크다");
		
		// else-if의 갯수 제한은 없음!!
		} else if (a < b && a == c) { 
			System.out.println(a +" 보다 "+ c +"이 크고, " + a +"과 "+ c +"은 같다");
			
	    } else if (a < b) {
			System.out.println(a +" 보다 "+ b +"이 크다");
			
		}
		
		// 4) if-else if-else문
		System.out.println("########## 1-4) if-else if-else문  ##########");
		if (a < c) {
			System.out.println(a +" 보다 "+ c +"이 크다");
		
		// else-if의 갯수 제한은 없음!!
		} else if (a < b && a == c) { 
			System.out.println(a +" 보다 "+ c +"이 크고, " + a +"과 "+ c +"은 같다");
			
	    } else if (a < b) {
			System.out.println(a +" 보다 "+ b +"이 크다");
			
		} else {
			System.out.println("조건 불일치!!");
			
		}
		
		
		// 2. switch문
		int key = 2;
		
		// 1) switch문 break문을 써서 제어
		System.out.println("########## 2-1) switch문 break문을 써서 제어  ##########");
		switch (key) {
		case 1 :
			System.out.println("Key는 1 입니다.");
			break;
		case 2 :
			System.out.println("Key는 2 입니다.");
			break;
		case 3 :
			System.out.println("Key는 3 입니다.");
			break;
		default:
			System.out.println("조건 불일치!!");
			break;
		}
		
		// 2) break문을 안쓰면 조건이 일치한 case부터 break를 만날 때 까지 계속 실행됨.
		System.out.println("########## 2-2) break문을 안쓰면 조건이 일치한 case부터 break를 만날 때 까지 계속 실행됨.  ##########");
		key = 2;
		switch (key) {
		case 1 :
			System.out.println("Key는 1 입니다.");
		case 2 :
			System.out.println("Key는 2 입니다.");
		case 3 :
			System.out.println("Key는 3 입니다.");
			break;
		default:
			System.out.println("조건 불일치!!");
		}
		
		
		// 3. 삼항연산자. 
		int su1 = 100;
		int su2 = 200;
		
		// 1) 기본 사용법
		int resultInt = su1 < su2 ? su1 : su2 ;
		System.out.println(resultInt);
		
		// 2) 괄호로 조건식을 감쌀수 있음, 리턴할 자료형은 무엇이든 상관없음
		String resultStr = (su1 < su2) ? su2+"이 더 크다" : su1+"이 더 크다" ;
		System.out.println(resultStr);
		
		// 3) 리턴 할 값으로 메서드를 넣을 수도 있음.
		int resultInt2 = (su1 < su2) ? beTwice(su2) : beTwice(su1);
		System.out.println(resultInt2);
		
	}
	
	public static int beTwice(int su) {
		return su * 2;
	}
}
