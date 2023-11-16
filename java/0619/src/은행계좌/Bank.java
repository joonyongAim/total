package 은행계좌;

public class Bank {
	
	BankAccount [] accounts;
	int numAccounts;
	
	public Bank(int maxSize) {
		accounts = new BankAccount[maxSize];
		numAccounts = 0;
	}
	
	public void createAccount(BankAccount a) {
		accounts[numAccounts] = a;
		numAccounts++;
		
	}
	
	public int findAccountNumber(int accountNumber) {
		for(int i=0; i<numAccounts; i++) {
			if(accounts[i].accountNumber == accountNumber) {
				return i;
			}
		}
		return -1;
	}
	
	public void closeAccount(int accountNumber) {
		int index = findAccountNumber(accountNumber);
		
		if(index == -1) {
			System.out.println("해당 계좌는 없음");
			return;
		}
		for(int i=index; i<numAccounts-1; i++) {
			accounts[i] = accounts[i+1];
		}
		numAccounts--;
	}
	
	public void deposit(int accountNumber, int money) {
		int index = findAccountNumber(accountNumber);
		
		accounts[index].deposit(money);
		
		System.out.println("입금 후 잔액 : " + accounts[index].money);
		
	}
	
	public void withdraw(int accountNumber, int money) {
		int index = findAccountNumber(accountNumber);
		
		accounts[index].withdraw(money);
		
		System.out.println("출금 후 잔액 : " + accounts[index].money);
	
	}
	
	public void getAccountInfo(int accountNumber) {
		int index = findAccountNumber(accountNumber);
		
		if(index == -1) {
			System.out.println("해당 계좌 존재하지 않음");
			return;
			
		}
		
		System.out.println("계좌번호 : " + accounts[index].accountNumber);
		System.out.println("예금주명 : " + accounts[index].ownerName);
		System.out.println("잔액 : " + accounts[index].money);
	}
	
	public void getAllAccounts() {
		if(numAccounts == 0) {
			System.out.println("등록된 계좌가 없다");
			return;
		}
		
		for(int i=0; i<numAccounts; i++) {
			System.out.println("계좌번호 : " + accounts[i].accountNumber);
			System.out.println("예금주명 : " + accounts[i].ownerName);
			System.out.println("잔액 : " + accounts[i].money);
		}
		
	}

}
