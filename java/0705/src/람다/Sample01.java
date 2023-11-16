package 람다;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Sample01 {

	public static void main(String[] args) {
		// Function이랑 같음
		UnaryOperator<Integer> uo = num -> {
			return num + 5;
		};
		
		System.out.println(uo.apply(7));
		
		// BiFunction이랑 같음
		BinaryOperator<Integer> bo = (n1, n2) -> {
			
			return n1 + n2;
		};
		
		System.out.println(bo.apply(5, 3));
		
		BiFunction<Integer, Integer, Integer> bf = (num1, num2) -> {
			return 3;
		};
		
		
		
		BiPredicate<Integer, Integer> p = (num1,num2) -> {
			return num1 > num2;
		};
		
		System.out.println(p.test(5, 3));
		
		
		BiConsumer<Integer, String> bc = (num, str) -> {
			System.out.println("전달받은 숫자 : " + num);
			System.out.println("전달받은 문자열 : " + str);
		};
		
		bc.accept(123, "abc");

	}

}
