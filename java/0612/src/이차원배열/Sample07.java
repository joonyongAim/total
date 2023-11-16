package 이차원배열;

public class Sample07 {

	public static void main(String[] args) {
		
		 int[][] arr = new int[5][5];
         int i, j; // 단순 반복용 변수
         int x = 0, y = -1; // x:행 y:열 
         int s = 1; // 증가,감소
         int cnt = 5; // 하나의 행이나 열에 숫자를 넣는 반복 횟수
         int num = 1;

         for(i=5; i>0; i--){

             for(j=0; j<cnt; j++){ // 열 증가,감소 반복문
                 y = y + s;
                 arr[x][y] = num;
                 num++;
             }

             cnt--;

             for(j=0; j<cnt; j++){ // 행 증가,감소 반복문
                 x = x + s;
                 arr[x][y] = num;
                 num++;
             }
             s = s * -1;
         }

         for(i=0; i<5; i++){
             for(j=0; j<5; j++){
                 System.out.printf("%3d", arr[i][j]);
             }
             System.out.println();
         }
     

  }

}