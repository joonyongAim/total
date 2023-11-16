package 메서드;

import java.util.Scanner;

public class Movie {
	
	int[] seat = new int[10];
	   
	   public void printSeat() {
	      for(int i=0; i<seat.length; i++) {
	         if(seat[i] == 0) {
	            System.out.print("[ ]");
	         } else {
	            System.out.print("[V]");
	         }
	      }
	      System.out.println();
	   }
	   
	   public void selectSeat() {
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("좌석 선택 : ");
	      int selSeat = sc.nextInt();
	      
	      if(seat[selSeat - 1] == 0) {
	         seat[selSeat - 1] = 1;
	      } else {
	         System.out.println("예약된 좌석입니다.");
	      }
	      
	   }
	   
	   public int totalPrice() {
	      int cnt=0;
	      for(int s : seat) {
	         if(s == 1)
	            cnt++;
	      }
	      return cnt * 12000;
	   }
	   
	}








