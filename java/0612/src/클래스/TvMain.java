package 클래스;

import java.util.Scanner;

public class TvMain {

	public static void main(String[] args) {
		
		Tv lgTv = new Tv();
		
		Scanner sc = new Scanner(System.in);
		
		lgTv.color = "검정색";
		lgTv.channel = 11;
		
		lgTv.showInfo();
		
		while(true) {
			
			System.out.print("1번:전원, 2번:채녈증가, 3번:채널감소");
			int n = sc.nextInt();
			if(n == 1) {
				lgTv.power();
			}else if(n == 2) {
				lgTv.channelUp();
			}else if(n == 3) {
				lgTv.channelDown();
			}
			
			lgTv.showInfo();
		}
	
	}

}
