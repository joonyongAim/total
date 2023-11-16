package CallByReference;

import java.util.Arrays;

public class Calc {
	
	public int[] scoreSort(int[] score) {
		
		int i,j,t;
		int[] copy = Arrays.copyOf(score, score.length);
		
		for(i=0; i<copy.length; i++) {
			for(j=i+1; j<copy.length; j++) {
				if(copy[i] < copy[j]) {
					t = copy[i];
					copy[i] = copy[j];
					copy[j] = t;
				}
			}
		}
		
		return copy;
	}
	
	
	public int sum(int[] score) {	
		
		int sum = 0;
		int i;
		
		for(i=0; i<score.length; i++) {
			sum = sum + score[i];
		}
		
		return sum;
	}
	
	public double avg(int[] score, int cnt) {
		
		int sum = sum(score);
		
		return (double)sum / cnt;
	}
	
	public int max(int[] score) {
		int i;
		int max = -1;
		
		for(i=0; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		
		return max;
	}
	
	public int min(int[] score) {
		int i;
		int min = 101;
		
		for(i=0; i<score.length; i++) {
			if(score[i] < min) {
				min = score[i];
			}
		}
		
		return min;
	}
	
		
}
	
		
		
		

	
		
		
	

