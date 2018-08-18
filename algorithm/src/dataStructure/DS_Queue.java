package dataStructure;

public class DS_Queue {

	int front;	//queue에서 앞부분의 인덱스
	int rear;	//queue에서 뒷부분의 인덱스
	int size;	//queue의 크기
	int [] queue;//queue를 구현할 배열
	
	/**
	 * 초기화하면서 큐의 사이즈를 지정한다
	 * @param size : queue의 크기
	 */
	public DS_Queue(int size){
		this.front = 0;
		this.rear = -1;
		this.size = size;
		this.queue = new int [size];
	}
	
	//큐가 비어있는 지 확인하는 메소드
	public boolean isEmpty(){
		//front가 0이고 rear가 0 ==(rear + 1) == (-1 + 1)인지 비교해서 그 결과를 리턴
		return (front==(rear+1));
	}
	//큐에 데이터가 가득 차있는지 확인하는 메소드
	public boolean isFull(){
		return (rear==(size-1));
	}
	//큐에 데이터를 저장하는 메소드
	public void push(int value){
		if(isFull()) throw new ArrayIndexOutOfBoundsException();
		//뒷부분 값 rear에서 1을 증가한 위치에 데이터를 저장
		queue[++rear] = value;
	}
	//현재 가장 앞쪽에 위치한 데이터를 반환하는 메소드
	public int peak(){
		if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
		return queue[front];
	}
	//데이터를 출력하는 메소드
	public int pop(){
		//현재 가장 앞쪽에 위치한 값을 변수에 저장
		int value = peak();
		//앞쪽 위치를 변경해준다
		front++;
		return value;
	}
	//현재 큐의 데이터를 출력하기
	public void printQueue(){
		System.out.println("== Start List ==");
		
		for(int i = front; i<=rear; i++){
			System.out.print("[ "+queue[i]+" ] ");
		}
		
		System.out.println("\n== End List ==");
	}
	
	
	public static void main(String[] args) {
		int size = 6;
		DS_Queue dq = new DS_Queue(size);
		
		dq.push(7);
		System.out.println("peak : "+ dq.peak());
		dq.printQueue();
		
		dq.push(5);
		System.out.println("peak : "+ dq.peak());
		dq.printQueue();
		
		dq.push(4);
		System.out.println("peak : "+ dq.peak());
		dq.printQueue();
		
		dq.pop();
		System.out.println("peak : "+ dq.peak());
		dq.printQueue();
		
		dq.push(6);
		System.out.println("peak : "+ dq.peak());
		dq.printQueue();
		
		dq.pop();
		System.out.println("peak : "+ dq.peak());
		dq.printQueue();
	}
}
