package 내부클래스;

public class ParentMain {

	public static void main(String[] args) {
		
		Parent anony = new Parent() {
			public void work() {
				System.out.println("익명 객체 노동중");
			}

			@Override
			public void wake() {
				System.out.println("익명 객체 10시 기상");
				work();
			}
			
		};
		
		anony.wake();

	}

}
