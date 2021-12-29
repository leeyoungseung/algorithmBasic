package basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 13. Set
 * Set은 중복되지 않는 데이터의 모음을 저장하기 위한 자료구조입니다.
 * Set을 구현한 것으로는 HashSet, LinkedHashSet, TreeSet등이 있습니다.
 * 
 */
public class B_13_Set {

	public static void main(String[] args) {
		System.out.println("#################### ※ HashSet ####################");
		/**
		 * ※ HashSet
		 *  - HashMap의 key값이 유일해야한다는 특징을 이용하여 구현되어 있음.
		 *  - 따라서 HashMap의 장단점을 공유한다.
		 */
		Set<String> set = new HashSet<String>();
		
		// 1-1) 데이터 삽입
		System.out.println("########### 1-1) 데이터 삽입 ###########");
		set.add("HashSet-value-01");
		set.add("HashSet-value-02");
		set.add("HashSet-value-02"); // 중복된 값은 입력되지 않음.
		set.add("HashSet-value-03");
		set.add("HashSet-value-04");
		
		
		// 1-2) 데이터 출력
		System.out.println("########### 1-2) 데이터 출력 ###########");
		for (String str : set) {
			System.out.println("Set value : "+str);
		}
		
		
		// 1-3) 데이터 삭제
		System.out.println("########### 1-3) 데이터 삭제 ###########");
		System.out.println("########### 값을 지정해서 데이터 삭제가능 ###########");
		set.remove("HashSet-value-01");
		printSet(set);
		
		System.out.println("########### 모든 데이터 삭제 ############");
		set.clear();
		printSet(set);
		
		
		System.out.println("#################### ※ LinkedHashSet ####################");
		/**
		 * ※ LinkedHashSet
		 *  - LinkedHashMap의 특징을 공유한다.
		 *  - Set의 요소들의 순서가 중요한 경우 사용
		 */
		
		set = new LinkedHashSet<String>();
		
		// 1-1) 데이터 삽입
		System.out.println("########### 1-1) 데이터 삽입 ###########");
		set.add("LinkedHashSet-value-01");
		set.add("LinkedHashSet-value-02");
		set.add("LinkedHashSet-value-02"); // 중복된 값은 입력되지 않음.
		set.add("LinkedHashSet-value-03");
		set.add("LinkedHashSet-value-04");
		
		
		// 1-2) 데이터 출력
		System.out.println("########### 1-2) 데이터 출력 ###########");
		for (String str : set) {
			System.out.println("Set value : "+str);
		}
		
		
		// 1-3) 데이터 삭제
		System.out.println("########### 1-3) 데이터 삭제 ###########");
		System.out.println("########### 값을 지정해서 데이터 삭제가능 ###########");
		set.remove("LinkedHashSet-value-01");
		printSet(set);
		
		System.out.println("########### 모든 데이터 삭제 ############");
		set.clear();
		printSet(set);
		
		
		System.out.println("#################### ※ TreeSet ####################");
		/**
		 * ※ TreeSet
		 *  - TreeMap의 특징을 공유한다.
		 *  - Set의 요소들의 순서가 중요한 경우 + 저장될 데이터의 개수가 많은경우 사용
		 */
		
		set = new TreeSet<String>();
		
		// 1-1) 데이터 삽입
		System.out.println("########### 1-1) 데이터 삽입 ###########");
		set.add("TreeSet-value-01");
		set.add("TreeSet-value-02");
		set.add("TreeSet-value-02"); // 중복된 값은 입력되지 않음.
		set.add("TreeSet-value-03");
		set.add("TreeSet-value-04");
		
		
		// 1-2) 데이터 출력
		System.out.println("########### 1-2) 데이터 출력 ###########");
		for (String str : set) {
			System.out.println("Set value : "+str);
		}
		
		
		// 1-3) 데이터 삭제
		System.out.println("########### 1-3) 데이터 삭제 ###########");
		System.out.println("########### 값을 지정해서 데이터 삭제가능 ###########");
		set.remove("TreeSet-value-01");
		printSet(set);
		
		System.out.println("########### 모든 데이터 삭제 ############");
		set.clear();
		printSet(set);
		
	}
	
	public static void printSet(Set<String> set) {
		if (set.isEmpty()) {  // isEmpty 메서드로 맵이 비어있는지 확인할 수 있다.
			System.out.println("Set is Empty!!");
		}
		
		for (String str : set) {
			System.out.println("Check Set value : "+str);
		}
	}
}
