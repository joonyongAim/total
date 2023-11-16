package 복습;

import java.util.Random;
import java.util.stream.IntStream;

public class Lotto {

	public static void main(String[] args) {
		
		IntStream lotto = new Random().ints(1,46)
									  .distinct()
									  .limit(6)
									  .sorted();
		lotto.forEach( n -> {
			System.out.print(n + " ");
		});

	}

}
