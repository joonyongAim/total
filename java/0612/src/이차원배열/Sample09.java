package 이차원배열;

import java.util.Arrays;

public class Sample09 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		int[] arr2 = Arrays.copyOf(arr, 4);
		int[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		System.out.println(Arrays.toString(arr3));
		
	}

}
