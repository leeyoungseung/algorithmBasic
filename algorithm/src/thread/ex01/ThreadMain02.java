package thread.ex01;

import java.util.ArrayList;

public class ThreadMain02 {

	public static void main(String[] args) {
		
		// 동시성 문제해결
		System.out.println("########## Solved concurrency issue. ##########");
		execute(5, 1000000000L, true);
		
		System.out.printf("\n\n");
		// 값이 맞이 않음
		System.out.println("########## Not Solved concurrency issue. ##########");
		execute(5, 1000000000L);
		
	}
	
	
	public static void execute(int worker, long input) {
		execute(worker, input, false);
	}
	
	
	public static void execute(int worker, long input, boolean isJoin) {
		ArrayList<Calculator2> list = new ArrayList<Calculator2>();
		
		long startTime = System.currentTimeMillis();
		System.out.println("StartTime : "+ startTime);
		
		long start = 0;
		long end = input / worker;
		
		for (int i=1; i <= worker; i++) {
			if (input < end) end = input; 
			
			Calculator2 calc = new Calculator2(start , end, i);
			calc.start();
			list.add(calc);
			
			if (end == input) break;
			start = end + 1;
			end = end * 2; 
		}
		
		long result = 0;
		
		for (int i=0; i < list.size(); i++) {
			Calculator2 calc = list.get(i);
			try {
				
				if (isJoin) {
					calc.join();
				}
				result += calc.getSum();
			} catch (Exception e) {}
		}
			
		long endTime = System.currentTimeMillis();
		System.out.println("EndTime : "+ endTime);
		System.out.printf("Operating Time : [%.3f] Sec,  Result : [%d] \n", (endTime - startTime) / 1000.0, result);
		list.clear();
		list = null;
	}
	
}

class Calculator2 extends Thread {
	
	private long start;
	private long end;
	private long sum;
	private int num;
	
	public Calculator2(long start, long end, int num) {
		setInit(start, end, num);
	}

	public void calc() {
		System.out.printf("Thread [%d] Before, Num [%d], End Num [%d], sum() : [%d] \n", num, start, end, start);
		long sum = 0;
		
		for (long i = start; i <= end; i++) {
			sum += i;
		}
		
		System.out.printf("Thread [%d] After, Num [%d], End Num [%d], sum() : [%d] \n", num, start, end, sum);
		this.sum = sum;
	}
	
	public long getSum() {
		return this.sum;
	}

	public void setInit(long start, long end, int num) {
		this.start = start;
		this.end   = end;
		this.sum   = 0;
		this.num   = num;
	}
	
	@Override
	public void run() {
		calc();
	}
	
}

//########## Solved concurrency issue. ##########
//StartTime : 1643159110620
//Thread [4] Before, Num [800000001], End Num [1000000000], sum() : [800000001] 
//Thread [1] Before, Num [0], End Num [200000000], sum() : [0] 
//Thread [3] Before, Num [400000001], End Num [800000000], sum() : [400000001] 
//Thread [2] Before, Num [200000001], End Num [400000000], sum() : [200000001] 
//Thread [1] After, Num [0], End Num [200000000], sum() : [20000000100000000] 
//Thread [4] After, Num [800000001], End Num [1000000000], sum() : [180000000100000000] 
//Thread [2] After, Num [200000001], End Num [400000000], sum() : [60000000100000000] 
//Thread [3] After, Num [400000001], End Num [800000000], sum() : [240000000200000000] 
//EndTime : 1643159110874
//Operating Time : [0.254] Sec,  Result : [500000000500000000] 
//
//
//########## Not Solved concurrency issue. ##########
//StartTime : 1643159110876
//EndTime : 1643159110876
//Operating Time : [0.000] Sec,  Result : [0] 
//Thread [4] Before, Num [800000001], End Num [1000000000], sum() : [800000001] 
//Thread [3] Before, Num [400000001], End Num [800000000], sum() : [400000001] 
//Thread [2] Before, Num [200000001], End Num [400000000], sum() : [200000001] 
//Thread [1] Before, Num [0], End Num [200000000], sum() : [0] 
//Thread [1] After, Num [0], End Num [200000000], sum() : [20000000100000000] 
//Thread [4] After, Num [800000001], End Num [1000000000], sum() : [180000000100000000] 
//Thread [2] After, Num [200000001], End Num [400000000], sum() : [60000000100000000] 
//Thread [3] After, Num [400000001], End Num [800000000], sum() : [240000000200000000] 
