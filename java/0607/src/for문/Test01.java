package for문;

public class Test01 {

	public static void main(String[] args) {
		
		int i;
		int sum1=0;
		int sum2=0;
		
		
		for(i=1;i<=100;i++) {
			if(i % 2 ==0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
		
	}	
		
		System.out.println("1부터 100까지 짝수들의 합계 : " + sum1);
		System.out.println("1부터 100까지 홀수들의 합계 : " + sum2);
	}

}
