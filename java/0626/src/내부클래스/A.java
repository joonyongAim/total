package 내부클래스;

public class A {
	
	int method() {
		class D {
			int a;
//			static int b; 안됨
			D() {
				System.out.println("D클래스 생성자");
			}
			void method1() {
				System.out.println("D클래스 메서드");
			}
//			static void method2() {} 안됨
		}
		
		D d = new D();
		d.a = 10;
		d.method1();
		
		return d.a;
	}
	
	static class C {
		int a;
		static int b;
		C() {
			System.out.println("C클래스 생성자");
		}
		void method1() {
			System.out.println("C클래스 메서드");
		}
		static void method2() {
			System.out.println("C클래스 static메서드");
		}
	}
	
	
	
	
	class B {
		int a;
//		static int b; 안됨
		B() {
			System.out.println("B클래스 생성자");
		}
		void method1() {
			System.out.println("B클래스 메서드");
		}
//		static void method2() {} 안됨
	}
}
