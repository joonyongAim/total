package 게임;

import java.util.Scanner;

public class Character {
	
	int hp,mp;
	int numHp,numMp;
	int job; // character;
	
	Scanner sc = new Scanner(System.in);
	
	public Character(int job) {
		this.job = job;
		if(job == 1) {
			hp = 100;
			mp = 20;
			numHp = 10;
			numMp = 5;
		} else if(job == 2) {
			hp = 50;
			mp = 100;
			numHp = 5;
			numMp = 10;
		} else if(job == 3) {
			hp = 80;
			mp = 40;
			numHp = 4;
			numMp = 3;
		} else if(job == 4) {
			hp = 90;
			mp = 30;
			numHp = 7;
			numMp = 4;
		} else {
			hp = 30;
			mp = 90;
			numHp = 6;
			numMp = 8;
		}
		
	}
	
	
	public void charInfo() {
		String[] characterType = {"전사", "마법사", "도적" , "드루이드", "치유사"};
		System.out.println("캐릭터 : " + characterType[job-1]);
		System.out.println("포션" + "\n" + "HP : " + hp + "\n" + "MP : "  + mp + "\n"+ "HP수량 : " + numHp + "\n" + "MP수량 : " + numMp);
	}
	
		public void jobInfo() {
			String[] characterType = {"전사", "마법사", "도적" , "드루이드", "치유사"};
			System.out.println("캐릭터 : " + characterType[job-1]);
		}
//		String[] characterType = {"전사", "마법사", "도적" , "드루이드", "치유사"};
//		System.out.println("캐릭터 : " + characterType[job-1]);
	
//	public void makeChar(int character) {
//		this.character = character;
//	}
//
//	
//	public void potion(int hp, int mp, int numHp, int numMp) {
//		if(character == 1) {
//			hp = 100;
//			mp = 20;
//			numHp = 10;
//			numMp = 5;
//		} else if(character == 2) {
//			hp = 50;
//			mp = 100;
//			numHp = 5;
//			numMp = 10;
//		} else if(character == 3) {
//			hp = 80;
//			mp = 40;
//			numHp = 4;
//			numMp = 3;
//		} else if(character == 4) {
//			hp = 90;
//			mp = 30;
//			numHp = 7;
//			numMp = 4;
//		} else {
//			hp = 30;
//			mp = 90;
//			numHp = 6;
//			numMp = 8;
//		}
//		
//	}
	

}
