package algorithm;

import util.UtilAlgorithm;

public class Sort_Merge {
	//������ Ȯ�ο� ��ƿ Ŭ������ ��ü�� static���� �̸� ������ �ξ���.
	public static UtilAlgorithm ut = new UtilAlgorithm();
	//���ĵ� ��� ��Ҹ� ���� �迭
	//���������� ����ϴ� ������ ���ʿ��� �޸� ����� �ּ�ȭ �ϱ� ����
	int data[] = new int [8];
	int mergeSortSu = 0;
	int mergeSu = 0;
	
	/**
	 * 2���� ���ĵ� �迭�� �̿��ؼ� ���Ӱ� ���ĵ� �迭�� ����� �Լ�
	 * @param a  : ������ �迭
	 * @param start : �ΰ��� �迭�� ù��° �迭�� ������
	 * @param middle : �ΰ��� �迭�� �߰� ����
	 * @param end   : �ΰ��� �迭�� �ι�° �迭�� �� ����
	 */
	public void merge(int a[], int start , int middle, int end){
		
		int i = start;
		int j = middle + 1;
		int k = start;
		
		// ���� ������� (����� ��������)�迭�� �����ϱ�
		// i�� middle���� �۰ų� ���� ������ , ���ÿ� j�� end�� ���ų� �� ���� ������
		while(i <= middle && j<=end){
			//a�� i��° ��ҿ� a�� j��° ��Ҹ� ���Ͽ� j��°��Ұ� �� ũ�ų� ���ٸ� ���ǹ� ����
			if(a[i]<=a[j]){
				//���� �迭 data�� k��° (start==i)�� a�� i��° ��Ҹ� �ִ´�.
				data[k] = a[i];
				//i�� 1 ������Ų��.
				i++;
			//a�� i��° ��ҿ� a�� j��° ��Ҹ� ���Ͽ� j��° ��Ұ� �� �۴ٸ� else�� ����
			}else {
				//���� �迭 data�� k��° (start==i)�� a�� j��° ��Ҹ� �ִ´�.
				data[k] = a[j];
				//j�� 1 ������Ų��.
				j++;
			}
			//���ǹ��� �ѹ� ������ k�� 1������Ű�� ���� �ݺ��� ����.
			k++;
		}
		
		//���� �����͵� ����
		// i �� middle���� ũ�ٸ� if���� ����
		if ( i > middle){
			//t�� j�� �ֱ�
			//t�� end���� ũ�ų����� �� ���� �ݺ��Ѵ�
			for(int t = j; t <=end; t++){
				//���� �迭 data�� k��°�� a�� t��° ��Ҹ� �ִ´�.
				data[k] = a[t];
				//k�� 1���� ��Ų��
				k++;
			}
		//i �� middle���� �۴ٸ� else���� ����
		}else {
			//t�� i�� �ֱ�
			//t�� middle���� ũ�ų����� �� ���� �ݺ��Ѵ�
			for (int t =i; t<= middle; t++){
				//���� �迭 data�� k��°�� a�� t��° ��Ҹ� �ִ´�.
				data[k] = a[t];
				//k�� 1���� ��Ų��
				k++;
			}
		}
		
		//���ĵ� �迭�� ����
		for(int t=start; t<=end; t++){
			a[t] = data[t];
		}
		ut.outputValue(data, "�߰� ���");
		mergeSu++;
		System.out.println("====== merge�Լ��� ["+mergeSu+"] �� ���� �Ǿ����ϴ�  ======");
	}
	
	/**
	 * ��Ȯ�� 2���� �����ִ� �Լ� ��Ϳ���� ���
	 * @param a  : ������ �����͸� ���� �迭
	 * @param start : ù��° �迭�� ���۰�
	 * @param end   : �ι�° �迭�� �� ��
	 */
	public void merge_sort(int[] a, int start, int end){
		// �̿��� ���� ũ�Ⱑ 1���� ���
		//���۰��� ������ ���Ͽ� ������ �� ũ�ٸ� if�� ����
		if(start < end){
			//��Ȯ�� 2���� �����ֱ�
			int middle = (start + end) / 2;
			//ù��° �迭�� �ش��Ѵ�.
			merge_sort(a , start , middle);
			ut.outputValue(a, "merge_sort1");
			//�ι�° �迭�� �ش��Ѵ�.
			merge_sort(a , middle+1 , end);
			ut.outputValue(a, "merge_sort2");
			//�����迭�� ����Ͽ� ���Ľ����ִ� �Լ��� ȣ��
			merge(a , start , middle , end);
		}
		mergeSortSu++;
		System.out.println("====== merge_sort�Լ��� ["+mergeSortSu+"] �� ���� �Ǿ����ϴ�  ======");
	}
	
	public static void main(String[] args) {
		Sort_Merge sm = new Sort_Merge();
		int array[] = new int []{7,6,5,8,3,5,9,1};
		sm.merge_sort(array, 0, array.length-1);
		
		//ut.outputResult(array);
		ut.outputResult(sm.data);
	}
}
