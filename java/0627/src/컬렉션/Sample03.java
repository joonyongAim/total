package 컬렉션;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.print("점수 입력 : ");
			scores.add(sc.nextInt());
		}
		
		int sum = 0;
		double avg;
		
		for(int i=0; i<scores.size(); i++) {
			sum = sum + scores.get(i);
		}
		
		for(Integer score : scores) {
			sum += score;
		}
		avg = (double)sum / scores.size();
		
		System.out.println(sum);
		System.out.println(avg);
		
		Integer max = -1;
		Integer min = 101;
		
		for(Integer s : scores) {
			if(s>max)
				max = s;
			if(s<min)
				min = s;
		}
		
		scores.remove(max);
		scores.remove(min);
		sum = 0;
		for(Integer s : scores) {
			sum += s;
		}
		avg = sum / scores.size();
		System.out.println(avg);
		
		
		
		
		

	}

}
