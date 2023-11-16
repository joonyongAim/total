package 변수;

public class Swap {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		int temp;
		
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		System.out.println("x와 y 스왑 후");
		// x값과 y값을 교환할거임
		temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x); 
		System.out.println("y : " + y);
		
		

	}

}
