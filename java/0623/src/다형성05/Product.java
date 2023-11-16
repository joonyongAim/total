package 다형성05;

public class Product {
	
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = price / 10;
	}

}
