package Test;

public class Test01 {

	public static void main(String[] args) {
		
		int i=1,j;
		int sum;
		int total=0;
		
		while(i<=10) {
			sum=0;
			j=1;
			while(j<=i) {
				sum = sum + j;
				j++;
				
			}
			total = total + sum;
			i++;
		}
		System.out.println("결과 : " + total);	
			
		}

	}


