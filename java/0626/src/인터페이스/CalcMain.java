package 인터페이스;

public class CalcMain {

	public static void main(String[] args) {
		NormalCalc c = new NormalCalc();
		
		System.out.println(c.add(5, 10));
		System.out.println(c.sub(20, 10));
		System.out.println(Calculator.mul(5, 3));

	}

}
