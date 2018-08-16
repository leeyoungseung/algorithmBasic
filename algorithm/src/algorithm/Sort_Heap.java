package algorithm;

import util.UtilAlgorithm;

//������
public class Sort_Heap {
	
	//������ Ȯ�ο� ��ƿ Ŭ������ ��ü�� static���� �̸� ������ �ξ���.
	public static UtilAlgorithm ut = new UtilAlgorithm();
	
	/**
	 * heap������ ������ �޼ҵ�
	 * @param heap : ������ ������ �迭
	 * @return
	 */
	public int[] sort_heap(int heap[]){
		//���� ��ü Ʈ�������� �ִ� �������� �����
		//�μ��� ���� �迭�� ũ�� ��ŭ �ݺ��Ѵ�
		for(int i = 1; i<heap.length; i++){
			//c�� �ڱ��ڽ� ���(�迭ĭ�� �̵��ϸ� �������ִ� ����)
			int c = i;
			//
			do{
				//�θ��� ���� ���ϱ�
				int root = (c - 1) / 2;
				//�θ��� ���� �ڽ��� ���� ���Ͽ� �ڽ��� ���� ��  ũ�� �ڽ��� ���� �θ��� ��ġ�� �̵���Ų��.
				if(heap[root]< heap[c]){
					int temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				//������ �θ��� ��ġ��� ���ǿ��� �ٽ� �ݺ��Ѵ� 
				c = root;
			//c�� 0�̵��� �ʴ� �� �ݺ��Ѵ�
			} while(c !=0);
		}
		//�ϼ��� �ִ��� ���� ����غ���
		ut.outputValue(heap, "�ִ� �������� �����");
				
		//ũ�⸦ �ٿ����� �ݺ������� ���� ����
		for(int i = heap.length - 1; i >= 0; i--){
			//heap�� 0��° ��ġ�� ���� �ִ밪�� �� �ְ�,
			//�迭�� �������� �ּ� ���� �����Ƿ� ���� ��ġ�� �ٲٸ� �����̵ȴ�
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			//�ٽ� ��Ʈ�� ��ġ�� ù��°�� ��ġ��Ű������ ������ 0����
			int root = 0;
			//c�� ��Ʈ�� �ڽ��̵ȴ�.
			int c = 1;
			do{
				System.out.println("do");
				c = 2 * root + 1;
				System.out.println(c);
				
				//Java������ �迭ũ�⸦ ������ ������ �߻��ϱ⿡ ���� �ذ��� ���� ���ǹ��� �ɾ���
				if(c <= heap.length){
					//�ڽ��߿� �� ū���� ã��(1)
					if(heap[c] < heap[c + 1] && c < i - 1){
						c++;
					}
				}
				if(c <= heap.length){
					//�ڽ��߿� �� ū���� ã��(2)
					if(heap[c] < heap[c + 1] && c < i - 1){
						c++;
					}
				}
				
				if(c <= heap.length){
					//root���� �ڽ��� �� ũ�ٸ� ��ȯ�� �߻�
					if(heap[root] < heap[c] && c < i){
						int temp2 = heap[root];
						heap[root] = heap[c];
						heap[c] = temp2;
					}
				}
				//����� �������� c�� �ٽ� root�� ��ġ�� �����Ѵ�
				root = c;
			} while (c < i);
		}
		//���ĵ� ����� ����ϱ�
		return heap;
	}
	
	public static void main(String[] args) {
		//������ �������� �迭�� ����
		int heap[] = new int[]{7,6,5,8,3,5,9,1,6};
		//��ü�� ����
		Sort_Heap sh = new Sort_Heap();
		//�޼ҵ带 ȣ���Ͽ� ����� �޾� ����ϱ�
		ut.outputResult(sh.sort_heap(heap));
	}
}
