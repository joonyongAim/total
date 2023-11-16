package 오버라이딩;

public class Book {
	
	String title;
	String author;
	int price;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.price = 10000;
	}

//	@Override
//	public String toString() {
//		return "Book [title=" + title + ", author=" + author + "]";
//	}
	
	public void showPrice() {
		System.out.println("책이름 : " + title);
		System.out.println("가격 : " + price);
	}

}
