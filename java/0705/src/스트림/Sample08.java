package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample08 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aaaa", "Bbb", "Aaa", "Bcc", "Ccc", "Cdd");
		
		Map<Character, List<String>> group
						= names.stream()
							   .collect(Collectors.groupingBy(x -> x.charAt(0)));
		
		System.out.println(group);
	}

}
