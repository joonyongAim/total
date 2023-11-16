package 캡슐화;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
//		p1.name = "홍길동";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		p1.setAge(age);
		
//		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		// 1. age를 출력
		int a = p1.getAge();
		System.out.println(a);
		// 2. age랑 name도 출력
		// 3. age들의 합계를 계산해서 출력
		int sum = p1.getAge() + p2.getAge() + p3.getAge();
	}

}
