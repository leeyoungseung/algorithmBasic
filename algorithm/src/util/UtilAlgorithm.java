package util;

public class UtilAlgorithm {
	
	public UtilAlgorithm() {
		// TODO Auto-generated constructor stub
	}
	
	public void outputResult(int [] array) {
		System.out.println("\n================================================================");
		System.out.println("==========================    ���� ���      =========================");
		for(int i=0; i<array.length; i++){
			System.out.printf("%d ", array[i]);
		}
		System.out.println("\n================================================================");
	}
	
	public void outputValue(int [] array, String msg) {
		System.out.println("\n================================================================");
		System.out.println("======================="+msg+"=====================");
		for(int i=0; i<array.length; i++){
			System.out.printf("%d ", array[i]);
		}
		System.out.println("\n================================================================");
	}
	
	public void outputValue(int [] array, int i) {
		System.out.println("================================================================");
		System.out.println("======================== [ "+i+" ] ��° ���� ��� ======================== ");
		for(int su=0; su<array.length; su++){
			System.out.printf("%d ", array[su]);
		}
		System.out.println("\n================================================================\n");
	}
	
	public void outputWhenToChange(int [] array, int i) {
		System.out.println("\n================================================================\n");
		System.out.println("���� ��ȯ�Ǿ����ϴ�!!!");
		for(int su=0; su<array.length; su++){
			System.out.printf("%d ", array[su]);
		}
		System.out.println("\n================================================================\n");
	}
}
