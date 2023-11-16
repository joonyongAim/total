package 오버라이딩;

import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog("밤비","브리티");
		Cat cat = new Cat("나비","검정색");
		
		dog.showBreed();
		cat.showColor();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("강아지 나이 입력 : ");
//		dog.setAge(sc.nextInt());
//		
//		System.out.print("고양이 나이 입력 : ");
//		cat.setAge(sc.nextInt());
//		
//		System.out.println(dog.age);
//		System.out.println(cat.age);
//		
		System.out.println("강아지 나이" + dog.age + "는 사람나이로 " + dog.getAge() + "입니다.");

	}

}
