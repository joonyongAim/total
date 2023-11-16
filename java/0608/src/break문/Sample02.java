package break문;

public class Sample02 {

	public static void main(String[] args) {
		
		while(true) {
			
			for(int i=1; i<=5; i++) {
				System.out.println(i);
				if(i==3)
					break;
			}
		}

	}

}
