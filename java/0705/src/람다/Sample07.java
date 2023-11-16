package 람다;

@FunctionalInterface
interface Calcc {
	void maxMin(int[] arr);
}

public class Sample07 {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 3, 7, 6, 11 };
		
		Calcc c = (a) -> {
			int max = a[0];
			int min = a[0];
			
			for(int i=1; i<a.length; i++) {
				if(a[i] > max)
					max = a[i];
				if(a[i] < min)
					min = a[i];
			}
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);
		};
		
		c.maxMin(arr);

	}

}
