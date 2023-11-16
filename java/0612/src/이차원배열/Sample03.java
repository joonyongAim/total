package 이차원배열;

public class Sample03 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int i,j;
		int num=0;
		
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				num++;
				arr[i][j] = num;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
