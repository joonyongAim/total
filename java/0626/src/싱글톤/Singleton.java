package 싱글톤;

public class Singleton {
	
	String name;
	int no;
	static int a =5;
	
	private static Singleton singLeton = new Singleton();
	
	private Singleton() {
		name = "홍길동";
		no = 10;
	}
	
	public static Singleton getInstance() {
		return singLeton;
	}

}
