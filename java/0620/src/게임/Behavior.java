package 게임;

import java.util.Scanner;

public class Behavior {
	Character[] characters;
	int numCharacters;
	int job = 0; // character;
	Scanner sc = new Scanner(System.in);
	
	public Behavior() {
		characters = new Character[10];
	}
	public Behavior(int maxSize) {
		characters = new Character[maxSize];
	}
	
	public void makeChar() {
		while(true) {
			System.out.println("캐릭터 선택 [1] 전사 [2] 마법사 [3] 도적 [4] 드루이드 [5] 치유사");
			job = sc.nextInt();
			
			if(job == 1 || job == 2 || job == 3 || job == 4 || job == 5 )
				break;
			
			System.out.println("잘못 입력하셨습니다");
		}
		
//		// characters 배열에 입력시켜주기!
		Character d = new Character(job);
		characters[numCharacters] = d;
		numCharacters++;
	}
	
	public void removeCharacter(int index) {
		
		if(index < 0) {
			System.out.println("해당 캐릭터 없음");
			return;
		}
		
		for(int i=index; i<numCharacters; i++) {
			characters[i] = characters[i+1];
		}
		
		numCharacters--;
	}
	
	public void getAll() {
		for(int i=0; i<numCharacters; i++) {
			characters[i].charInfo();
		}
	}
	
	public void getAllJob() {
		for(int i=0; i<numCharacters; i++) {
			characters[i].jobInfo();
		}
	}
////	
////	public void potion(int hp, int mp, int numHp, int numMp) {
////		if(character == 1) {
////			hp = 100;
////			mp = 20;
////			numHp = 10;
////			numMp = 5;
////		} else if(character == 2) {
////			hp = 50;
////			mp = 100;
////			numHp = 5;
////			numMp = 10;
////		} else if(character == 3) {
////			hp = 80;
////			mp = 40;
////			numHp = 4;
////			numMp = 3;
////		} else if(character == 4) {
////			hp = 90;
////			mp = 30;
////			numHp = 7;
////			numMp = 4;
////		} else {
////			hp = 30;
////			mp = 90;
////			numHp = 6;
////			numMp = 8;
////		}
////		
////		System.out.println("포션 : " + "hp : " + hp + " mp : " + mp + numHp + numMp);
////		
////	}
////	
////	
////	public void charInfo() {
////		String[] characterType = {"전사", "마법사", "도적" , "드루이드", "치유사"};
////		System.out.println("캐릭터 : " + characterType[character-1]);
////	}
}


