package algorithm;

import util.UtilAlgorithm;

public class Sort_Merge {
	//������ Ȯ�ο� ��ƿ Ŭ������ ��ü�� static���� �̸� ������ �ξ���.
	public static UtilAlgorithm ut = new UtilAlgorithm();
	int data[] = new int [8];
	
	public void merge(int a[], int start , int middle, int end){
		int i = start;
		int j = middle + 1;
		int k = start;
		// ���� ������� �迭 ����
		while(i <= middle && j<=end){
			if(a[i]<=a[j]){
				data[k] = a[i];
				i++;
			}else {
				data[k] = a[j];
				j++;
			}
			k++;
		}
		//���� �����͵� ����
		if ( i > middle){
			for(int t = j; t <=end; t++){
				data[k] = a[t];
				k++;
			}
		}else {
			for (int t =i; t<= middle; t++){
				data[k] = a[t];
				k++;
			}
		}
		//���ĵ� �迭�� ����
		for(int t=start; t<=end; t++){
			a[t] = data[t];
		}
		ut.outputValue(data, "�߰� ���");
		
	}
	
	public void merge_sort(int[] a, int start, int end){
		// �̿��� ���� ũ�Ⱑ 1���� ���
		if(start < end){
			int middle = (start + end) / 2;
			merge_sort(a , start , middle);
			ut.outputValue(a, "merge_sort1");
			merge_sort(a , middle+1 , end);
			ut.outputValue(a, "merge_sort2");
			merge(a , start , middle , end);
		}
	}
	
	public static void main(String[] args) {
		Sort_Merge sm = new Sort_Merge();
		int array[] = new int []{7,6,5,8,3,5,9,1};
		//System.out.println(array);
		sm.merge_sort(array, 0, array.length-1);
		
		ut.outputResult(array);
		
	}
}
