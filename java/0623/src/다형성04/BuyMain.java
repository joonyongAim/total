package 다형성04;

public class BuyMain {

	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		
		System.out.println("잔액 : " + buyer.money);
		System.out.println("적립금 : " + buyer.bonusPoint);

	}

}
