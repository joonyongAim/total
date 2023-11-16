package 제네릭;

class Shape {} // 부모 클래스
class Circle extends Shape {} // Shape의 자식 클래스
class Rectagle {}

class Box<T extends Shape> {
	T shape; // 무슨 도형일지는 모르지만 도형 담는 참조변수
}


public class Sample03 {

	public static void main(String[] args) {
		
		Box<Shape> box1 = new Box<>();
		Box<Circle> box2 = new Box<>();
		Box<Rectagle> box3 = new Box<>();
		Box<String> box4 = new Box<>();
		
	}

}
