package 메서드;

public class Cal2 {
	
	int a;
	int b;
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		if(a>b) {
			return a-b;
		} else {
			return b-a;
		}
	}
	
	public int multi(int a, int b) {
		return a*b;
	}
	
	public double div(int a, int b) {
		return (double)a / b;
	}
	
	public void showResult(int result) {
		System.out.println("결과 : " + result);
	}
	
	public void showResult(double result) {
		System.out.println("결과 : " + result);
	}

}
