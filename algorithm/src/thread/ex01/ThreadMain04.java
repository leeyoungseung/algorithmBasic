package thread.ex01;

import java.util.ArrayList;

public class ThreadMain04 {
	
	public static int sharedNum = 0;

	public static void main(String[] args) {
		
		SyncData sd = new SyncData(0);
		
		ArrayList<SyncTest> list = new ArrayList<SyncTest>();
		for (int i=1; i<=3; i++) {
			SyncTest sync = new SyncTest(i, sd);
			sync.start();
			list.add(sync);
		}
		
		for (SyncTest sync : list) {
			try {
				sync.join();
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
		
		System.out.println("Test1-Result : "+sd.balance);
		
		System.out.printf("\n\n");
		
		ArrayList<SyncTest2> list2 = new ArrayList<SyncTest2>();
			
		for (int i=1; i<=3; i++) {
			SyncTest2 sync2 = new SyncTest2(i);
			sync2.start();
			list2.add(sync2);
			
		}
			
		for (SyncTest2 sync2 : list2) {
			try {
				sync2.join();
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
		
		System.out.println("Test2-Result : "+sharedNum);
		
	}
}

class SyncData {
	Integer balance;
	public SyncData(int balance) {
		this.balance = balance;
	}
}

class SyncTest extends Thread{

	SyncData syncData;
	int number;
	
	public SyncTest(int number, SyncData syncData) {
		this.number = number;
		this.syncData = syncData;
	}
	
	@Override
	public void run() {
		sum();
	}
	
	public void sum() {
		System.out.println("sum() Thread ["+number+"] Before : "+syncData.balance);
		
		for (int i=1; i<=3; i++) {
			synchronized (this) {
				syncData.balance += i;
				System.out.println("sum() Thread ["+number+"] After  : "+syncData.balance);
			}
		}
	}
}

class SyncTest2 extends Thread {
	int number;
	
	public SyncTest2(int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		sum();
	}
	
	public synchronized void sum() {
		System.out.println("sum() Thread ["+number+"] Before : "+ThreadMain04.sharedNum);
		
		for (int i=1; i<=3; i++) {
			ThreadMain04.sharedNum += i;
			System.out.println("sum() Thread ["+number+"] After  : "+ThreadMain04.sharedNum);
		}
		
	}
}