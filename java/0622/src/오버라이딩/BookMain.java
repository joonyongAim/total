package 오버라이딩;

public class BookMain {

	public static void main(String[] args) {
		
		Book book = new Book("Java의 정석","남궁성");
		Novel novel = new Novel("홍길동전","홍길동","무협");
		Cartoon cartoon = new Cartoon("원피스","오다 에이치로",350);
		
//		System.out.println(book.toString());
//		System.out.println(novel.toString());
		
		book.showPrice();
		novel.showPrice();
		cartoon.showPrice();
	}

}
