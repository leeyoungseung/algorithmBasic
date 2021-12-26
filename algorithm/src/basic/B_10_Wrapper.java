/**
 * 10. Wrapper클래스 
 *  Wrapper 클래스란 기본자료형을 객체로 만든 것으로
 *  1) 기본자료형을 인스턴스로 사용해야할 경우와
 *  2) 문자열 <-> 숫자 변환하는 등에 사용된다.
 */
package basic;

public class B_10_Wrapper {

	public static void main(String[] args) {
		// ※ Wrapper클래스는 객체처럼 null대입이 가능
		Integer wrapperInt = null;
		Long wrapperLong = null;
		Short wrapperShort = null;
		Byte wrapperByte = null;
		Double wrapperDouble = null;
		Float wrapperFloat = null;
		Character wrapperChar = null;
		Boolean wrapperBoolean = null;
		
		
		// 1. 기본자료형 <-> 래퍼클래스 자료형
		System.out.println("########## 1. 기본자료형 <-> 래퍼클래스 자료형   ##########");
		System.out.println("########## 1-1) 감싸기는 new 연산자를 사용   ##########");
		wrapperInt = new Integer(100);
		wrapperLong = new Long(2000000L);
		wrapperShort = new Short((short) 10);
		wrapperByte = new Byte((byte) 1);
		wrapperDouble = new Double(2.85);
		wrapperFloat = new Float(0.25f);
		wrapperChar = new Character('c');
		wrapperBoolean = new Boolean(false);
		
		System.out.println("int -> Int : " + wrapperInt);
		System.out.println("long -> Long : " + wrapperLong);
		System.out.println("short -> Short : " + wrapperShort);
		System.out.println("byte -> Byte : " + wrapperByte);
		System.out.println("double -> Double : " + wrapperDouble);
		System.out.println("float -> Float : " + wrapperFloat);
		System.out.println("char -> Character : " + wrapperChar);
		System.out.println("boolean -> Boolean : " + wrapperBoolean);
		
		System.out.println("########## 1-2) xxxValue()메서드를 사용하여 기본자료형으로 변환가능   ##########");
		int primitiveInt = wrapperInt.intValue();
		long primitiveLong = wrapperLong.longValue();
		short primitiveShort = wrapperShort.shortValue();
		Byte primitiveByte = wrapperByte.byteValue();
		double primitiveDouble = wrapperDouble.doubleValue();
		float primitiveFloat = wrapperFloat.floatValue();
		char primitiveChar = wrapperChar.charValue();
		boolean primitiveBoolean = wrapperBoolean.booleanValue();
		
		System.out.println("Int -> int : " + primitiveInt);
		System.out.println("Long -> long : " + primitiveLong);
		System.out.println("Short -> short : " + primitiveShort);
		System.out.println("Byte -> byte : " + primitiveByte);
		System.out.println("Double -> double : " + primitiveDouble);
		System.out.println("Float -> float : " + primitiveFloat);
		System.out.println("Character -> char : " + primitiveChar);
		System.out.println("Boolean -> boolean : " + primitiveBoolean);
		
		
		System.out.println("########## 1-3) Java의 Auto Boxing기능 덕에 new 연산자 없이 감싸기 가능  ##########");
		
		wrapperInt = 100;
		wrapperLong = 2000000L;
		wrapperShort = 10;
		wrapperByte = 'a';
		wrapperDouble = 2.85;
		wrapperFloat = 1.25f;
		wrapperChar = 'c';
		wrapperBoolean = true;
		
		System.out.println("Auto Boxing int -> Int : " + wrapperInt);
		System.out.println("Auto Boxing long -> Long : " + wrapperLong);
		System.out.println("Auto Boxing short -> Short : " + wrapperShort);
		System.out.println("Auto Boxing byte -> Byte : " + wrapperByte);
		System.out.println("Auto Boxing double -> Double : " + wrapperDouble);
		System.out.println("Auto Boxing float -> Float : " + wrapperFloat);
		System.out.println("Auto Boxing char -> Character : " + wrapperChar);
		System.out.println("Auto Boxing boolean -> Boolean : " + wrapperBoolean);
		
		System.out.println("########## 1-4) Java의 Auto UnBoxing기능 덕에 메서드 호출없이 기본자료형으로 변환가능  ##########");
		
		primitiveInt = wrapperInt;
		primitiveLong = wrapperLong;
		primitiveShort = wrapperShort;
		primitiveByte = wrapperByte;
		primitiveDouble = wrapperDouble;
		primitiveFloat = wrapperFloat;
		primitiveChar = wrapperChar;
		primitiveBoolean = wrapperBoolean;
		
		System.out.println("Auto UnBoxing Int -> int : " + primitiveInt);
		System.out.println("Auto UnBoxing Long -> long : " + primitiveLong);
		System.out.println("Auto UnBoxing Short -> short : " + primitiveShort);
		System.out.println("Auto UnBoxing Byte -> byte : " + primitiveByte);
		System.out.println("Auto UnBoxing Double -> double : " + primitiveDouble);
		System.out.println("Auto UnBoxing Float -> float : " + primitiveFloat);
		System.out.println("Auto UnBoxing Character -> char : " + primitiveChar);
		System.out.println("Auto UnBoxing Boolean -> boolean : " + primitiveBoolean);
		
		// 2. 문자열 <-> 숫자 변환
		System.out.println("########## 2. 문자열 <-> 숫자 변환   ##########");
		System.out.println("########## 2-1) 문자열을 숫자로 변환   ##########");
		String intStr = "123";
		int intFromStr = Integer.parseInt(intStr);
		
		String doubleStr = "3.15";
		double doubleFromStr = Double.parseDouble(doubleStr);
		
		System.out.println("String -> Int : "+intFromStr);
		System.out.println("String -> Double : "+doubleFromStr);
		
		
		System.out.println("########## 2-2) 숫자를 문자로 변환   ##########");
		String strFromInt = Integer.toString(intFromStr);
		String strFromInt2 = String.valueOf(intFromStr); // 같은 기능이 String에도 있음. 
		
		System.out.println("Int -> String using Integer.toString : "+strFromInt);
		System.out.println("Int -> String using String.valueOf : "+strFromInt2);
		
		String strFromDouble = Double.toString(doubleFromStr);
		String strFromDouble2 = String.valueOf(doubleFromStr); // 같은 기능이 String에도 있음. 
		
		System.out.println("Double -> String using Integer.toString : "+strFromDouble);
		System.out.println("Double -> String using String.valueOf : "+strFromDouble2);
		
		
	}
}
