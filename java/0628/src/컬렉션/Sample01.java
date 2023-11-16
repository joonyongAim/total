package 컬렉션;

import java.util.ArrayList;
import java.util.LinkedList;

public class Sample01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(i);
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 소요 시간 : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(i);
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 소요 시간 : " + (endTime - startTime) + "ns");

	}

}
