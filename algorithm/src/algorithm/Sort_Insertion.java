package algorithm;

import util.UtilAlgorithm;

public class Sort_Insertion {
	
	public static void main(String[] args){
		
		UtilAlgorithm ut = new UtilAlgorithm();
		
		int i;
		int j;
		int temp=0;
		int [] array = new int []{1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		//���� �� �ڵ忡���� ���ڸ��� ���� ���� ���� �ƴϸ� ������ �߻��Ѵ�
		//�ֳ��ϸ� �迭�� ��ü ũ�⸦ ��� ������ ���� 
		//ex[-1][0][1]....[9]
		//int [] array = new int []{5, 10, 1, 8, 7, 6, 4, 3, 2, 9};
		
		
		//ù��° �ݺ��� : 10�� ����� �迭�̹Ƿ� 9�� �ݺ��Ͽ� ���� �� �ִ� for��
		for(i=0; i<array.length-1; i++){
			j = i;	//j�� i�� �����Ѵ�.
			System.out.println("�ݺ��� �� j ���� : [ "+j+" ]" );
			System.out.println("�ݺ��� �� j �迭 ���� : [ "+array[j]+" ]" );
			System.out.println("�ݺ��� �� j+1 �迭 ���� : [ "+array[j+1]+" ]" );
			/*
			 * �迭 ������ ���� ���ϱ����� while��
			 * 1) j���� i�� �����ϱ� ������ 1�� for���� �����Ŀ� ���� ������ i�� j�� ���� ������
			 * 2) ���ǽ��� �ؼ��� �迭�� [j]��° ���� [j+1]��° ������ ũ�ٴ� ������ ������ �ɶ� ���� �ݺ��Ѵ�. 
			 * 3) j������ j--�� ���� 1�� �پ��� �ǹǷ�, �پ��鼭 ���� j������ ���� ��ġ�� �ִ� �迭�� ��ҵ��� ���ĵȴ�.
			 */
			while(array[j] > array[j + 1]){
				System.out.println("���� j�� ���� [ "+j+" ] �Դϴ�. ���� j��ġ�� �迭 ���� [ "+array[j]+" ]");
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				j--;
			}
			// While������ ��ȯ��
			ut.outputValue(array, i);
		}
		
		ut.outputResult(array);
	}
}
