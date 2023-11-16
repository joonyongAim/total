package 메서드;

public class 계산기 {
	
	public void showInfo(int a, int b, char op) {
		if(op == '+') {
			System.out.println(a + "+" + b + "=" + (a + b));
		} else if(op == '-') {
			System.out.println(a + "-" + b + "=" + (a - b));
		} else if(op == '*') {
			System.out.println(a + "*" + b + "=" + (a * b));
		} else if(op == '/') {
			System.out.println(a + "/" + b + "=" + ((double)a / b));
		} else if(op == '%') {
			System.out.println(a + "%" + b + "=" + (a % b));
		} else {
			System.out.println("연산 기호가 잘못됨");
		}
		
		
	}

}
