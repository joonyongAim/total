package 캡슐화;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("123-123-1234");
		int money=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("[1]입금 [2]출금 [3]잔액조회 [4]종료");
			int ch = sc.nextInt();
			
			if(ch == 4)
				break;
			
			switch(ch) {
				case 1:
					System.out.print("입금액을 입력받아 : ");
					money = sc.nextInt();
					account.deposit(money);
					break;
				
				case 2:
					System.out.print("출금액을 입력받아 : ");
					money = sc.nextInt();
					account.withdraw(money);
					break;
				
				case 3:
					System.out.println("잔액 : " + account.getMoney());
					break;
					
			}
		
		}

	}

}
