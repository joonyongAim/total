package if연습;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		int a,b,c;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학점수를 입력받아 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		avg = (a + b + c) / 3.0;
		
		
		
		if(avg >= 70) { 
			if(a < 60 || b < 60 || c < 60) {
				System.out.println("과락"); 
			} else {
				System.out.println("합격");
			}
			
		} else {
			System.out.println("불합격");
		}
			
		

	}

}
