package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample03 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 8, 99, 1, 2, 31, 4, 5);
		
		Stream<Integer> s = list.stream()
								.filter(n -> n % 2 == 0);
//		s.forEach(System.out::println);
		
		List<String> strList = Arrays.asList("aaaa", "bb", "qwerty");
		
		Stream<Integer> s2 = strList.stream()
									.map(String::length);
//		s2.forEach(System.out::println);
		
		s = list.stream().sorted();
		
		s.forEach(System.out::println);
		
		IntStream s3 = new Random().ints(1,5) // 난수 1~4까지 스트림 생성
									.filter(n -> n%2==1) // 홀수만
									.limit(10) // 10개만
									.sorted() // 정렬
									.distinct(); // 중복제거
		s3.forEach(System.out::println);
	}

}
