package 쓰레드;

public class Sample03 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("첫번째 반복문 소요시간 : " + (endTime - startTime));
		
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
		
		endTime = System.currentTimeMillis();
		System.out.print("전체 반복문 소요시간 : " + (endTime - startTime));

	}

}
