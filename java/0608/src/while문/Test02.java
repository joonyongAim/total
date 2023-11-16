package while문;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int i=1,a;
		int cnt=0;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한개의 정수를 입력받아 : ");
		a = sc.nextInt();
		
		while(i<=a) {
			if(i % 2 ==1) {
				sum = sum + i;
				cnt++;
			}
			i++;
			
		}
		System.out.println("합 : " + sum);
		System.out.println("개수 : " + cnt);
				

	}

}
