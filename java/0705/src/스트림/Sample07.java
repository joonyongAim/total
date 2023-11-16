package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Sample07 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		// sum 합계
		int s = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(s);
		
		//average 평균
		OptionalDouble od = list.stream()
								.mapToDouble(Integer::doubleValue)
								.average();
		System.out.println(od);
	}

}
