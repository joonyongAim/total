package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(i=0;i<arr.length; i++) {
			System.out.print(i+1+"번째 학생 점수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(Arrays.toString(arr));
	}

}
