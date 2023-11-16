package 이차원배열;

import java.util.Arrays;

public class Sample08 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int[][] arr2 = {
				{1,2,3},
				{4,5,6}
		};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));
		
		String[] str1 = {"abc", "zxc"};
		String[] str2 = {"abc", "qwe"};
		
		System.out.println(str1[0] + " " + str2[0]);
		System.out.println(str1[0] == str2[0]);
		System.out.println(str1[0].equals(str2[0]));
		
		
		
		
		
		
	}

}
