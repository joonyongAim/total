package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> oddlist = new ArrayList<>();
		ArrayList<Integer> evenlist = new ArrayList<>();
		
		while(true) {
			System.out.print("숫자 입력 (종료 : 0) => ");
			int num = sc.nextInt();
			
			if(num == 0)
				break;
			
			list.add(num);
		}
		
		for(Integer n : list) {
			if(n % 2 == 0)
				evenlist.add(n);
			else
				oddlist.add(n);
		}
		
		int sum1=0,sum2=0;
		double avg1,avg2;
		
		for(Integer n : oddlist) {
			sum1 += n;
		}
		for(Integer n : evenlist) {
			sum2 += n;
		}
		avg1 = (double)sum1 / oddlist.size();
		avg2 = (double)sum2 / oddlist.size();
		
		
		
		
		
	}

}
