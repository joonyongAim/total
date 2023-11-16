package 배열;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		
		int i;
		int max;
		int min;
		int[] score = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<score.length;i++) {
			System.out.print(i+1+"번째 학생 점수 입력 : ");
			score[i] = sc.nextInt();
		}
		
		max = score[0];
		min = score[0];
		
		for(i=0;i<score.length;i++) {
			if(score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
		    }
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
			

	}

}
