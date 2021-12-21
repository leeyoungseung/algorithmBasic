/**
 * 7. 배열 
 * 같은 데이터 타입의 변수가 순타적으로 저장되는 자료구조. 
 * ※ 같은 규격의 상자가 줄줄이 이어져 있는 모습.
 */
package basic;

public class B_07_Array {

	public static void main(String[] args) {
		
		// 1. 배열의 선언과 초기화 
		// int [] 배열이름 = new [배열의 크기]
		// 크기가 5인 배열의 경우 아래와 같은 공간이 메모리에 할당된다.
		// [0][1][2][3][4]
		// 1) 선언만 하기  
		int [] arrayInt;
		
		// 2) 선언한 배열을 초기화, 배열의 크기만 지정
		arrayInt = new int[3];
		
		// 3) 선언과 초기화를 동시에, 배열의 크기만 지정
		String [] arrayStr = new String[3];
		
		// 4) 선언과 초기화를 동시에, 배열에 데이터를 넣어서 생성
		// 방법 (1) 
		char [] arrayChar = new char[] {'A','B','C'};
		
		// 방법 (2)
		byte [] arrayByte = {1, 2, 3};
		
		
		// 2. 배열에 값 넣기·출력하기
		// ※ 배열의 요소에 접근하기 위해서는 Index번호를 알아야 한다. 
		// (예시) 배열이름[인덱스]
		System.out.println("########## 배열에 값 넣고 출력하기  ##########");
		System.out.println(arrayInt[0]);  // 0 int배열의 기본값은 0이다.
		System.out.println(arrayInt[1]);  // 0 
		System.out.println(arrayInt[2]);  // 0 
		arrayInt[0] = 3;
		arrayInt[1] = 2;
		arrayInt[2] = 1;
		
		
		// length는 배열의 길이를 담고 있다.
		for (int i=0; i<arrayInt.length; i++) {
			System.out.println("배열의  ["+i+"] 번째 인덱스의 요소의 값 : "+ arrayInt[i]);
		}
		
		
		// 3. 다차원 배열의 선언과 초기화
		// int [][] 배열이름 = new [상위차원의 크기][하위차원의 크기]
		// 5 * 5크기의 배열의 경우 아래와 같은 공간이 메모리에 할당된다.
		// [0,0][0,1][0,2][0,3][0,4] 
		// [1,0][1,1][1,2][1,3][1,4] 
		// [2,0][2,1][2,2][2,3][2,4] 
		// [3,0][3,1][3,2][3,3][3,4] 
		// [4,0][4,1][4,2][4,3][4,4] 
		// 1) 선언과 초기화  
		int [][] MultiArrayInt1 = new int[5][5];
		
		// 2) 선언과 초기화를 동시에 
		// 방법 (1)
		int [][] MultiArrayInt2 = new int[][] {
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15}
		};
		
		// 방법 (2)
		int [][] MultiArrayInt3 = {
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15}
		};
		
		// 4. 다차원 배열에 값 넣기·출력하기
		// ※ 배열의 요소에 접근하기 위해서는 상위와 하위차원의 Index번호를 알아야 한다. 
		System.out.println("########## 다차원 배열에 값 넣고 출력하기  ##########");
		System.out.println(MultiArrayInt1[0][0]);  // 0 int배열의 기본값은 0이다.
		System.out.println(MultiArrayInt1[0][1]);  // 0 
		System.out.println(MultiArrayInt1[0][2]);  // 0 
		MultiArrayInt1[0][0] = 3;
		MultiArrayInt1[0][1] = 2;
		MultiArrayInt1[0][2] = 1;
		
		for (int i=0; i<MultiArrayInt1.length; i++) {
			for (int j=0; j<MultiArrayInt1.length; j++) {
				System.out.println("배열의 ["+i+","+j+"] 번째 인덱스의 요소의 값 : "+ MultiArrayInt1[i][j]);
			}
		}
		
		
	}
}
