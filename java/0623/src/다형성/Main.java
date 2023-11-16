package 다형성;

public class Main {

	public static void main(String[] args) {
		
		Parent p = new Child();
		
		p.method1();
		p.method2();
//		p.method3();
		

	}

}
