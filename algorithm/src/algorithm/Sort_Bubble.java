package algorithm;

public class Sort_Bubble {

	public static void main(String[] args) {
		int i = 0;		//배열의 원소를 반복적으로 탐색하기위한 변수 i
		int j = 0;		//배열의 원소를 반복적으로 탐색하기위한 변수 j
		int temp = 0;	//특정한 두 수를 바꾸기위한 변수
		
		int array [] = new int []{1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		//배열안의 원소를 반복해서 비교하기 위한 for문 (1)
		for(i=0; i<array.length; i++){		
			System.out.println("============== 첫번째 for문 [ "+i+" ] 번째 시작");
			/*
			 * 1) 버블 정렬로 오름차순 정렬은 가장 앞의 자리부터 바로 옆의 자리의 값과 비교하는 것을 반복하는 정렬이다.
			 * 2) i번을 반복시 반드시 원소의 최대값이 끝으로 이동됨
			 * 3) 따라서 i+1 번의 경우는 이미 최대값이 확정된 상황에서 9번을 다 탐색하지 않고 1번을 줄여서 탐색하게됨
			 */
			for(j=0; j<((array.length-1)-i); ++j){
				
				if(array[j] > array[j + 1]){	//j+1이 j보다 작다면 if문 안의 내용이 실행됨 
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					outputValue(array);
					System.out.println("교환이 발생!!!");
				}
				System.out.println("카운트 J [ "+j+"] 번째 비교");
			}
			
			System.out.println("============== 첫번째 for문 [ "+i+" ] 번째 종료 결과 ");
			outputValue(array);
			System.out.println("\n================================================================");
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("================    최종 결과    ==================");
		outputValue(array);
	}
	
	
	public static void outputValue(int [] array) {
		System.out.println("================================================================");
		
		for(int i=0; i<array.length; i++){
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
}
