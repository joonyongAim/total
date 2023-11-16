package 배열;

public class Test01 {

	public static void main(String[] args) {
		
		int[] score = {100,88,100,100,90} ;
		int i,sum=0;
		
		
		
		for(i=0;i<score.length;i++) {
			sum = sum + score[i];
			
			
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / score.length );
		
		

	}

}
