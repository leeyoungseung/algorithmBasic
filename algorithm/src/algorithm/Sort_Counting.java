package algorithm;

import util.UtilAlgorithm;

public class Sort_Counting {

	//데이터 확인용 유틸 클래스의 객체를 static으로 미리 생성해 두었다.
	public static UtilAlgorithm ut = new UtilAlgorithm();
	//지정된 데이터의 개수를 저장하는 배열
	int [] count;
	//정렬에 사용할 데이터가 담기는 배열
	int [] array;
	
	/**
	 * 생성자 : 정렬에 사용할 배열을 초기화해준다
	 * @param count : 지정된 데이터의 개수를 저장하는 배열
	 * @param array : 정렬에 사용할 데이터가 담기는 배열
	 */
	public Sort_Counting(int [] count, int [] array){
		this.count = count;
		this.array = array;
	}
	
	/**
	 * 계수정렬을 구현하는 코드
	 */
	public void sort(){
		//초기 값을 설정합니다 [0][0][0][0][0]
		for(int i = 0; i < 5; i++){
			count[i] = 0;
		}
		//count 배열에 요소가 몇개 인지 담기
		for(int i = 0; i < 30; i++){
			System.out.println("array[i] - 1 : "+(array[i]));
			//(1)1~5까지의 숫자가 데이터의 범위라는 것을 기억해야한다 그리고  데이터의 범위는 count배열의 전체수와 같다
			//배열은 0부터 시작하므로 1==[0]이 된다
			//array[i]번째 값에 -1을하는 이유이다
			//(2) array[i]번째 값 -1 에 해당하는 count 배열의 칸에 1을 더해준다(++)
			//데이터의 범위는 1~5이므로 count배열에 순차적으로 1이 더해지며 데이터 범위안의 데이터가 몇개 씩 있는지
			//카운팅 되어진다
			count[array[i] - 1]++;
			ut.outputValue(count, i+" 번째 ");
		}
		// 정렬된 데이터를 출력하기
		for(int i = 0; i < 5; i++){
			//count배열의 요소 값이 0이 아니라면 조건문 실행
			if(count[i] !=0){
				//count 배열의 해당하는 칸의 값만 큼 반복되어 출력된다
				for(int j = 0; j < count[i]; j++){
					System.out.printf("%d ", i+1);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		//데이터의 범위를 지정하여, 지정된 데이터의 개수를 저장하는 배열을 설정
		int [] count = new int [5];
		//정렬의 대상이 되는 데이터의 배열
		int [] array = new int []{
				1, 3, 2, 4, 3, 2, 5, 3, 1, 2,
				3, 4, 4, 3, 5, 1, 2, 3, 5, 2,
				3, 1, 4, 3, 5, 1, 2, 1, 1, 1
		};
		//객체 생성
		Sort_Counting sc = new Sort_Counting(count, array);
		//정렬 실행
		sc.sort();
	}
}
