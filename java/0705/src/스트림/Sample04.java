package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample04 {

	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
					Arrays.asList(1, 2, 3),
					Arrays.asList(4, 5, 6),
					Arrays.asList(7, 8, 9)
				);
		
		List<Integer> list = numbers.stream()
									.flatMap(List::stream)
									.collect(Collectors.toList());
		
//		System.out.println(list);
		
		Stream<Integer> s = list.stream().skip(5);
		
		s.forEach(System.out::println);
		
		s = list.stream().peek(n -> {
			System.out.println(n + 10);
		});
		
		s.forEach(System.out::println);

	}

}
