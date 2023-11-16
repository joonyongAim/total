package 오버라이딩;

public class Cartoon extends Book {
	
	int page;
	
	public Cartoon(String title, String author, int page) {
		super(title, author);
		this.page = page;
	}
	
	public void showPrice() {
		System.out.println("책이름 : " + title);
		System.out.println("가격 : " + (int)(price - (price)*0.2));
	}
}
