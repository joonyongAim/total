package 컬렉션;

public class MenuInfo {
	
	String name;
	int price;
	boolean isTax;
	
	public MenuInfo(String name, int price, boolean isTax) {
		this.name = name;
		this.price = price;
		this.isTax = isTax;
	}
	
	public int totalPrice() {
		if(isTax) {
			return (int)(price + (price*0.1));
		} else {
			return price;
		}
		
	}
	

}
