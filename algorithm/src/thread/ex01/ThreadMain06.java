package thread.ex01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ThreadMain06 {
	
	public static void main(String[] args) throws InterruptedException{
		
		// 정해진 수만큼 스레드 생성
		int workers = 4;
		ExecutorService executorService = Executors.newFixedThreadPool(workers);
		
		for (int i=1; i<=10; i++) {
			ThreadPoolTest threadPoolTest = new ThreadPoolTest(i);
			executorService.submit(threadPoolTest);
		}
		
		if (executorService.awaitTermination(5, TimeUnit.SECONDS)) {
			System.out.println("All Tasks over");
		}
		
		executorService.shutdown();
		
	}

}

class ThreadPoolTest implements Runnable {

	int number;
	
	@Override
	public void run() {
		counting();
	}
	
	public ThreadPoolTest(int number) {
		this.number = number;
	}
	
	public void counting() {
		for (int i=0; i<5; i++) {
			System.out.printf("Thread [%d], Count [%d] \n", number, i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
}