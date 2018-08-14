package algorithm;

public class Sort_Select {
	public static void main(String[] args) {
		int i=0;		//배열의 원소를 반복적으로 탐색하기위한 변수 i
		int j=0;		//배열의 원소를 반복적으로 탐색하기위한 변수 j
		int min=0;	//최소값
		int index=0;	//가장 작은 원소가 위치하는 곳을 가리키는 변수
		int temp=0;	//특정한 두 수를 바꾸기위한 변수
		int [] array = new int []{1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		System.out.println("원소의 갯수 : "+ array.length);
		
		//첫번째 for문은 배열의 요소을 한개[i] 선택 
		for(i=0; i<array.length; i++){
			min = 9999; //min은 항상 최소값을 선택해야하므로 처음은 배열의 모든 원소보가 큰값을 넣어야한다
			
			/* 두번째 for문은 배열의 요소들[j]을 [i]와 비교해서 최소 값을 배열의 앞쪽으로 보낸다.
			 * 첫번째 for문의 변수 [i]의 숫자가 늘어나면 i를 j에 대입 j=i 하므로 검색범위가 줄어든다. 
			 */
			for(j = i; j<array.length; j++){
				if(min > array[j]){//1. 최소값이 저장된 min 변수의 값과 array의 요소 값을 비교한다. min이 더 크면 최소값이 아니게 된다
					min = array[j];//2. 최소값으로 비교대상인 요소값을 대입한다.
					index = j;		// 3. 현재의 최소값을 위치를 index변수에 기록한다.
				} 
			}
			
			temp = array[i];		//1. 첫번째 for문의의 지정 원소 값 i번째의 요소의 값을 temp에 임시 저장 
			array[i] = array[index];//2. 최신화된 최소값의 위치(index)애 해당하는 배열의 요소를 i번째 요소의 위치로 이동시킨다.
			array[index] = temp;	//3. 1.에서 임시로 저장한 값을 index위치의 배열 요소에 넣는다. 
			
			System.out.println("================================================================");
			System.out.println("[ "+i+" ] 번째 입니다.  정렬된 값은 ? [ "+array[i]+" ]");
			for(int su=0; su<array.length; su++){
				System.out.printf("%d ", array[su]);
			}
			System.out.println("\n================================================================");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("================================================================");
		for(i=0; i<10; i++){
			System.out.printf("%d ", array[i]);
		}
		
	}
}
