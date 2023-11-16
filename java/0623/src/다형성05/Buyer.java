package 다형성05;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[10];
	int cnt = 0; // 장바구니에 들어간 제품 수
	
	public void buy(Product p) {
		if(p.price > money) {
			System.out.println("비싸서 못삼");
			return;
		}
		
		money = money - p.price;
		bonusPoint += p.bonusPoint;
		cart[cnt] = p;
		cnt++;
		System.out.println(p + "를 구매하셨습니다.");
	}
	
	public void summary() {
		int sum = 0;
		String itemList = "";
		
	
		
		for(int i=0; i<cnt; i++) {
			sum = sum + cart[i].price;
			itemList = itemList + cart[i] + ", ";
			
		
			
			
			
		}
		
		System.out.println("총 구매금액 : " + sum);
		System.out.println("총 구매목록 : " + itemList);
	}

}
