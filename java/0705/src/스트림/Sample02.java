package 스트림;

import java.util.Random;
import java.util.stream.IntStream;

public class Sample02 {

	public static void main(String[] args) {
		
//		Stream<Integer>
		IntStream is = new Random().ints(1, 11).limit(5);
//		is.forEach(System.out::println);
		
		is = IntStream.rangeClosed(1, 10);
//		is.forEach(System.out::println);
		
		is = IntStream.iterate(0, n -> n + 2).limit(5);
//		is.forEach(System.out::println);
		
		is = IntStream.generate(() -> 5).limit(5);
		is.forEach(System.out::println);

	}

}
