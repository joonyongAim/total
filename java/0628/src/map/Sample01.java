package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sample01 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("고길동", 20);
		map.put("둘리", 50);
		map.put("홍길동", 50);
		map.put("ㅁㅁㅁ", 30);
		
		System.out.println(map.size());
		
		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String key = it.next();
			map.put(key, map.get(key) + 5);
			int value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> entry = entryIt.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}

}
