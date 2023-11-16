package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sample05 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "zxc", "qwer");
//		list.stream().forEach(System.out::println);
		
		String str = list.stream()
						 .collect(Collectors.joining(","));
		
//		System.out.println(str);
		
		long cnt = list.stream()
					   .filter(s -> s.length()>=4)
					   .count();

		
//		System.out.println(cnt);
		
		// anyMatch : 조건에 만족하는게 하나라도 있으면 true
		List<Integer> intList = Arrays.asList(1,50,3,10,7);
		
		boolean a = intList.stream()
//						   .anyMatch(n -> n % 2 == 0)
						   .allMatch(n -> n % 2 == 0);
		
//		System.out.println(a);
		
		Optional<Integer> op = intList.stream()
									  .max(Integer::compareTo);
		
//		System.out.println(op.get());
		
		op = intList.stream()
				    .min(Integer::compareTo);

//		System.out.println(op.get());
		
		//reduce
		Optional<Integer> s = intList.stream()
									 .reduce((x, y) -> {
										 return x-y;
									 });
//							         .reduce(Integer::sum);
		
		System.out.println(s);
		
		
	}

}
