package 람다;

import java.util.ArrayList;
import java.util.HashMap;

public class Sample02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) 
			list.add(i);
		
		list.forEach((num) -> {
			System.out.println("반복중임");
			System.out.println(num);
		});
		
		list.removeIf(num -> num % 2 == 0);
		System.out.println(list);
		
		list.replaceAll(num -> {
			return num * 10;
		});
		System.out.println(list);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", 100);
		map.put("고길동", 110);
		map.put("abc", 50);
		
		map.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
		

	}

}
