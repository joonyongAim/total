package CallByReference;

import java.util.Arrays;
import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		int count;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수를 입력받아 : ");
		count = sc.nextInt();
		
		int[] score = new int[count];
		
		int i;
		
		for(i=0;i<score.length;i++) {
			System.out.print("점수 : ");
			score[i] = sc.nextInt();
		}
		
		int[] sortResult = c.scoreSort(score);
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(sortResult));
		
		
		System.out.println("합계 : " + c.sum(score));
		System.out.println("평균 : " + c.avg(score, count));
		System.out.println("최대값 : " + c.max(score));
		System.out.println("최소값 : " + c.min(score));
		

	}

}
