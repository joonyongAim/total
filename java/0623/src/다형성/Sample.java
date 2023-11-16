package 다형성;

class A{}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class Sample {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A ab = b; // A클래스의 인스턴스의 주소값을 가지는 ab라는 참조 변수, // A클래스로 생성된 객체를 담는 변수
		A ac = c;
		A ad = d;
		A ae = e;
		
		B bd = d;
		C ce = e;
		
//		B be = e;
//		C cd = d;
		
	
	}

}
