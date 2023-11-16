package 쓰레드;

class Account {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			balance -= money;
		}
	}
}

class RunnableEx implements Runnable {
	Account account = new Account();
	
	@Override
	public void run() {
		while(account.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			account.withdraw(money);
			System.out.println("잔액 : " + account.getBalance());
		}
	}
	
}

public class Sample01 {

	public static void main(String[] args) {
		
		Runnable r = new RunnableEx();
//		Thread t1 = new Thread(r);
//		
//		Thread t2 = new Thread(new RunnableEx());
		
		new Thread(r).start();
		new Thread(r).start();
		

	}

}
