package algorithm;

public class Sort_Bubble {

	public static void main(String[] args) {
		int i = 0;		//�迭�� ���Ҹ� �ݺ������� Ž���ϱ����� ���� i
		int j = 0;		//�迭�� ���Ҹ� �ݺ������� Ž���ϱ����� ���� j
		int temp = 0;	//Ư���� �� ���� �ٲٱ����� ����
		
		int array [] = new int []{1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		//�迭���� ���Ҹ� �ݺ��ؼ� ���ϱ� ���� for�� (1)
		for(i=0; i<array.length; i++){		
			System.out.println("============== ù��° for�� [ "+i+" ] ��° ����");
			/*
			 * 1) ���� ���ķ� �������� ������ ���� ���� �ڸ����� �ٷ� ���� �ڸ��� ���� ���ϴ� ���� �ݺ��ϴ� �����̴�.
			 * 2) i���� �ݺ��� �ݵ�� ������ �ִ밪�� ������ �̵���
			 * 3) ���� i+1 ���� ���� �̹� �ִ밪�� Ȯ���� ��Ȳ���� 9���� �� Ž������ �ʰ� 1���� �ٿ��� Ž���ϰԵ�
			 */
			for(j=0; j<((array.length-1)-i); ++j){
				
				if(array[j] > array[j + 1]){	//j+1�� j���� �۴ٸ� if�� ���� ������ ����� 
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					outputValue(array);
					System.out.println("��ȯ�� �߻�!!!");
				}
				System.out.println("ī��Ʈ J [ "+j+"] ��° ��");
			}
			
			System.out.println("============== ù��° for�� [ "+i+" ] ��° ���� ��� ");
			outputValue(array);
			System.out.println("\n================================================================");
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("================    ���� ���    ==================");
		outputValue(array);
	}
	
	
	public static void outputValue(int [] array) {
		System.out.println("================================================================");
		
		for(int i=0; i<array.length; i++){
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
}
