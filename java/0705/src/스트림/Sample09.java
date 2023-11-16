package 스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample09 {

	public static void main(String[] args) {

		int[] data = { 5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8 };
		
		int[] result = Arrays.stream(data) // 배열을 스트림 IntStream
							 .boxed() // Stream<Integer>
							 .filter(n -> n % 2 == 0)
							 .distinct()
							 .sorted(Comparator.reverseOrder())
							 .mapToInt(Integer::intValue) // Stream<Integer> -> IntStream으로 변환
							 .toArray(); // int[] 배열로 리턴
		for(int r : result) {
			System.out.println(r);
		}
	
	}

}

	
//		int[] data = { 5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8 };
//		
//		List<Integer> dataList = new ArrayList<>(); // 짝수만 걸러넴
//		for(int d : data) {
//			if(d % 2 == 0)
//				dataList.add(d);
//		}
//		System.out.println(dataList);
//		
//		HashSet<Integer> set = new HashSet<>(dataList); // 중복제거
//		System.out.println(set);
//		
//		List<Integer> list = new ArrayList<>(set);
//		list.sort(Comparator.reverseOrder()); // 내림차순정렬
//		System.out.println(list);
//		
//		int[] result = new int[list.size()]; // 배열 크기 설정
//		for(int i=0; i<result.length; i++) { // list -> 배열 옮김
//			result[i] = list.get(i);
//		}
		