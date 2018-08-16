package algorithm;

import util.UtilAlgorithm;

public class Sort_Merge {
	//데이터 확인용 유틸 클래스의 객체를 static으로 미리 생성해 두었다.
	public static UtilAlgorithm ut = new UtilAlgorithm();
	//정렬된 결과 요소를 담을 배열
	//전역변수로 사용하는 이유는 불필요한 메모리 사용을 최소화 하기 위함
	int data[] = new int [8];
	int mergeSortSu = 0;
	int mergeSu = 0;
	
	/**
	 * 2개의 정렬된 배열을 이용해서 새롭게 정렬된 배열을 만드는 함수
	 * @param a  : 정렬할 배열
	 * @param start : 두개의 배열중 첫번째 배열의 시작점
	 * @param middle : 두개의 배열의 중간 지점
	 * @param end   : 두개의 배열중 두번째 배열의 끝 지점
	 */
	public void merge(int a[], int start , int middle, int end){
		
		int i = start;
		int j = middle + 1;
		int k = start;
		
		// 작은 순서대로 (결과용 전역변수)배열에 삽입하기
		// i가 middle보다 작거나 같을 때까지 , 동시에 j가 end와 같거나 더 작을 때까지
		while(i <= middle && j<=end){
			//a의 i번째 요소와 a의 j번째 요소를 비교하여 j번째요소가 더 크거나 같다면 조건문 실행
			if(a[i]<=a[j]){
				//전역 배열 data의 k번째 (start==i)에 a의 i번째 요소를 넣는다.
				data[k] = a[i];
				//i를 1 증가시킨다.
				i++;
			//a의 i번째 요소와 a의 j번째 요소를 비교하여 j번째 요소가 더 작다면 else문 실행
			}else {
				//전역 배열 data의 k번째 (start==i)에 a의 j번째 요소를 넣는다.
				data[k] = a[j];
				//j를 1 증가시킨다.
				j++;
			}
			//조건문이 한번 끝나면 k를 1증가시키고 다음 반복에 들어간다.
			k++;
		}
		
		//남은 데이터도 삽입
		// i 가 middle보다 크다면 if문이 실행
		if ( i > middle){
			//t에 j를 넣기
			//t가 end보다 크거나같을 때 까지 반복한다
			for(int t = j; t <=end; t++){
				//전역 배열 data의 k번째에 a의 t번째 요소를 넣는다.
				data[k] = a[t];
				//k를 1증가 시킨다
				k++;
			}
		//i 가 middle보다 작다면 else문이 실행
		}else {
			//t에 i를 넣기
			//t가 middle보다 크거나같을 때 까지 반복한다
			for (int t =i; t<= middle; t++){
				//전역 배열 data의 k번째에 a의 t번째 요소를 넣는다.
				data[k] = a[t];
				//k를 1증가 시킨다
				k++;
			}
		}
		
		//정렬된 배열을 삽입
		for(int t=start; t<=end; t++){
			a[t] = data[t];
		}
		ut.outputValue(data, "중간 결과");
		mergeSu++;
		System.out.println("====== merge함수는 ["+mergeSu+"] 번 실행 되었습니다  ======");
	}
	
	/**
	 * 정확히 2개로 나눠주는 함수 재귀용법을 사용
	 * @param a  : 정렬할 데이터를 가진 배열
	 * @param start : 첫번째 배열의 시작값
	 * @param end   : 두번째 배열의 끝 값
	 */
	public void merge_sort(int[] a, int start, int end){
		// 이외의 경우는 크기가 1개인 경우
		//시작값과 끝값을 비교하여 끝값이 더 크다면 if문 실행
		if(start < end){
			//정확히 2개로 나눠주기
			int middle = (start + end) / 2;
			//첫번째 배열에 해당한다.
			merge_sort(a , start , middle);
			ut.outputValue(a, "merge_sort1");
			//두번째 배열에 해당한다.
			merge_sort(a , middle+1 , end);
			ut.outputValue(a, "merge_sort2");
			//전역배열을 사용하여 정렬시켜주는 함수를 호출
			merge(a , start , middle , end);
		}
		mergeSortSu++;
		System.out.println("====== merge_sort함수는 ["+mergeSortSu+"] 번 실행 되었습니다  ======");
	}
	
	public static void main(String[] args) {
		Sort_Merge sm = new Sort_Merge();
		int array[] = new int []{7,6,5,8,3,5,9,1};
		sm.merge_sort(array, 0, array.length-1);
		
		//ut.outputResult(array);
		ut.outputResult(sm.data);
	}
}
