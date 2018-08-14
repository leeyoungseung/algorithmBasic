package algorithm;

import util.UtilAlgorithm;

public class Sort_Insertion {
	
	public static void main(String[] args){
		
		UtilAlgorithm ut = new UtilAlgorithm();
		
		int i;
		int j;
		int temp=0;
		int [] array = new int []{1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		//현재 이 코드에서는 앞자리가 가장 작은 수가 아니면 에러가 발생한다
		//왜냐하면 배열의 전체 크기를 벗어나 버리기 때문 
		//ex[-1][0][1]....[9]
		//int [] array = new int []{5, 10, 1, 8, 7, 6, 4, 3, 2, 9};
		
		
		//첫번째 반복문 : 10개 요소의 배열이므로 9번 반복하여 비교할 수 있는 for문
		for(i=0; i<array.length-1; i++){
			j = i;	//j에 i를 대입한다.
			System.out.println("반복전 의 j 값은 : [ "+j+" ]" );
			System.out.println("반복전 의 j 배열 값은 : [ "+array[j]+" ]" );
			System.out.println("반복전 의 j+1 배열 값은 : [ "+array[j+1]+" ]" );
			/*
			 * 배열 원소의 값을 비교하기위한 while문
			 * 1) j값에 i를 대입하기 때문에 1번 for문의 증감식에 의해 증가한 i로 j의 값도 증가함
			 * 2) 조건식의 해석은 배열의 [j]번째 값이 [j+1]번째 값보다 크다는 조건이 거짓이 될때 까지 반복한다. 
			 * 3) j변수는 j--로 인해 1씩 줄어들게 되므로, 줄어들면서 최초 j값보다 앞의 위치에 있던 배열의 요소들이 정렬된다.
			 */
			while(array[j] > array[j + 1]){
				System.out.println("현재 j의 값은 [ "+j+" ] 입니다. 현재 j위치의 배열 값은 [ "+array[j]+" ]");
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				j--;
			}
			// While문에서 교환이
			ut.outputValue(array, i);
		}
		
		ut.outputResult(array);
	}
}
