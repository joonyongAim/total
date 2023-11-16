package 평가;

public class MathEx {
	
	
	public int max(int[] scores) {
		int max=-1;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		return max;
	}
	
	public int min(int[] scores) {
		int min=101;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] < min) {
				min = scores[i];
			}
		}
		return min;
	}

}
