package 다형성05;

public class BuyMain {

	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		buyer.buy(new Computer());
		
		buyer.summary();

	}

}
