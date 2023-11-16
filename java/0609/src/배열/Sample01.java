package 배열;

public class Sample01 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		int i;
		
		for(i=0; i<5; i++) {
			sum = sum + arr[i];
		}
	
		System.out.println("합계 : " + sum);
	
	} 
	
}
