package Test;

public class Test02 {

	public static void main(String[] args) {
		
		int i=1; // 1,2,3,4 숫자
		int sum=0;
		
		while(true) {
			if(i%2 ==1) {
				sum = sum + i;
			} else {
				sum = sum - i;
			}
			if(sum >= 100) {
				break;
			}
			i++;
		}
		System.out.println("결과 : " + i);
		
		
	}

}
