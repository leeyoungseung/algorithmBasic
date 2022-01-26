/**
 * Runnable : return X, Exception X
 * Callable : return O, Exception O
 */

package thread.ex01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadMain05 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		GetTime gt = new GetTime();
		
		System.out.println("########## Callable Test (1) ##########");
		FutureTask<ArrayList<String>> futureTask = new FutureTask<ArrayList<String>>(gt);
		new Thread(futureTask).start();
		
		for (int i=0; i<5; i++) {
			System.out.println("test1 wating Count : "+i);
			Thread.sleep(500);
		}
		
		System.out.println(futureTask.get());
		

		System.out.println("########## Callable Test (2) ##########");
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<ArrayList<String>> future = executor.submit(gt);
        
		for (int i=0; i<5; i++) {
			System.out.println("test2 wating Count : "+i);
			Thread.sleep(300);
		}
		
		System.out.println(future.get());
		
		
		// ----- Thread로 구현한 것과 같은 내용
		
		// 값이 맞이 않음
//		for (int i=0; i<3; i++) {
//			System.out.println("########## "+i+"回目 ########## ");
//			execute(5, 100000000L);
//		}
//		
//		System.out.println();
//		
//		// 동시성 문제해결
//		for (int i=0; i<3; i++) {
//			System.out.println("########## WithJoin "+i+"回目 ########## ");
//			execute(5, 100000000L, true);
//		}

	}
	
	
	public static void execute(int worker, long input) {
		execute(worker, input, false);
	}
	
	public static void execute(int worker, long input, boolean isJoin) {
		ArrayList<FutureTask<Long>> list = new ArrayList<FutureTask<Long>>();
		
		long startTime = System.currentTimeMillis();
		System.out.println("StartTime : "+ startTime);
		
		long start = 0;
		long end = input / worker;
		
		for (int i=0; i < worker; i++) {
			if (input < end) end = input; 
			System.out.printf("Start Num [%d], End Num [%d] \n", start , end);
			
			Calculator4 calc = new Calculator4(start , end);
			FutureTask<Long> futureTask = new FutureTask<Long>(calc);
			Thread t = new Thread(futureTask);
			t.start();
			
			//Data data = new Data(calc, t);
			list.add(futureTask);
			
			if (end == input) break;
			start = end + 1;
			end = end * 2; 
		}
		
		long result = 0;
		
		for (int i=0; i < list.size(); i++) {
			FutureTask<Long> task = list.get(i);
			
			try {
				
				if (isJoin) {
					//task.join();
				}
				result += task.get();
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


class GetTime implements Callable<ArrayList<String>> {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

	@Override
	public ArrayList<String> call() throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		for (int i=0; i<5; i++) {
			String time = sdf.format(new Date());
			System.out.println(time);
			list.add(time);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
		
		return list;
	}
}

class Calculator4 implements Callable<Long> {
	
	private long start;
	private long end;
	private long sum;
	
	public Calculator4(long start, long end) {
		setInit(start, end);
	}

	public Long calc() {
		long sum = 0;
		
		for (long i = start; i <= end; i++) {
			sum += i;
		}

		return sum;
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
	public Long call() throws Exception {
		return calc();
	}
	
	
	
}

