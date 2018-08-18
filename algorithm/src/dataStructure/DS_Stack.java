package dataStructure;

public class DS_Stack {

	int top;	//스택의 가장 위쪽에 위치한 데이터의 위치
	int [] stack; //스택을 구현할 배열
	int size;    //스택의 사이즈
	
	/**
	 * 초기화하면서 스택의 크기를 정한다
	 * @param size : 스택의 크기
	 */
	public DS_Stack(int size){
		this.top = -1;
		this.stack = new int [size];
		this.size = size;
	}
	
	//top에 해당하는 데이터를 리턴하는 메소드
	public int peak() throws ArrayIndexOutOfBoundsException{
		return stack[top];
	}
	//스택에 데이터를 집어넣는 메소드
	public void push(int value) throws ArrayIndexOutOfBoundsException{
		stack[++top] = value;
		System.out.println("== push[ "+stack[top]+" ] ==");
	}
	//스택에 있는 데이터를 출력하고 , top의 위치를 변경하는 메소드
	public int pop() throws ArrayIndexOutOfBoundsException{
		System.out.println("== pop[ "+stack[top]+" ] ==");
		return stack[top--];
	}
	//스택에 있는 데이터를 출력
	public void printStack() {
		System.out.println("== Start List ==");
		
		//출력의 최초시작 위치는 top이 된다 , 1씩 줄여나가면서 0이 될때 까지 박복해서 데이터를 출력한다.
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
