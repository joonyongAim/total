package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class 연습4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> foodMap = new HashMap<>();
		String foodName;
		int price;
		
		while(true) {
			System.out.print("음식 이름 입력(종료:exit) : ");
			foodName = sc.nextLine();
			
			if(foodName.equalsIgnoreCase("exit"))
				break;
			
			System.out.print("음식 가격 입력 : ");
			price = sc.nextInt();
			sc.nextLine();
			
			if(foodMap.containsKey(foodName)) {
				int p = foodMap.get(foodName);
				foodMap.put(foodName, p + price);
			} else {
				foodMap.put(foodName, price);
			}
		}
		
		System.out.println("===주문 내역===");
		for(String key : foodMap.keySet()) {
			int value = foodMap.get(key);
			
			System.out.println(key + " : " + value);
		}
		System.out.println("=================");
		Iterator<String> it = foodMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			int value = foodMap.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println("=================");
		Iterator<Map.Entry<String, Integer>> eit = foodMap.entrySet().iterator();
		
		while(eit.hasNext()) {
			Map.Entry<String, Integer> entry = eit.next();
			String key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		

	}

}
