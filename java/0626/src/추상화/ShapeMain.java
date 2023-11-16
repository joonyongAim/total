package 추상화;

public class ShapeMain {

	public static void main(String[] args) {
//		Shape shape = new Shape(); 안됨
		Rectangle rect = new Rectangle(5, 10);
		Shape rect2 = new Rectangle(8, 9);
		
		System.out.println("넓이 : " + rect.calcArea());
		System.out.println("넓이2 : " + rect2.calcArea());
		rect.hell0();
		rect2.hell0();

	}

}
