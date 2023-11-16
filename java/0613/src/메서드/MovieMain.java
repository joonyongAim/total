package 메서드;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		
		int[] seat = new int[5];   // 0은 빈좌석 1은 예약좌석
	      int price; // 총 가격
	      int cnt=0; // 예약한 좌석 수
	      
	      Scanner sc = new Scanner(System.in);
	      
	      while(true) {
	         System.out.print("[1]예약하기 [2]종료하기");
	         int menu = sc.nextInt();
	         
	         if(menu == 2) {
	            System.out.println("총 금액 : " + cnt * 12000);
	            break;
	         } else if(menu != 1) {
	            System.out.println("잘못 입력함");
	            continue;
	         }
	         
	         if(cnt == 5) {
	            System.out.println("만석입니다");
	            System.out.println("총 금액 : " + cnt * 12000);
	            break;
	         }
	         
	         for(int i=0; i<seat.length; i++) {
	            if(seat[i] == 0) {
	               System.out.print("[ ]");
	            } else {
	               System.out.print("[V]");
	            }
	         }
	         System.out.println();
	         
	         System.out.print("좌석 선택 : ");
	         int selectSeat = sc.nextInt();
	         
	         if(seat[selectSeat - 1] == 1) {
	            System.out.println("이미 예약된 좌석");
	         } else {
	            seat[selectSeat - 1] = 1;
	            cnt++;
	         }
	         
	      }
	      
	      
	      
	      

	   }

	}






	
		
		