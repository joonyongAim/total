package 변수;

public class Sample01 {

	public static void main(String[] args) {
		
		int a = 10; // a변수를 10으로 초기화
		double b = 3.14;
		char c = 'A';
		String d = "hello";
		boolean e = true;
		
		System.out.printf("a에 저장된 값 : %5d입니다.\n", a);
		System.out.printf("b에 저장된 값 : %.1f입니다.\n", b);
		System.out.printf("c에 저장된 값 : %c입니다.\n", c);
		System.out.printf("d에 저장된 값 : %s입니다.\n", d);
		System.out.printf("e에 저장된 값 : %b입니다.\n", e);
		
		System.out.println("------------------------------");
		
		System.out.println("a에 저장된 값 : " + a + "입니다.");
		System.out.println("b에 저장된 값 : " + b + "입니다.");
		System.out.println("c에 저장된 값 : " + c + "입니다.");
		System.out.println("d에 저장된 값 : " + d + "입니다.");
		System.out.println("e에 저장된 값 : " + e + "입니다.");
		

	}

}
