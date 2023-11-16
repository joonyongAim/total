package 메서드;

public class Cal {
	
	public void hello() {
		System.out.println("계산기 프로그램입니다");
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sub(int a, int b ) {
		if(a>b) {
			System.out.println(a-b);
		}else {
			System.out.println(b-a);
		}
	}
	
	public void multi(int a, int b ) {
		System.out.println(a*b);
	}
	
	public void div(int a, int b ) {
		System.out.println((double)a/b);
	}
}
