package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample01 {

	public static void main(String[] args) {
		
		String[] strArr = { "fff", "ddd", "aaa", "bbb", "ccc" };
		List<String> strList = Arrays.asList(strArr);
		
		Stream<String> s1 = Arrays.stream(strArr);
		Stream<String> s2 = strList.stream();
		
		s1.sorted().forEach(System.out::println);
		System.out.println("--------");
		s2.sorted().forEach(System.out::println);
	}

}
