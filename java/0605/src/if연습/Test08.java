package if연습;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		 int h, m;
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("알람 설정 시간 입력 : ");
	      h = sc.nextInt();
	      System.out.print("알람 설정 분 입력 : ");
	      m = sc.nextInt();
	      
	      m = m - 45; // 양수면 걍 냅둠, 음수면 60더해야함
	      
	      if(m < 0) {
	         m = m + 60;
	         h--;
	      }
	      if(h < 0) {
	         h = 23;
	      }
	      
	      System.out.println("알람 설정시간 : " + h + "시" + m + "분");

	   }

	}






