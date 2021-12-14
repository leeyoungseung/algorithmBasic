/**
 * 03. 자료형
 * Java에서 변수가 어떤 데이터 형식인지를 정의하는 '자료형'이 있습니다. 
 * 자료형은 크게 '원시 자료형'과 '참조 자료형'으로 나눌 수 있습니다.   
 * 원시자료형은 
 * 정수 (short, int, long)
 * 실수 (float, double)
 * 문자 (char), 
 * 바이트 (byte),
 * 논리 (boolean)
 * 가 있습니다. 
 * 참조자료형은 클래스를 사용한 자료형입니다.
 * Ex) String, Date...
 * 
 */
package basic;

import java.util.Date;

public class B_03_DataType {

	public static void main(String[] args) {
		
		short short1;
		int int1;
		long long1;
		float float1;
		double double1;
		char char1;
		byte byte1;
		boolean boolean1;
		
		// 1. 원시 자료형 
		// 1) 값을 초기화 하지 않으면 컴파일 에러가 발생함.
		// System.out.println(short1);  
		short1 = 1;
		System.out.println(short1);
		
		// 2) 자료형 별 값 대입
		// (1) byte(1 byte) : -128 ~ 127
		byte1 = 1;
		
		// (2) short(2 byte) : 32,768~32,767
		short1 = 2;
		
		// (3) int(4 byte) : -2,147,483,648 ~ 2,147,483,647 
		int1 = 2;
		
		// (4) long(8 byte) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,808 
		long1 = 4L;
		
		// (5) float(4 byte) : 1.4E-045 ~ 3.4E+038
		float1 = 0.4f;
		
		// (6) double(8 byte) : 4.9E-324 ~ 1.8E+308
		double1 = 0.4;
		
		// (7) char(2 byte) : 0 ~ 65,535의 유니코드 문자
		char1 = 'a';
		
		// (8) boolean(1 byte) : ture 또는 false
		boolean1 = true;
		
		System.out.println("byte : "+ byte1);
		System.out.println("short : "+ short1);
		System.out.println("int : "+ int1);
		System.out.println("long : "+ long1);
		System.out.println("float : "+ float1);
		System.out.println("double : "+ double1);
		System.out.println("char : "+ char1);
		System.out.println("boolean : "+ boolean1);
		
		
		// 2. 참조 자료형
		// 1) 프로그래머가 직접 만든 클래스를 활용
		// new 연산자를 사용하여 참조변수에 인스턴스의 주소값을 대입한다.
		TestDataType tdt = new TestDataType(100, "test");
		System.out.println(tdt);  // 힙의 메모리 주소가 출력된다.
		
		// 2) Java API에서 지원하는 클래스를 활용
		Date date = new Date();
		System.out.println(date);
		
		// String 은 특별하게 문자열 값을 직접 입력가능
		String str1 = "string1";
		// new 연산자를 사용도 가능
		String str2 = new String("string2");
		
		System.out.println(str1);
		System.out.println(str2);
		
	}
}


class TestDataType{

	int testInt;
	String testStr;
	
	public TestDataType(int testInt, String testStr) {
		this.testInt = testInt;
		this.testStr = testStr;
	}
}
