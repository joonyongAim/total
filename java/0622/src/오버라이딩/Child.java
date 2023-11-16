package 오버라이딩;

public class Child extends Parent {

	@Override
	public void showInfo(int age) {
		
		System.out.println("자식 나이 : " + age + "살입니다.");
	}
	
	

}
