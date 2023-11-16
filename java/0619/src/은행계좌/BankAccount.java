package 은행계좌;

public class BankAccount {
	int accountNumber;
	String ownerName;
	int money;
	
	public BankAccount(int accountNumber, String ownerName, int money) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.money = money;
	}
	
	public int getaccountNumber() {
		return accountNumber;
	}
	
	public String getownerName() {
		return ownerName;
	}
	
	public int getmoney() {
		return money;
	}
	

	public void deposit(int money) {
		this.money += money;
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}

}
