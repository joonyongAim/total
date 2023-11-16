package 메서드;

import java.util.Scanner;

public class MovieMain2 {

	public static void main(String[] args) {
		Movie m = new Movie();
	      Scanner sc = new Scanner(System.in);
	      int menu;
	      
	      while(true) {
	         System.out.print("[1]예약하기 [2]종료하기");
	         menu = sc.nextInt();
	         
	         if(menu == 2) {
	            System.out.println("총 결제 금액 : " + m.totalPrice());
	            break;
	         }
	         
	         m.printSeat();
	         m.selectSeat();
	         m.printSeat();
	      }
	      
	      

	   }

	}





