package static메서드;

public class StaticMethod {
	
	static int x;
	
	public static void method(int a) {
		x = x + a;
		System.out.println("출력 : " + x);
	}

}
