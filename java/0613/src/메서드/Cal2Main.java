package 메서드;

public class Cal2Main {

	public static void main(String[] args) {
		
		Cal2 c = new Cal2();
		int a = 10, b = 20;
		int result;
		double result2;
		
		result = c.add(a, b);
		c.showResult(result);
		
		result = c.sub(a, b);
		c.showResult(result);
		
		result = c.multi(a, b);
		c.showResult(result);
		
		result2 = c.div(a, b);
		c.showResult(result2);
		
		c.a = 1;
		c.b = 5;
		
		System.out.println("============");
		System.out.println(c.add(a, b));
		
		
		

	}

}
