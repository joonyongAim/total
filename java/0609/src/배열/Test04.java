package 배열;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int i,j;
		int[] rank = new int[5];
		int[] score = new int[5];
		
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<score.length;i++) {
			System.out.print(i+1+"번째 점수 : ");
			score[i] = sc.nextInt();
		}
		
		for(i=0;i<score.length; i++) {
			rank[i] = 1;
			for(j=0;j<score.length; j++) {
				if(score[i] < score[j]) {
					rank[i] = rank[i] + 1;
				}
			}
		}
		
		for(i=0;i<score.length; i++)
		System.out.println(i+1+"번째 : " + rank[i] + "위");	
	}

}
