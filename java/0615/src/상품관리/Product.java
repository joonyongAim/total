package 상품관리;
// 상품 하나의 정보를 담는 클래스
public class Product {
	
	String productId;
	String name;
	int price;
	int stock;
	
	public Product(String productId, String name, int price, int stock) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getProductId() {
		return productId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
	// 상품이 판매되면 재고를 감소시키는 메서드
	public void sell(int stock) {
		if(stock > this.stock) {
			System.out.println("재고 부족");
		} else {
			this.stock = this.stock - stock;
			System.out.println("상품 판매 완료");
			System.out.println("상품명 : " + this.name);
			System.out.println("판매 수량 : " + stock);
			System.out.println("판매 금액 : " + stock * this.price);
			System.out.println("재고 : " + this.stock);
		}
	}
}
