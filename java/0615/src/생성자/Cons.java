package 생성자;
// 고등학교 2학년 2반 학생
public class Cons {
	
	String name;
	int age;
	
	public Cons() {
		
	}
	
	public Cons(String name)  {
		System.out.println("학생을 추가합니다.");
		this.name = name;
		this.age = 18;
	}
	
	public Cons(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
}
