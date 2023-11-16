package 은행계좌;

import java.util.Scanner;

public class BMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("최대 정원 : ");
		Bank b = new Bank(sc.nextInt());
		
		while(true) {
			System.out.println("1.계좌생성 2.계좌삭제 3.입금 4.출금 5.계좌조회 6.전체계좌 조회 0. 종료");
			int choice = sc.nextInt();
			
			if(choice == 0) {
				break;
			}
			
			switch(choice) {
				case 1:
					System.out.print("계좌번호 : ");
					int accountNumber = sc.nextInt();
					System.out.print("예금주명 : ");
					String ownerName = sc.next();
					System.out.print("잔액 : ");
					int money = sc.nextInt();
					
					BankAccount a = new BankAccount(accountNumber, ownerName, money);
					b.createAccount(a);
					
					break;
					
				case 2:
					System.out.println("삭제할 계좌번호 입력 : ");
					accountNumber = sc.nextInt();
					
					b.closeAccount(accountNumber);
					break;
					
				case 3:
					System.out.println("입금 계좌 입력 : ");
					accountNumber = sc.nextInt();
					System.out.println("입금 금액 : ");
					money = sc.nextInt();
					b.deposit(accountNumber, money);
					
					break;
					
				case 4:
					System.out.println("출금 계좌 입력 : ");
					accountNumber = sc.nextInt();
					System.out.println("출금 금액 : ");
					money = sc.nextInt();
					b.withdraw(accountNumber, money);
					
					break;
					
				case 5:
					System.out.println("조회할 계좌번호 입력 : ");
					accountNumber = sc.nextInt();
					b.getAccountInfo(accountNumber);
					
					break;
				
				case 6:
					System.out.println("===전체 계좌 조회===" );
					 b.getAllAccounts();
					 
					 break;
			}
					
		}

	}

}
