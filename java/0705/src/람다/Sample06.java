package 람다;

@FunctionalInterface
interface NumberOperator {
	int operate(int n1, int n2);
}

public class Sample06 {

	public static void main(String[] args) {
		
		NumberOperator add = (int a, int b) -> {
			return a + b;
		};
		int r = add.operate(10, 20);
		System.out.println("더한값 : " + r);
		
		NumberOperator sub = (int a, int b) -> {
			return a - b;
		};
		r = sub.operate(20, 10);
		System.out.println("뺀값 : " + r);
		
		NumberOperator mul = (int a, int b) -> {
			return a * b;
		};
		r = mul.operate(5, 3);
		System.out.println("곱한값 : " + r);
		
		
		
		
		

	}

}
