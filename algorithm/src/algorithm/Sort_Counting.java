package algorithm;

import util.UtilAlgorithm;

public class Sort_Counting {

	//������ Ȯ�ο� ��ƿ Ŭ������ ��ü�� static���� �̸� ������ �ξ���.
	public static UtilAlgorithm ut = new UtilAlgorithm();
	//������ �������� ������ �����ϴ� �迭
	int [] count;
	//���Ŀ� ����� �����Ͱ� ���� �迭
	int [] array;
	
	/**
	 * ������ : ���Ŀ� ����� �迭�� �ʱ�ȭ���ش�
	 * @param count : ������ �������� ������ �����ϴ� �迭
	 * @param array : ���Ŀ� ����� �����Ͱ� ���� �迭
	 */
	public Sort_Counting(int [] count, int [] array){
		this.count = count;
		this.array = array;
	}
	
	/**
	 * ��������� �����ϴ� �ڵ�
	 */
	public void sort(){
		//�ʱ� ���� �����մϴ� [0][0][0][0][0]
		for(int i = 0; i < 5; i++){
			count[i] = 0;
		}
		//count �迭�� ��Ұ� � ���� ���
		for(int i = 0; i < 30; i++){
			System.out.println("array[i] - 1 : "+(array[i]));
			//(1)1~5������ ���ڰ� �������� ������� ���� ����ؾ��Ѵ� �׸���  �������� ������ count�迭�� ��ü���� ����
			//�迭�� 0���� �����ϹǷ� 1==[0]�� �ȴ�
			//array[i]��° ���� -1���ϴ� �����̴�
			//(2) array[i]��° �� -1 �� �ش��ϴ� count �迭�� ĭ�� 1�� �����ش�(++)
			//�������� ������ 1~5�̹Ƿ� count�迭�� ���������� 1�� �������� ������ �������� �����Ͱ� � �� �ִ���
			//ī���� �Ǿ�����
			count[array[i] - 1]++;
			ut.outputValue(count, i+" ��° ");
		}
		// ���ĵ� �����͸� ����ϱ�
		for(int i = 0; i < 5; i++){
			//count�迭�� ��� ���� 0�� �ƴ϶�� ���ǹ� ����
			if(count[i] !=0){
				//count �迭�� �ش��ϴ� ĭ�� ���� ŭ �ݺ��Ǿ� ��µȴ�
				for(int j = 0; j < count[i]; j++){
					System.out.printf("%d ", i+1);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		//�������� ������ �����Ͽ�, ������ �������� ������ �����ϴ� �迭�� ����
		int [] count = new int [5];
		//������ ����� �Ǵ� �������� �迭
		int [] array = new int []{
				1, 3, 2, 4, 3, 2, 5, 3, 1, 2,
				3, 4, 4, 3, 5, 1, 2, 3, 5, 2,
				3, 1, 4, 3, 5, 1, 2, 1, 1, 1
		};
		//��ü ����
		Sort_Counting sc = new Sort_Counting(count, array);
		//���� ����
		sc.sort();
	}
}
