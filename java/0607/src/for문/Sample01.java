package for문;

public class Sample01 {

	public static void main(String[] args) {
		
		int i;
		
		for(i=0; i<10; i+=3) {
			System.out.println(i);
		}

		System.out.println("반복 탈출 후 : " + i);
		
	}

}
