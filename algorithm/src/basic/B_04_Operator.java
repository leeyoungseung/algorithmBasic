/**
 * 04. 연산자
 *  사칙연산과 같은 계산을 위한 기호를 연산자라고 합니다. 
 * 업무를 하면서 필수로 알아야하는 연산자에 대해서 알아보자면 
 * 사칙연산을 위한 '산술연산자' 
 * 값을 순차적으로 늘리거나 줄이는 '증감연산자'
 * 값의 비교를 위한 '비교연산자'
 * 변수에 값을 넣기위한 '대입연산자' 정도가 있겠습니다.
 * 
 * 나머지 연산자는 필요에 따라서 추가로 찾아가며 익숙해지면 됩니다. 
 */
package basic;

public class B_04_Operator {

	public static void main(String[] args) {
		
		// 1. 산술연산자 
		// [A][연산자][B] 형식이라면, [A]를 [B]로 [연산자]에 해당하는 연산을 실시
		int a = 100;
		int b = 20;
		int c = -10;
		
		// 1) '+'
		System.out.println("########## '+' ########## ");
		System.out.println(a + b);  // 120
		System.out.println(a + c);  // 90
		
		// 2) '-' 
		System.out.println("########## '-' ########## ");
		System.out.println(a - b);  // 80
		System.out.println(a - c);  // 110
		
		// 3) '*'
		System.out.println("########## '*' ########## ");
		System.out.println(a * b);  // 2000
		System.out.println(a * c);  // -1000		
		
		// 4) '/'
		System.out.println("########## '/' ########## ");
		System.out.println(a / b);  // 5
		System.out.println(a / c);  // -10
		
		// 5) '%'
		System.out.println("########## '%' ########## ");
		System.out.println(a % b);  // 0
		System.out.println(a % c);  // 0
		
		
		// 2. 증감연산자 
		int n = 0;
		
		// 1) '++n', '--n'
		System.out.println("##########  '++n', '--n' ########## ");
		System.out.println(++n);  // 1
		System.out.println(n);    // 1
		System.out.println(--n);  // 0
		System.out.println(n);    // 0
		
		// 2) 'n++', 'n++'
		System.out.println("##########  'n++', 'n++' ########## ");
		System.out.println(n++);  // 0
		System.out.println(n);    // 1
		System.out.println(n--);  // 1
		System.out.println(n);    // 0
		
		
		// 3. 비교연산자 
		int num1 = 10;
		int num2 = 20;
		int num3 = 10;
		
		// 1) '<'
		System.out.println("########## '<' ########## ");
		System.out.println(num1 < num2);  // true
		System.out.println(num1 < num3);  // false
		
		// 2) '<='
		System.out.println("########## '<=' ########## ");
		System.out.println(num1 <= num2);  // true
		System.out.println(num1 <= num3);  // true
		
		// 3) '>'
		System.out.println("########## '>' ########## ");
		System.out.println(num1 > num2);  // false
		System.out.println(num1 > num3);  // false
		
		// 4) '>='
		System.out.println("########## '>=' ########## ");
		System.out.println(num1 >= num2);  // false
		System.out.println(num1 >= num3);  // true
		
		// 5) '=='
		System.out.println("########## '==' ########## ");
		System.out.println(num1 == num2);  // false
		System.out.println(num1 == num3);  // true
		
		// 6) '!=' 
		System.out.println("########## '!=' ########## ");
		System.out.println(num1 != num2);  // true
		System.out.println(num1 != num3);  // false
		
		// 7) '!' 
		System.out.println("########## '!' ########## ");
		System.out.println(!(num1 == num2));  // true
		System.out.println(!(num1 == num3));  // false
		
		// 8) '&&' 
		System.out.println("########## '&&' ########## ");
		System.out.println((num1 != num2) && (num1 == num3));            // true
		System.out.println(isEqual(num1, num2) && isEqual(num1, num3));  // false
		
		// 9) '||' 
		System.out.println("########## '||' ########## ");
		System.out.println((num1 != num2) || (num1 == num3));            // true
		System.out.println(isEqual(num1, num2) || isEqual(num1, num3));  // true
	}
	
	public static boolean isEqual(int num1, int num2) {
		boolean result = num1 == num2;
		System.out.println("isEqual Result is : "+result);
		return result;
	}
}
