package algorithm;

public class Sort_Select {
	public static void main(String[] args) {
		int i=0;		//�迭�� ���Ҹ� �ݺ������� Ž���ϱ����� ���� i
		int j=0;		//�迭�� ���Ҹ� �ݺ������� Ž���ϱ����� ���� j
		int min=0;	//�ּҰ�
		int index=0;	//���� ���� ���Ұ� ��ġ�ϴ� ���� ����Ű�� ����
		int temp=0;	//Ư���� �� ���� �ٲٱ����� ����
		int [] array = new int []{1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		System.out.println("������ ���� : "+ array.length);
		
		//ù��° for���� �迭�� ����� �Ѱ�[i] ���� 
		for(i=0; i<array.length; i++){
			min = 9999; //min�� �׻� �ּҰ��� �����ؾ��ϹǷ� ó���� �迭�� ��� ���Һ��� ū���� �־���Ѵ�
			
			/* �ι�° for���� �迭�� ��ҵ�[j]�� [i]�� ���ؼ� �ּ� ���� �迭�� �������� ������.
			 * ù��° for���� ���� [i]�� ���ڰ� �þ�� i�� j�� ���� j=i �ϹǷ� �˻������� �پ���. 
			 */
			for(j = i; j<array.length; j++){
				if(min > array[j]){//1. �ּҰ��� ����� min ������ ���� array�� ��� ���� ���Ѵ�. min�� �� ũ�� �ּҰ��� �ƴϰ� �ȴ�
					min = array[j];//2. �ּҰ����� �񱳴���� ��Ұ��� �����Ѵ�.
					index = j;		// 3. ������ �ּҰ��� ��ġ�� index������ ����Ѵ�.
				} 
			}
			
			temp = array[i];		//1. ù��° for������ ���� ���� �� i��°�� ����� ���� temp�� �ӽ� ���� 
			array[i] = array[index];//2. �ֽ�ȭ�� �ּҰ��� ��ġ(index)�� �ش��ϴ� �迭�� ��Ҹ� i��° ����� ��ġ�� �̵���Ų��.
			array[index] = temp;	//3. 1.���� �ӽ÷� ������ ���� index��ġ�� �迭 ��ҿ� �ִ´�. 
			
			System.out.println("================================================================");
			System.out.println("[ "+i+" ] ��° �Դϴ�.  ���ĵ� ���� ? [ "+array[i]+" ]");
			for(int su=0; su<array.length; su++){
				System.out.printf("%d ", array[su]);
			}
			System.out.println("\n================================================================");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("================================================================");
		for(i=0; i<10; i++){
			System.out.printf("%d ", array[i]);
		}
		
	}
}
