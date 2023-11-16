package 배열;

import java.util.Arrays;

public class Sample05 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		int i,j;
		
		for(i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(j=i-1; j>=0; j--) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));

	}

}
