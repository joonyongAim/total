package 람다;

import java.util.function.BinaryOperator;

public class Sample04 {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> op;
		
		op =  (x, y) -> Calc.staticMethod(x, y);
		System.out.println("결과 : " + op.apply(5, 10));
		
		op = Calc::staticMethod;
		System.out.println("결과 : " + op.apply(5, 10));
		
		Calc calc = new Calc();
		
		op = (x, y) -> calc.method(x, y);
		System.out.println("결과 : " + op.apply(5, 10));
		
		op = calc::method;
		System.out.println("결과 : " + op.apply(5, 10));

	}

}
