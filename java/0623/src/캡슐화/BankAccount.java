package 캡슐화;

public class BankAccount {
	
	private String accountNumber;
	private int money;
	
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.money = 0;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void deposit(int money) {
		if(money <= 0) {
			System.out.println("입금 못함");
		}else {
			System.out.println(money + "원 입금 했습니다");
			this.money += money;
		}
	}
	
	public void withdraw(int money) {
		if(money > 0 && this.money >= money) {
			this.money -= money;
			System.out.println(money + "원 출금 했습니다");
		}else {
			System.out.println("출금 못함");
		}
	}
	
	

}
