package algorithm;

import util.UtilAlgorithm;

//힙정렬
public class Sort_Heap {
	
	//데이터 확인용 유틸 클래스의 객체를 static으로 미리 생성해 두었다.
	public static UtilAlgorithm ut = new UtilAlgorithm();
	
	/**
	 * heap정렬을 구현한 메소드
	 * @param heap : 정렬할 데이터 배열
	 * @return
	 */
	public int[] sort_heap(int heap[]){
		//먼저 전체 트리구조를 최대 힙구조로 만들기
		//인수로 받은 배열의 크기 만큼 반복한다
		for(int i = 1; i<heap.length; i++){
			//c는 자기자신 노드(배열칸을 이동하며 지시해주는 변수)
			int c = i;
			//
			do{
				//부모의 값을 구하기
				int root = (c - 1) / 2;
				//부모의 값과 자식의 값을 비교하여 자식의 값이 더  크면 자식의 값을 부모의 위치에 이동시킨다.
				if(heap[root]< heap[c]){
					int temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				//현재의 부모의 위치라는 조건에서 다시 반복한다 
				c = root;
			//c가 0이되지 않는 한 반복한다
			} while(c !=0);
		}
		//완성된 최대힙 구조 출력해보기
		ut.outputValue(heap, "최대 힙구조로 만들기");
				
		//크기를 줄여가며 반복적으로 힙을 구성
		for(int i = heap.length - 1; i >= 0; i--){
			//heap의 0번째 위치는 현재 최대값이 들어가 있고,
			//배열의 마지막은 최소 값이 있으므로 서로 위치를 바꾸며 정렬이된다
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			//다시 루트의 위치를 첫번째에 위치시키기위해 변수에 0대입
			int root = 0;
			//c는 루트의 자식이된다.
			int c = 1;
			do{
				System.out.println("do");
				c = 2 * root + 1;
				System.out.println(c);
				
				//Java에서는 배열크기를 넘으면 에러가 발생하기에 오류 해결을 위해 조건문을 걸었다
				if(c <= heap.length){
					//자식중에 더 큰값을 찾기(1)
					if(heap[c] < heap[c + 1] && c < i - 1){
						c++;
					}
				}
				if(c <= heap.length){
					//자식중에 더 큰값을 찾기(2)
					if(heap[c] < heap[c + 1] && c < i - 1){
						c++;
					}
				}
				
				if(c <= heap.length){
					//root보다 자식이 더 크다면 교환이 발생
					if(heap[root] < heap[c] && c < i){
						int temp2 = heap[root];
						heap[root] = heap[c];
						heap[c] = temp2;
					}
				}
				//재귀적 연산으로 c를 다시 root에 위치에 대입한다
				root = c;
			} while (c < i);
		}
		//정렬된 결과를 출력하기
		return heap;
	}
	
	public static void main(String[] args) {
		//정렬할 데이터의 배열을 선언
		int heap[] = new int[]{7,6,5,8,3,5,9,1,6};
		//객체를 생성
		Sort_Heap sh = new Sort_Heap();
		//메소드를 호출하여 결과를 받아 출력하기
		ut.outputResult(sh.sort_heap(heap));
	}
}
