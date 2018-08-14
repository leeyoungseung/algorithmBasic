package algorithm;

import util.UtilAlgorithm;

public class Sort_Quick {
	//������ Ȯ�ο� ��ƿ Ŭ������ ��ü�� static���� �̸� ������ �ξ���.
	public static UtilAlgorithm ut = new UtilAlgorithm();
	
	/**
	 * �� ������ ������ �޼ҵ�
	 * @param data : ������ ������ �迭
	 * @param start : ������ġ ; ��ü �迭�� ���ʳ��� �ǹ�
	 * @param end  : �� ��ġ ; ��ü �迭�� ������ ���� ����
	 */
	public void sort_quick(int[] data, int start, int end){
		// ���ʿ��� ���������� �� ��� Ž�� �� ������ġ 
        int left = start;
        // ���� �ʿ��� �������� �� ��� Ž�� �� ���� ��ġ
        int right = end;
        // �ǹ� (��Ҹ� Ž���ϴ� �������� �Ǵ� ����� ��ġ)
        // �� �ڵ忡���� ���� �������� ���۰� ���� ������ ���� ���� �ǹ��� ��
        int pivot = data[(start+end)/2];
        
        //(1) ���� �ݺ���
        do{
        	//(2)�� (3)�� ��Ҹ� Ž���ϸ鼭(�� ��) ���������� ������ش�
        	//(2) �� ����Ž�� �ݺ���
        	// data�迭�� [left]�� ° ��Һ��� pivot���� �� Ŭ ������ �ݺ��Ͽ� left�� ���� 1 �� ���� ��Ų��
            while(data[left] < pivot) left++;
            //(3) �� ����Ž�� �ݺ���
            // data�迭�� [right]�� ° ��Һ��� pivot���� �� ������ ���� �ݺ��Ͽ� right�� ���� 1 �� ���� ��Ų��
            while(data[right] > pivot) right--;
            
            //(1-2) ���� �ݺ������� ������ ��ȯ ���� 
            //(1-2-1) left�� ������ right�� ���� ũ�ų� ���ٸ� ���ǹ��� ����ȴ�
            if(left <= right){
            	//(1-2-2) data�� left��° ���� �ӽ� ������ �־��ش�
                int temp = data[left];
                //(1-2-2) data�� right��° ���� data�� left��°�� �־��ش�
                data[left] = data[right];
                //(1-2-3) data�� right��°�� �ӽú����� ����� data�� left��° ���� �־��ش�
                data[right] = temp;
                //(1-2-4) left�� ���� 1���� ��Ų��
                left++;
              //(1-2-4) right�� ���� 1���� ��Ų��
                right--;
            }
        // (1) ���� �ݺ��� left ���� right�� ũ�ų� ���ٸ� ������ Ż���Ѵ�
        }while (left <= right);
        
        System.out.println("===================================");
        for (int su : data){System.out.print("["+su+"]");}
        System.out.println("\n===================================");
        
        //(4) start���� right�� ũ�ٸ� �ٽ� ������ �Լ��� �����Ѵ�.
        // �̶��� ������ ������ �޼ҵ忡�� ��ȯ�� �̷���� data�迭�� right������ �迭���� �� (end)�μ��� �־��ش�
        if(start < right) sort_quick(data, start, right);
        //(5) left���� end�� ũ�ٸ� �ٽ� ������ �Լ��� �����Ѵ�.
        // �̶��� ������  ������ �޼ҵ忡�� ��ȯ�� �̷���� data�� left������ �迭������ �� (start)�μ��� �־��ش�
        if(end > left) sort_quick(data, left, end);
    }
	
	public static void main(String[] args) {
		// ������ ������ �迭
		int data[] = {3,7,8,1,5,9,6,10,2,4};
        
		//�o���� Ŭ���� ��ü�����ϱ�
		Sort_Quick quick = new Sort_Quick();
		
		//�o���� �޼ҵ� �����ϱ�
        quick.sort_quick(data, 0, data.length - 1);

        //���� ��� Ȯ���ϱ�
        ut.outputResult(data);
	}
}
