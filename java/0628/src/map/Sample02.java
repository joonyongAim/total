package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Sample02 {

	public static void main(String[] args) {
		String[] data =
			{ "A", "B", "C", "A", "A", "B", "B", "C", "A"};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<data.length; i++) {
			if(map.containsKey(data[i])) {
				int value = map.get(data[i]);
				map.put(data[i], value+1);
			} else {
				map.put(data[i], 1);
			}
			
		}
		
		Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			String key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println(key + " : " + printBar('#', value) + " " + value);
		}

	}
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i<value; i++) {
			bar[i] = ch;
		}
		
		return new String(bar);
	}

}
