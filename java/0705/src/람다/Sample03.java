package 람다;

import java.util.function.Function;

public class Sample03 {

	public static void main(String[] args) {
		
		
		
		
		Function<String, Integer> f1 = (s) -> {
			return Integer.parseInt(s);
		};
		Function<String, Integer> f2 = Integer::parseInt;
		
		System.out.println(f2.apply("12345") + 10);

	}

}
