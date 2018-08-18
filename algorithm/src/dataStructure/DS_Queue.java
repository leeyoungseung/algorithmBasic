package dataStructure;

public class DS_Queue {

	int front;	//queue���� �պκ��� �ε���
	int rear;	//queue���� �޺κ��� �ε���
	int size;	//queue�� ũ��
	int [] queue;//queue�� ������ �迭
	
	/**
	 * �ʱ�ȭ�ϸ鼭 ť�� ����� �����Ѵ�
	 * @param size : queue�� ũ��
	 */
	public DS_Queue(int size){
		this.front = 0;
		this.rear = -1;
		this.size = size;
		this.queue = new int [size];
	}
	
	//ť�� ����ִ� �� Ȯ���ϴ� �޼ҵ�
	public boolean isEmpty(){
		//front�� 0�̰� rear�� 0 ==(rear + 1) == (-1 + 1)���� ���ؼ� �� ����� ����
		return (front==(rear+1));
	}
	//ť�� �����Ͱ� ���� ���ִ��� Ȯ���ϴ� �޼ҵ�
	public boolean isFull(){
		return (rear==(size-1));
	}
	//ť�� �����͸� �����ϴ� �޼ҵ�
	public void push(int value){
		if(isFull()) throw new ArrayIndexOutOfBoundsException();
		//�޺κ� �� rear���� 1�� ������ ��ġ�� �����͸� ����
		queue[++rear] = value;
	}
	//���� ���� ���ʿ� ��ġ�� �����͸� ��ȯ�ϴ� �޼ҵ�
	public int peak(){
		if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
		return queue[front];
	}
	//�����͸� ����ϴ� �޼ҵ�
	public int pop(){
		//���� ���� ���ʿ� ��ġ�� ���� ������ ����
		int value = peak();
		//���� ��ġ�� �������ش�
		front++;
		return value;
	}
	//���� ť�� �����͸� ����ϱ�
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
