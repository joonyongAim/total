package 컬렉션;

import java.util.ArrayList;
import java.util.Collections;

public class Sample02 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(10);
		
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4));
		
		System.out.println(list1);
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(list1.containsAll(list2));
		
		System.out.println(list1.retainAll(list2));
		System.out.println(list1);
		System.out.println(list2);
		
		list1.clear();
		System.out.println(list1);
		System.out.println(list1.isEmpty());
		
		
		
		

	}

}
