package thread.ex01;

public class ThreadMain01 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(0L, 1000000000L);
		execute(calculator);
		
	}
	
	
	public static void execute(Calculator calculator) {
		long startTime = System.currentTimeMillis();
		System.out.println("StartTime : "+ startTime);
		calculator.calc();
		long result = (long) calculator.getSum();
		
		long endTime = System.currentTimeMillis();
		System.out.println("EndTime : "+ endTime);
		System.out.printf("Operating Time : [%.3f] Sec,  Result : [%d] \n", (endTime - startTime) / 1000.0, result);
	}
}


class Calculator {
	
	private long start;
	private long end;
	private long sum;
	
	public Calculator(long start, long end) {
		setInit(start, end);
	}

	public void calc() {
		long sum = 0;
		
		for (long i = start; i <= end; i++) {
			sum += i;
		}
		
		this.sum = sum;
	}
	
	public long getSum() {
		return this.sum;
	}

	public void setInit(long start, long end) {
		this.start = start;
		this.end   = end;
		this.sum   = 0;
	}

}

//StartTime : 1643158486533
//EndTime : 1643158487070
//Operating Time : [0.537] Sec,  Result : [500000000500000000] 