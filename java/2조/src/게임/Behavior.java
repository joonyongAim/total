package 게임;

import java.util.Scanner;

public class Behavior {
	int[] a;
	Character[] cs;
	int numChar;
	String[] jobArr = {"전사", "마법사", "도적", "드루이드", "치유사"};
	
//	EnemyMap em;
	Scanner sc = new Scanner(System.in);
	public Behavior(int maxSize) {
		cs = new Character[maxSize];
	}
	public void mkChar(int job) {
		
		cs[numChar] = new Character(job);
		numChar = numChar+1;
	}
	public void mkChar(int hp, int mp) {
		cs[numChar] = new Character(hp, mp); 
		numChar = numChar+1;
	}
	
//	public void moveCharater(Character c, int x, int y) {
//		c.move(x, y);
//	}
	public void moveCharater(int index, int x, int y) {
		if(x>=0 && x<=4 && y>=0 && y<=4) {
//			cs[index].x = x;
//			cs[index].y = y;
//			Character c = cs[index];
			cs[index].move(x, y);
		}
		else {
			System.out.println("위치를 잘못 입력하셨습니다.");
		}
			
	}
	public void CharInfo(int index) {
		System.out.println("=========================");
		System.out.println(jobArr[cs[index].job-1] + "의 HP는 " + cs[index].hp + "이며, MP는 " + cs[index].mp + "입니다.");
		System.out.println(jobArr[cs[index].job-1] + "의 현재 위치는 " + cs[index].x + ", " + cs[index].y + "입니다.");
		System.out.println("=========================");
	}
	public void allCharInfo() {
//		System.out.println("0번 캐릭터 조회" + cs[0].hp);
//		System.out.println("1번 캐릭터 조회" + cs[1].hp);
		System.out.println("=========================");
		for(int i=0; i<numChar; i++) {
//			cs[i].charInfo();
			System.out.println(jobArr[cs[i].job-1]+ "의 HP는 " + cs[i].hp + "이며, MP는 " + cs[i].mp + "입니다.");
			System.out.println(jobArr[cs[i].job-1]+ "의 현재 위치는 " + cs[i].x + ", " + cs[i].y + "입니다.");
			System.out.println("=========================");
			
		}
	}
	public void allJobInfo() {
		System.out.println("=========================");
		for(int i=0; i<numChar; i++) {
			System.out.println(i + ". " + jobArr[cs[i].job-1] + "의 HP는 " + cs[i].hp + "이며, MP는 " + cs[i].mp + "입니다.");
		}
		System.out.println("=========================");
	}
	public int allJobInfo(String str) {
		int index;
		System.out.print(str + "캐릭터를 선택해주세요. : ");
		index = sc.nextInt();
		System.out.println("=========================");
		for(int i=0; i<numChar; i++) {
			System.out.println(i + ". " + jobArr[cs[i].job-1] + "의 HP는 " + cs[i].hp + "이며, MP는 " + cs[i].mp + "입니다.");
		}
		System.out.println("=========================");
		return index;
	}
	public void rmChar(int index) {
		for(int i=index; i<numChar-1; i++) {
			cs[i] = cs[i+1];
		}
			numChar--;
			System.out.println("해당 캐릭터가 삭제되었습니다.");
	} 
			
	
//	public void findCharacter(int job) {
//		for(i=0; i<jobAccounts; i++)
//			if(jobAccounts[i],)
		
//	}
//	public void findCharater()
	
}
