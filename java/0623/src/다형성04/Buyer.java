package 다형성04;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	public void buy(Product p) {
		if(p.price > money) {
			System.out.println("비싸서 못삼");
			return;
		}
		
		money = money - p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구매하셨습니다.");
	}

}
