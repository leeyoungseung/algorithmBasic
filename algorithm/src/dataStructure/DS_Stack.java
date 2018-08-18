package dataStructure;

public class DS_Stack {

	int top;	//������ ���� ���ʿ� ��ġ�� �������� ��ġ
	int [] stack; //������ ������ �迭
	int size;    //������ ������
	
	/**
	 * �ʱ�ȭ�ϸ鼭 ������ ũ�⸦ ���Ѵ�
	 * @param size : ������ ũ��
	 */
	public DS_Stack(int size){
		this.top = -1;
		this.stack = new int [size];
		this.size = size;
	}
	
	//top�� �ش��ϴ� �����͸� �����ϴ� �޼ҵ�
	public int peak() throws ArrayIndexOutOfBoundsException{
		return stack[top];
	}
	//���ÿ� �����͸� ����ִ� �޼ҵ�
	public void push(int value) throws ArrayIndexOutOfBoundsException{
		stack[++top] = value;
		System.out.println("== push[ "+stack[top]+" ] ==");
	}
	//���ÿ� �ִ� �����͸� ����ϰ� , top�� ��ġ�� �����ϴ� �޼ҵ�
	public int pop() throws ArrayIndexOutOfBoundsException{
		System.out.println("== pop[ "+stack[top]+" ] ==");
		return stack[top--];
	}
	//���ÿ� �ִ� �����͸� ���
	public void printStack() {
		System.out.println("== Start List ==");
		
		//����� ���ʽ��� ��ġ�� top�� �ȴ� , 1�� �ٿ������鼭 0�� �ɶ� ���� �ں��ؼ� �����͸� ����Ѵ�.
		for(int i = top; i>=0; i--){
			System.out.print("[ "+stack[i]+" ] ");
		}
		
		System.out.println("\n== End List ==");
	}
	
	public static void main(String[] args) {
		int size = 6;
		DS_Stack dst = new DS_Stack(size);
		
		
		dst.push(7);
		System.out.println("peak : "+ dst.peak());
		dst.printStack();
		
		dst.push(5);
		System.out.println("peak : "+ dst.peak());
		dst.printStack();
		
		dst.push(4);
		System.out.println("peak : "+ dst.peak());
		dst.printStack();
		
		dst.pop();
		System.out.println("peak : "+ dst.peak());
		dst.printStack();
		
		dst.push(6);
		System.out.println("peak : "+ dst.peak());
		dst.printStack();
		
		dst.pop();
		System.out.println("peak : "+ dst.peak());
		dst.printStack();
	}
}
