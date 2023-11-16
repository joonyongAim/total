package 평가;

public class Mon2 {

	public static void main(String[] args) {
		
		int[] scores = {90,80,67,100,76,56,78,88,95};
		
		MathEx m = new MathEx();
		int max = m.max(scores);
		int min = m.min(scores);
		
		
		System.out.println("[실행 결과]\n");
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

	}

}
