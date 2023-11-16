package for문;

public class Test04 {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
		int cnt=0;
		
		for(i=1;i<=100;i++) {
			if(i % 3 ==0 && i % 2 !=0) {
				sum =sum + i;
				System.out.print(i + " ");
				cnt++;
			}
		
		}
		
		System.out.println();
		System.out.println("개수 : " + cnt);
		System.out.println("합계 : " + sum);
		
	}

}
