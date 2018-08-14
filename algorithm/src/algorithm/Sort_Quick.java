package algorithm;

import util.UtilAlgorithm;

public class Sort_Quick {
	//데이터 확인용 유틸 클래스의 객체를 static으로 미리 생성해 두었다.
	public static UtilAlgorithm ut = new UtilAlgorithm();
	
	/**
	 * 퀵 정렬을 구현한 메소드
	 * @param data : 정렬할 데이터 배열
	 * @param start : 시작위치 ; 전체 배열의 왼쪽끝을 의미
	 * @param end  : 끝 위치 ; 전체 배열의 오른쪽 끝을 위미
	 */
	public void sort_quick(int[] data, int start, int end){
		// 왼쪽에서 오른쪽으로 → 요소 탐색 시 최초위치 
        int left = start;
        // 오른 쪽에서 왼쪽으로 ← 요소 탐색 시 최초 위치
        int right = end;
        // 피벗 (요소를 탐색하는 기준점이 되는 요소의 위치)
        // 이 코드에서는 현재 데어터의 시작과 끝을 반으로 나눈 수가 피벗이 됨
        int pivot = data[(start+end)/2];
        
        //(1) 최초 반복문
        do{
        	//(2)와 (3)은 요소를 탐색하면서(→ ←) 교차지점을 만들어준다
        	//(2) → 방향탐색 반복문
        	// data배열의 [left]번 째 요소보다 pivot값이 더 클 때까지 반복하여 left의 값을 1 씩 증가 시킨다
            while(data[left] < pivot) left++;
            //(3) ← 방향탐색 반복문
            // data배열의 [right]번 째 요소보다 pivot값이 더 작을때 까지 반복하여 right의 값을 1 씩 감소 시킨다
            while(data[right] > pivot) right--;
            
            //(1-2) 최초 반복문에서 데이터 변환 로직 
            //(1-2-1) left의 값보다 right의 값이 크거나 같다면 조건문이 실행된다
            if(left <= right){
            	//(1-2-2) data의 left번째 값을 임시 변수에 넣어준다
                int temp = data[left];
                //(1-2-2) data의 right번째 값을 data의 left번째에 넣어준다
                data[left] = data[right];
                //(1-2-3) data의 right번째에 임시변수에 저장된 data의 left번째 값을 넣어준다
                data[right] = temp;
                //(1-2-4) left의 값을 1증가 시킨다
                left++;
              //(1-2-4) right의 값을 1감소 시킨다
                right--;
            }
        // (1) 최초 반복문 left 보다 right가 크거나 같다면 루프를 탈출한다
        }while (left <= right);
        
        System.out.println("===================================");
        for (int su : data){System.out.print("["+su+"]");}
        System.out.println("\n===================================");
        
        //(4) start보다 right가 크다면 다시 퀵정렬 함수를 실행한다.
        // 이때에 변수는 퀵정렬 메소드에서 변환이 이루어진 data배열과 right변수를 배열끝의 값 (end)인수로 넣어준다
        if(start < right) sort_quick(data, start, right);
        //(5) left보다 end가 크다면 다시 퀵정렬 함수를 실행한다.
        // 이때에 변수는  퀵정렬 메소드에서 변환이 이루어진 data와 left변수를 배열시작의 값 (start)인수로 넣어준다
        if(end > left) sort_quick(data, left, end);
    }
	
	public static void main(String[] args) {
		// 정렬할 데이터 배열
		int data[] = {3,7,8,1,5,9,6,10,2,4};
        
		//쿽정렬 클래스 객체생성하기
		Sort_Quick quick = new Sort_Quick();
		
		//쿽정렬 메소드 실행하기
        quick.sort_quick(data, 0, data.length - 1);

        //최종 결과 확인하기
        ut.outputResult(data);
	}
}
