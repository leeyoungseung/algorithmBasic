/**
 * 09. 입출력
 * 프로그램을 실행한 후 유저가 콘솔에서 값을 입력하고 출력하는 방법에 대한정리
 */
package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_09_IO {
	
	public static void main(String[] args) {
		// 1. 값 입력 (Scanner사용)
		System.out.println("########## 1. 값 입력 (Scanner사용)  ##########");
		// Scanner를 사용한 유저입력은 BufferedReader에 비해 편하게 사용가능
		Scanner sc = new Scanner(System.in);
		
		// 1) 정수 데이터 입력 
		// (int)
		int inputInt = sc.nextInt();
		System.out.println("Inputed int : "+inputInt);
		
		// (long)
		long inputLong = sc.nextLong();
		System.out.println("Inputed long : "+inputLong);
		
		// (byte)
		byte inputByte = sc.nextByte();
		System.out.println("Inputed byte : "+inputByte);
		
		// (short)
		short inputshort = sc.nextShort();
		System.out.println("Inputed short : "+inputshort);
		
		// 2) 문자 데이터 입력 
		char inputChar = sc.next().charAt(0);
		System.out.println("Inputed char : "+inputChar);
		
		// 3) 문자열 데이터 입력 
		// 문자열을 공백기준으로 입력 받는다.
		String inputString = sc.next();
		System.out.println("Inputed String next : "+inputString);
		
		// 엔터키를 입력하기 전까지의 전체 문자열을 입력받는다
		String inputStringNextLine = sc.nextLine();
		System.out.println("Inputed String nextLine : "+inputStringNextLine);
		
		// 4) 부동소수점수 입력
		// (float)
		float inputFloat = sc.nextFloat();
		System.out.println("Inputed float : "+inputFloat);
		
		// (double)
		double inputDouble = sc.nextDouble();
		System.out.println("Inputed double : "+inputDouble);
		
		// 5) 논리데이터 입력
		boolean inputBoolean = sc.nextBoolean();
		System.out.println("Inputed boolean : "+inputBoolean);
		
		
		// 2. 값 입력 (BufferedReader사용)
		// BufferedReader는 입력 값이 많을 수록 Scanner보다 속도가 더 빠르다.
		// 입력된 데이터를 버퍼에 보관하여, 사용자가 데이터를 요청할시 버퍼에서 데이터를 읽어오므로
		System.out.println("########## 2. 값 입력 (BufferedReader사용)  ##########");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inputedStringFromBR;
		StringTokenizer st = null;
		String [] strArray = null;
		
		try {
			inputedStringFromBR = br.readLine();
			st = new StringTokenizer(inputedStringFromBR, " ");
			strArray = new String[st.countTokens()];
			for (int i=0; i<strArray.length; i++) {
				strArray[i] = st.nextToken();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String str : strArray) {
			System.out.println("BufferedReader inputed : "+str);
		}
		
		
		// 3. 개행포함 출력 (System.out.println();)
		System.out.println("########## 3. 개행포함 출력 (System.out.println();)  ##########");
		System.out.println("Hello World 1");
		System.out.println("Hello World 2");
		
		// 4. 개행없이 출력 (System.out.print();)
		System.out.println("########## 4. 개행없이 출력 (System.out.print();)  ##########");
		System.out.print("Hello World 1");
		System.out.print("Hello World 2");
		System.out.println();
		
		// 5. 서식지정 출력 (System.out.printf();)
		// System.out.printf("서식", 값1, 값2...);
		System.out.println("########## 5. 서식지정 출력 (System.out.printf();)  ##########");
		
		// 1) %d : 정수
		System.out.printf("number 1 : %d %n", 100);
		System.out.printf("number 1 : %d , number 2 : %d %n", 100, 1500);
		
		// 2) %f : 실수 
		System.out.printf("double 1 : %f %n", 0.15);
		System.out.printf("double 2 : %.3f %n", 2.123456); // 소수점 3자리까지 출력
		
		// 3) %c : 문자 
		System.out.printf("char : %c %n", 'a');
		
		// 4) %s : 문자열 
		System.out.printf("String : %s-----%s %n", "Hello", "World");
		
		
		// ※ 서식지정 출력 다른 방법 String.format();
		System.out.println(String.format("String : %s-----%s %n", "Hello", "World"));
		
		
	}
}
