/**
 * 2. 변수
 * 값을 담기위한 상자와 같은 역할을 하는 것을 변수라 할수 있다. 
 * 자바에서는 숫자,문자와 같은 자료형을 지정하여 변수를 선언하는데 
 * 실 생활에서 물건을 정리할 때 비슷한 종류의 물건끼리 상자에 넣어 정리하는 것처럼
 * 숫자 데이터는 숫자변수에 문자 데이터는 문자 변수에 넣는다고 생각하면 된다. 
 * 
 */
package basic;

public class B_02_Variable {

	public static void main(String[] args) {
		// (1) 변수의 선언 
		int var_int_1;  // 선언만 된 상태로 변수에 값이 들어있지 않다. 
		// System.out.println(var_int_1);  // 선언만 된 상태의 변수의 값을 출력하는 등 사용하려하면 컴파일 단계에서부터 에러가 발생한다!!`
		
		// (2) 변수에 값을 대입하기
		// 변수에 값을 넣어주는 행위를 대입이라한다.
		// '=' 연산자를 사용하여 대입하며 오른쪽에서 ← 왼쪽으로 값이 들어가게 된다.
		// 변수의 선언 후 처음 값을 대입하는 행위를 변수의 '초기화'라고 한다.
		var_int_1 = 10; 
		System.out.println(var_int_1); // 10이 출력된다. 
		
		
		// (3) 변수의 선언과 동시에 초기화하기 
		char var_char_1 = 'a';
		System.out.println(var_char_1);
		
		
		// (4) 변수안의 값은 변할 수 있다. 
		var_int_1 = 20;
		System.out.println(var_int_1); // 20이 출력된다. 
		
		var_char_1 = 'b';
		System.out.println(var_char_1); // b가 출력된다.
		
		
		// (5) 변수 = 변수 의 형태로 대입할 수 있다. 
		int var_int_2 = var_int_1;
		System.out.println(var_int_2); // var_int_1의 값이 현재 20이므로 20이 출력된다. 
		
		
		// (6) 변수 = 메서드 의 형태로 대입 할 수 있다. 
		int var_int_3 = makeTwice(var_int_2);
		System.out.println(var_int_3); // 값을 두배로 해주는 makeTwice메서드 에 var_int_2의 값 20을 넣었으므로, 40이 출력된다. 
		
		
	}
	
	public static int makeTwice(int var) {
		return var * 2;
	}
	
}
