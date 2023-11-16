package 오버라이딩;

public class Novel extends Book{
	String genre;
	
	public Novel(String title, String author, String genre) {
		super(title,author);
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Novel [genre=" + genre + ", title=" + title + ", author=" + author + "]";
	}
	
	public void showPrice() {
		System.out.println("책이름 : " + title);
		System.out.println("가격 : " + (int)(price - (price)*0.1));
	}

}
