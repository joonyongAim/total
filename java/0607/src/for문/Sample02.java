package for문;

public class Sample02 {

	public static void main(String[] args) {
		
		int i,j;
		
		for(i=1; i<=9; i++) {
			for(j=2; j<=5; j++) {
				System.out.print(j + "*" + i + "=" + i*j + " ");
			}
			System.out.println();
			
		}	
	}

}
