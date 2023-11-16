package 이차원배열;

public class Sample05 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int i,j;
		int num=0;
		
		for(i=0;i<5;i++) {
			for(j=4-i;j<5;j++) {
				num++;
				arr[i][j] = num;
			}	
		}
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(arr[i][j] == 0) {
					System.out.print("   ");
				}else {
					System.out.printf("%3d",arr[i][j]);
				}
			}
			System.out.println();
		}
			
	}

}
