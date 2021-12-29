package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 12. Map
 *  Map은 Key-value구조로 구성된 데이터를 저장하는 자료구조 입니다.
 *  특징 : 
 *   - key를 이용한 데이터 검색에 최적화된 자료구조
 *   - 같은 값의 key는 존재할 수 없음.
 *  Map을 구현한 것으로는 HashMap, LinkedHashMap, TreeMap등이 있습니다.
 *
 */
public class B_12_Map {

	public static void main(String[] args) {
		
		System.out.println("#################### ※ HashMap ####################");
		/**
		 * ※ HashMap
		 * 특징 : 
		 *  - HashTable을 사용하여 만들어짐
		 *  - key값을 해시함수을 통해 데이터의 참조값이 저장된 
		 *    bucket의 index값을 찾고, index값을 통해 데이터에 접근한다. 
		 * 장점 : 
		 *  - key값으로 검색하기 때문에 검색속도가 빠르다.
		 * 단점 : 
		 *  - bucket의 크기조정이 필요할 경우, 처리속도 지연이 발생할 수 있음.
		 *  - 데이터 저장시 배열, 리스트보다 더많은 메모리가 필요
		 *  - key값이 정렬되어 있지 않음.
		 * 사용처 : 
		 *  - 유니크한 key값을 이용한 데이터의 활용이 필요한경우
		 *  - 데이터의 입력·삭제가 빈번할 경우
		 *  
		 */
		Map<String, String> map = new HashMap<String, String>();
		
		// 1. 데이터의 삽입, 출력, 갱신, 삭제
		System.out.println("########### 1. 데이터의 삽입, 출력, 갱신, 삭제 ##########");
		// 1-1) 데이터 삽입
		System.out.println("########### 1-1) 데이터 삽입 ###########");
		map.put("HashMap-key-01", "HashMap-value-01");
		map.put("HashMap-key-02", "HashMap-value-02");
		map.put("HashMap-key-03", "HashMap-value-03");
		map.put("HashMap-key-04", "HashMap-value-04");
		map.put("HashMap-key-05", "HashMap-value-05");
		
		
		// 1-2) 데이터 출력
		System.out.println("########### 1-2) 데이터 출력 ###########");
		System.out.println("########### key를 지정해서 출력 ###########");
		System.out.println(map.get("HashMap-key-02"));
		
		
		System.out.println("########### 전체 데이터 출력 (keySet메서드 사용) ###########");
		for (String key : map.keySet()) {
			System.out.println(String.format("Using keySet key : [%s], value : [%s]", key, map.get(key)));
		}
		
		
		System.out.println("########### 전체 데이터 출력 (key값의 Iterator사용) ###########");
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("Using Iterator key : [%s], value : [%s]", key, map.get(key)));
		}
		
		
		System.out.println("########### 전체 데이터 출력 (entrySet메서드 사용) ###########");
		for (Map.Entry<String, String> obj : map.entrySet()) {
			System.out.println(String.format("Using entrySet key : [%s], value : [%s]", obj.getKey(), obj.getValue()));
		}
		
		
		// 1-3) 데이터 갱신
		System.out.println("########### 1-3) 데이터 갱신 ###########");
		System.out.println("########### 같은 키를 사용해서 데이터를 넣으면 덮어쓰기가 되면서 갱신이 일어남 ###########");
		map.put("HashMap-key-02", "HashMap-value-02_updated");
		printMap(map);
		
		System.out.println("########### replace메서드 사용 ###########");
		map.replace("HashMap-key-02", "HashMap-value-02_updated_new");
		printMap(map);
		
		
		// 1-4) 데이터 삭제
		System.out.println("########### 1-4) 데이터 삭제 ###########");
		System.out.println("########### 키값을 지정해서 데이터 삭제가능 ###########");
		map.remove("HashMap-key-02");
		printMap(map);
		System.out.println("########### 모든 데이터 삭제 ############");
		map.clear();
		printMap(map);
		
		System.out.println("#################### ※ LinkedHashMap ####################");
		/**
		 * ※ LinkedHashMap
		 * HashMap을 상속받은 자료구조로 key값의 순서를 보존하므로 정렬된 key값이 필요한 경우 사용
		 */
		
		map = new LinkedHashMap<String, String>();
		// 1. 데이터의 삽입, 출력, 갱신, 삭제
		System.out.println("########### 1. 데이터의 삽입, 출력, 갱신, 삭제 ##########");
		// 1-1) 데이터 삽입
		System.out.println("########### 1-1) 데이터 삽입 ###########");
		map.put("LinkedHashMap-key-01", "LinkedHashMap-value-01");
		map.put("LinkedHashMap-key-02", "LinkedHashMap-value-02");
		map.put("LinkedHashMap-key-03", "LinkedHashMap-value-03");
		map.put("LinkedHashMap-key-04", "LinkedHashMap-value-04");
		map.put("LinkedHashMap-key-05", "LinkedHashMap-value-05");
		
		
		// 1-2) 데이터 출력
		System.out.println("########### 1-2) 데이터 출력 ###########");
		System.out.println("########### key를 지정해서 출력 ###########");
		System.out.println(map.get("LinkedHashMap-key-02"));
		
		
		System.out.println("########### 전체 데이터 출력 (keySet메서드 사용) ###########");
		for (String key : map.keySet()) {
			System.out.println(String.format("Using keySet key : [%s], value : [%s]", key, map.get(key)));
		}
		
		
		System.out.println("########### 전체 데이터 출력 (key값의 Iterator사용) ###########");
	    keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("Using Iterator key : [%s], value : [%s]", key, map.get(key)));
		}
		
		
		System.out.println("########### 전체 데이터 출력 (entrySet메서드 사용) ###########");
		for (Map.Entry<String, String> obj : map.entrySet()) {
			System.out.println(String.format("Using entrySet key : [%s], value : [%s]", obj.getKey(), obj.getValue()));
		}
		
		
		// 1-3) 데이터 갱신
		System.out.println("########### 1-3) 데이터 갱신 ###########");
		System.out.println("########### 같은 키를 사용해서 데이터를 넣으면 덮어쓰기가 되면서 갱신이 일어남 ###########");
		map.put("LinkedHashMap-key-02", "LinkedHashMap-value-02_updated");
		printMap(map);
		
		System.out.println("########### replace메서드 사용 ###########");
		map.replace("LinkedHashMap-key-02", "LinkedHashMap-value-02_updated_new");
		printMap(map);
		
		
		// 1-4) 데이터 삭제
		System.out.println("########### 1-4) 데이터 삭제 ###########");
		System.out.println("########### 키값을 지정해서 데이터 삭제가능 ###########");
		map.remove("LinkedHashMap-key-02");
		printMap(map);
		System.out.println("########### 모든 데이터 삭제 ############");
		map.clear();
		printMap(map);
		
		
		System.out.println("#################### ※ TreeMap ####################");
		/**
		 * ※ TreeMap
		 *  트리구조 기반으로 구현된 Map
		 * 장점 : 
		 *  - 메모리 사용량이 HashMap비해 적음
		 *  - key값이 정렬되어있음
		 * 단점 : 
		 *  - 데이터의 입력·삭제시 HashMap보다 느리다.(Tree의 Node재배치가 일어날 수 있으므로) 
		 */
		map = new TreeMap<String, String>();
		
		// 1. 데이터의 삽입, 출력, 갱신, 삭제
		System.out.println("########### 1. 데이터의 삽입, 출력, 갱신, 삭제 ##########");
		// 1-1) 데이터 삽입
		System.out.println("########### 1-1) 데이터 삽입 ###########");
		map.put("TreeMap-key-01", "TreeMap-value-01");
		map.put("TreeMap-key-02", "TreeMap-value-02");
		map.put("TreeMap-key-03", "TreeMap-value-03");
		map.put("TreeMap-key-04", "TreeMap-value-04");
		map.put("TreeMap-key-05", "TreeMap-value-05");
		
		
		// 1-2) 데이터 출력
		System.out.println("########### 1-2) 데이터 출력 ###########");
		System.out.println("########### key를 지정해서 출력 ###########");
		System.out.println(map.get("TreeMap-key-02"));
		
		
		System.out.println("########### 전체 데이터 출력 (keySet메서드 사용) ###########");
		for (String key : map.keySet()) {
			System.out.println(String.format("Using keySet key : [%s], value : [%s]", key, map.get(key)));
		}
		
		
		System.out.println("########### 전체 데이터 출력 (key값의 Iterator사용) ###########");
	    keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("Using Iterator key : [%s], value : [%s]", key, map.get(key)));
		}
		
		
		System.out.println("########### 전체 데이터 출력 (entrySet메서드 사용) ###########");
		for (Map.Entry<String, String> obj : map.entrySet()) {
			System.out.println(String.format("Using entrySet key : [%s], value : [%s]", obj.getKey(), obj.getValue()));
		}
		
		
		// 1-3) 데이터 갱신
		System.out.println("########### 1-3) 데이터 갱신 ###########");
		System.out.println("########### 같은 키를 사용해서 데이터를 넣으면 덮어쓰기가 되면서 갱신이 일어남 ###########");
		map.put("TreeMap-key-02", "TreeMap-value-02_updated");
		printMap(map);
		
		System.out.println("########### replace메서드 사용 ###########");
		map.replace("TreeMap-key-02", "TreeMap-value-02_updated_new");
		printMap(map);
		
		
		// 1-4) 데이터 삭제
		System.out.println("########### 1-4) 데이터 삭제 ###########");
		System.out.println("########### 키값을 지정해서 데이터 삭제가능 ###########");
		map.remove("TreeMap-key-02");
		printMap(map);
		System.out.println("########### 모든 데이터 삭제 ############");
		map.clear();
		printMap(map);
		
		
	}
	
	public static void printMap(Map<String, String> map) {
		if (map.isEmpty()) {  // isEmpty 메서드로 맵이 비어있는지 확인할 수 있다.
			System.out.println("Map is Empty!!");
		}
		
		for (String key : map.keySet()) {
			System.out.println(String.format("Check Map key : [%s], value : [%s]", key, map.get(key)));
		}
	}
	
}
