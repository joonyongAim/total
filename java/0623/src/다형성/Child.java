package 다형성;

public class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("자식 2번 메서드");
	}
	
	public void method3() {
		System.out.println("자식 3번 메서드");
	}
}
