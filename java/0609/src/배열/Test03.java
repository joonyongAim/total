package 배열;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		
		int[] arr = {70, 30, 50, 90, 60};
		int i,j;
		int tmp;
		
		for(i=0; i<arr.length; i++) {
			for(j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
			
		System.out.println(Arrays.toString(arr));
	}

}
