package thread.ex01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ThreadMain03 {

	public static void main(String[] args) throws InterruptedException {
		
		PrintTime pt = new PrintTime();
		Thread t = new Thread(pt);
		t.start();
		
//		for (int i=0; i<20; i++) {
//			System.out.println("test"+i);
//			Thread.sleep(700);
//		}
		
		// ----- Thread로 구현한 것과 같은 내용
		
		// 값이 맞이 않음
		execute(5, 1000000000L, true);
		
		// 동시성 문제해결
		execute(5, 1000000000L);
		
	}

	public static void execute(int worker, long input) {
		execute(worker, input, false);
	}
	
	public static void execute(int worker, long input, boolean isJoin) {
		ArrayList<Data> list = new ArrayList<Data>();
		
		long startTime = System.currentTimeMillis();
		System.out.println("StartTime : "+ startTime);
		
		long start = 0;
		long end = input / worker;
		
		for (int i=0; i < worker; i++) {
			if (input < end) end = input; 
			System.out.printf("Start Num [%d], End Num [%d] \n", start , end);
			
			Calculator3 calc = new Calculator3(start , end);
			Thread t = new Thread(calc);
			t.start();
			
			Data data = new Data(calc, t);
			list.add(data);
			
			if (end == input) break;
			start = end + 1;
			end = end * 2; 
		}
		
		long result = 0;
		
		for (int i=0; i < list.size(); i++) {
			Data data = list.get(i);
			
			try {
				
				if (isJoin) {
					data.thread.join();
				}
				result += data.calc.getSum();
			} catch (Exception e) {}
		}
			
		long endTime = System.currentTimeMillis();
		System.out.println("EndTime : "+ endTime);
				
		System.out.println("Operating Time : ["+ (endTime - startTime) / 1000.0 + "] Sec");
		System.out.println(result);
		list.clear();
		list = null;
	}
}

class PrintTime implements Runnable {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}	
}

class Data {

	Calculator3 calc;
	Thread thread;
	
	public Data(Calculator3 calc, Thread thread) {
		this.calc = calc;
		this.thread = thread;
	}
	
}

class Calculator3 implements Runnable {
	
	private long start;
	private long end;
	private long sum;
	
	public Calculator3(long start, long end) {
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
	
	@Override
	public void run() {
		calc();
	}
	
}


//StartTime : 1643127874438
//2022-01-26 01:24:34.438
//Start Num [0], End Num [200000000] 
//Start Num [200000001], End Num [400000000] 
//Start Num [400000001], End Num [800000000] 
//Start Num [800000001], End Num [1000000000] 
//EndTime : 1643127874666
//Operating Time : [0.228] Sec
//500000000500000000
//StartTime : 1643127874667
//Start Num [0], End Num [200000000] 
//Start Num [200000001], End Num [400000000] 
//Start Num [400000001], End Num [800000000] 
//Start Num [800000001], End Num [1000000000] 
//EndTime : 1643127874668
//Operating Time : [0.001] Sec
//0
