package 인터페이스;

public interface Calculator {
	
	public int add(int a, int b);
	
	public default int sub(int a, int b) {
		return a - b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}

}
