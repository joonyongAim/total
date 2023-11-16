package 생성자;

public class ConsMain {

	public static void main(String[] args) {
		Cons c = new Cons("홍길동");
		Cons c2 = new Cons();
		Cons c3 = new Cons("복학생", 19);
		
		System.out.println(c.name);
		System.out.println(c.age);

	}

}
