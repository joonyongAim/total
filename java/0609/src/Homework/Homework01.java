package Homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		int[] rank = new int[5];
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<kor.length;i++) {
			System.out.print(i+1+"번 학생의 국어점수 입력 : ");
			kor[i] = sc.nextInt();
			
			System.out.print(i+1+"번 학생의 영어점수 입력 : ");
			eng[i] = sc.nextInt();
			
			System.out.print(i+1+"번 학생의 수학점수 입력 : ");
			math[i] = sc.nextInt();
		}
		
		for(i=0;i<sum.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (double)sum[i] / sum.length;
		}
		for(i=0;i<rank.length; i++) {
			rank[i] = 1;
			for(j=0;j<rank.length; j++) {
				if(avg[i] < avg[j]) {
					rank[i] = rank[i] + 1;
				}
			}
		}
		System.out.println("=========성적표=========");
		System.out.println("번호	국어	영어	수학	총점	평균	순위");
		for(i=0;i<kor.length;i++) {
			System.out.println(i+1+"\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + sum[i] + "\t" + avg[i] + "\t" + rank[i]);
		}
		
	} 
	

}
