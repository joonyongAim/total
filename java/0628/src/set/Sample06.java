package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Sample06 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(1);	nums.add(2);	nums.add(4);
		nums.add(3);	nums.add(1);	nums.add(2);
		nums.add(5);	nums.add(6);	nums.add(8);
		
		System.out.println("중복 제거 전 : " + nums);
		
		HashSet<Integer> set = new HashSet<>();
		
		Iterator<Integer> it = nums.iterator();
		while(it.hasNext()) {
			int number = it.next();
			if(!set.add(number)) {
				it.remove();
			}
		}
		
		System.out.println("중복 제거 후 : " + nums);
	
	}

}
