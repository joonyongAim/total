package CallByReference;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Person[] p = new Person[3];
		int i;
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<p.length; i++) {
			p[i] = new Person();
			System.out.print("이름 입력 : ");
			p[i].name = sc.next();
			System.out.print("국어 입력 : ");
			p[i].kor = sc.nextInt();
			System.out.print("영어 입력 : ");
			p[i].eng = sc.nextInt();
			System.out.print("수학 입력 : ");
			p[i].math = sc.nextInt();
			
			p[i].total();
			p[i].avg();
		}
		
		for(i=0; i<p.length; i++) {
			p[i].rank(p);
			
		}
		
		System.out.println("이름	국어	영어	수학	총점	평균	순위");
		for(i=0; i<p.length; i++) {
			p[i].printInfo();
		}
		
	}

}
