/**
 * 11. 리스트(List)
 *  리스트는 배열처럼 순서가 있는 데이터를 저장하기 위한 자바의 자료구조 입니다. 
 *  리스트의 종류에는 ArrayList, LinkedList, Vector, Stack등이 있습니다.
 */
package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class B_11_List {

	public static void main(String[] args) {
		
		System.out.println("#################### ※ ArrayList ####################");
		/**
		 * ※ ArrayList
		 * 크기가 변할 수 있는 배열과 같은 자료구조
		 *  장점 : 
		 *   - Index를 사용해서 특정 요소에 빠르게 접근·검색 가능
		 *  단점 : 
		 *   - 리스트의 길이가 변할 때 시간이 오래걸림 
		 *   - 요소 삭제시의 시간이 오래걸림
		 *  사용처 
		 *   - 데이터의 양이 일관적이고, 데이터의 입력·삭제가 적은 곳
		 *   - 데이터 접근 속도가 중요한 곳에 사용됨
		 */
		List<String> list = new ArrayList<String>();
		
		// 1. 데이터의 삽입, 출력, 갱신, 삭제
		System.out.println("########### 1. 데이터의 삽입, 출력, 갱신, 삭제 ##########");

		// 1-1) 데이터 삽입
		System.out.println("########### 1-1) 데이터 삽입 ###########");
		list.add("ArrayList-String01");  // Index 0 
		list.add("ArrayList-String02");  // Index 1
		list.add("ArrayList-String03");  // Index 2
		list.add("ArrayList-String04");  // Index 3
		list.add("ArrayList-String05");  // Index 4
		
		// 1-2) 데이터 출력
		System.out.println("########### 1-2) 데이터 출력 ###########");
		System.out.println("########### Index를 지정해서 출력 ###########");
		System.out.println("Index 2번의 데이터 출력 : "+ list.get(2)); 
		
		
		System.out.println("########### 전체 데이터 출력 (for-each) ###########");
		for (String str : list) {
			System.out.println("Using for-each : "+str);
		}
		
		
		System.out.println("########### 전체 데이터 출력 (for) ###########");
		// ※ size메서드로 리스트의 길이를 알 수 있음.
		for (int i=0; i<list.size(); i++) {
			System.out.println("Using for Index ["+i+"] : "+list.get(i));
		}
		
		
		System.out.println("########### forEach메서드 ###########");
		list.forEach(str -> {
			System.out.println("Using forEach() : "+str);
		});
		
		
		// 1-3) 데이터 갱신
		System.out.println("########## 1-3) 데이터 갱신 ##########");
		list.set(1, "ArrayList-String020202");  // set메서드사용; Index를 지정하여 데이터 갱신을 할수 있음.
		printList(list);
		
		// 1-4) 데이터 삭제
		System.out.println("########## 1-4) 데이터 삭제 ##########");
		System.out.println("########## Index를 지정해서 삭제 ##########");
		list.remove(1); // Index를 지정해서 삭제
		printList(list);
		
		System.out.println("########## 값을 찾아서 삭제 ##########");
		list.remove(list.get(2)); // 값을 찾아서 삭제
		printList(list);
		
		System.out.println("########## 모든 요소 삭제 ##########");
		list.clear();  // 모든 요소 삭제
		printList(list);
		
		System.out.println("#################### ※ LinkedList ####################");
		/**
		 * ※ LinkedList
		 * 노드에 의해 요소가 연결되어 있는 리스트
		 *  - 노드란? 데이터와 이전노드의 참조값과, 다음노드의 참조값을 저장한 객체
		 * 장점 : 
		 *  - 데이터의 입력·삭제가 빠르다
		 * 단점 : 
		 *  - 데이터의 검색 속도가 느리다
		 * 사용처 : 
		 *  - 데이터 접근·검색보다 입력과 삭제가 많을 경우사용
		 */
		list = new LinkedList<String>();
		
		// 1. 데이터의 삽입, 출력, 갱신, 삭제
		System.out.println("########### 1. 데이터의 삽입, 출력, 갱신, 삭제 ##########");

		// 1-1) 데이터 삽입
		System.out.println("########### 1-1) 데이터 삽입 ###########");
		list.add("LinkedList-String01");  // Index 0 
		list.add("LinkedList-String02");  // Index 1
		list.add("LinkedList-String03");  // Index 2
		list.add("LinkedList-String04");  // Index 3
		list.add("LinkedList-String05");  // Index 4
		
		// 1-2) 데이터 출력
		System.out.println("########### 1-2) 데이터 출력 ###########");
		System.out.println("########### Index를 지정해서 출력 ###########");
		System.out.println("Index 2번의 데이터 출력 : "+ list.get(2)); 
		
		
		System.out.println("########### 전체 데이터 출력 (for-each) ###########");
		for (String str : list) {
			System.out.println("Using for-each : "+str);
		}
		
		
		System.out.println("########### 전체 데이터 출력 (for) ###########");
		// ※ size메서드로 리스트의 길이를 알 수 있음.
		for (int i=0; i<list.size(); i++) {
			System.out.println("Using for Index ["+i+"] : "+list.get(i));
		}
		
		
		System.out.println("########### forEach메서드 ###########");
		list.forEach(str -> {
			System.out.println("Using forEach() : "+str);
		});
		
		
		// 1-3) 데이터 갱신
		System.out.println("########## 1-3) 데이터 갱신 ##########");
		list.set(1, "LinkedList-String020202");  // set메서드사용; Index를 지정하여 데이터 갱신을 할수 있음.
		printList(list);
		
		// 1-4) 데이터 삭제
		System.out.println("########## 1-4) 데이터 삭제 ##########");
		System.out.println("########## Index를 지정해서 삭제 ##########");
		list.remove(1); // Index를 지정해서 삭제
		printList(list);
		
		System.out.println("########## 값을 찾아서 삭제 ##########");
		list.remove(list.get(2)); // 값을 찾아서 삭제
		printList(list);
		
		System.out.println("########## 모든 요소 삭제 ##########");
		list.clear();  // 모든 요소 삭제
		printList(list);
		
		
		System.out.println("#################### ※ Vector ####################");
		/**
		 * ※ Vector
		 * 벡터는 ArrayList와 같이 길이가 변하는 배열과 같은 자료구조이다.
		 * ArrayList와의 차이는 Vector는 Thread-safe하고 ArrayList는 그렇지 않다는점.
		 * 하지만 현재는 ArrayList를 생성시 synchronizedList()를 매개변수로 하여 생성하면 
		 * ArrayList로도 Thread-safe한 ArrayList가 생성가능하다.
		 * ex) ArrayList arrayList = new ArrayList<>(Collections.synchronizedList(list));
		 */
		list = new Vector<String>();
		
		// 1. 데이터의 삽입, 출력, 갱신, 삭제
		System.out.println("########### 1. 데이터의 삽입, 출력, 갱신, 삭제 ##########");

		// 1-1) 데이터 삽입
		System.out.println("########### 1-1) 데이터 삽입 ###########");
		list.add("Vector-String01");  // Index 0 
		list.add("Vector-String02");  // Index 1
		list.add("Vector-String03");  // Index 2
		list.add("Vector-String04");  // Index 3
		list.add("Vector-String05");  // Index 4
		
		// 1-2) 데이터 출력
		System.out.println("########### 1-2) 데이터 출력 ###########");
		System.out.println("########### Index를 지정해서 출력 ###########");
		System.out.println("Index 2번의 데이터 출력 : "+ list.get(2)); 
		
		
		System.out.println("########### 전체 데이터 출력 (for-each) ###########");
		for (String str : list) {
			System.out.println("Using for-each : "+str);
		}
		
		
		System.out.println("########### 전체 데이터 출력 (for) ###########");
		// ※ size메서드로 리스트의 길이를 알 수 있음.
		for (int i=0; i<list.size(); i++) {
			System.out.println("Using for Index ["+i+"] : "+list.get(i));
		}
		
		
		System.out.println("########### forEach메서드 ###########");
		list.forEach(str -> {
			System.out.println("Using forEach() : "+str);
		});
		
		
		// 1-3) 데이터 갱신
		System.out.println("########## 1-3) 데이터 갱신 ##########");
		list.set(1, "Vector-String020202");  // set메서드사용; Index를 지정하여 데이터 갱신을 할수 있음.
		printList(list);
		
		// 1-4) 데이터 삭제
		System.out.println("########## 1-4) 데이터 삭제 ##########");
		System.out.println("########## Index를 지정해서 삭제 ##########");
		list.remove(1); // Index를 지정해서 삭제
		printList(list);
		
		System.out.println("########## 값을 찾아서 삭제 ##########");
		list.remove(list.get(2)); // 값을 찾아서 삭제
		printList(list);
		
		System.out.println("########## 모든 요소 삭제 ##########");
		list.clear();  // 모든 요소 삭제
		printList(list);
	}
	
	
	public static void printList(List<String> list) {
		if (list.isEmpty()) {  // isEmpty 메서드로 리스트가 비어있는지 확인할 수 있다.
			System.out.println("List is Empty!!");
		}
		
		for (String str : list) {
			System.out.println("Check list element : "+str);
		}
	}
}
