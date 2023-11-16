package 조별과제;

import java.util.Random;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		int r = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("계정 생성 : ");
		GameUser gu = new GameUser(sc.nextInt());
		
		while(true) {
			
			System.out.print("[1]계정 추가, [2]닉네임 변경, [3]계정 삭제, [4]휴면계정 등록, [5]휴면계정 해제, [6]전체회원 조회 [0]종료 : ");
			int choice = sc.nextInt();
			
			if(choice == 0) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			
			switch(choice) {
			
			case 1:
				
			    for (int i = 0; i < gu.accounts.length; i++) {
			    	r = new Random().nextInt(10) + 10; // 10부터 20사이의 임의정수 출력
			    }
			    
				System.out.print("아이디 입력 : ");
				String userId = sc.next();
				System.out.print("비밀번호 입력 : ");
				String userPw = sc.next();
				System.out.print("닉네임 입력 : ");
				String name = sc.next();
				System.out.println("미접속 일 : " + r); // 15일 이상이면 휴먼계정
				int humanDay = r;
				System.out.print("출생년도 입력 : ");
				int birthDate = sc.nextInt();
				if(2023-birthDate < 18) {
					System.out.println("가입 연령이 아닙니다.");
					break;
				}
				
				GameAccount ga = new GameAccount(userId, userPw, name, humanDay, birthDate);
				gu.addMember(ga);
				break;
				
			case 2:
				System.out.println("닉네임 변경할 Id, Pw를 입력하세요 :");
				System.out.print("Id : ");
				userId = sc.next();
				System.out.print("Pw : ");
				userPw = sc.next();
				System.out.print("변경 할 닉네임 : ");
				name = sc.next();
				gu.changeNickname(userId, userPw, name);
				break;
				
			case 3:
				System.out.println("삭제 할 Id, PW를 입력하세요.");
				System.out.print("Id : ");
				userId = sc.next();
				System.out.print("Pw : ");
				userPw = sc.next();
				gu.closeAccount(userId, userPw);
				break;
				
			case 4:
				gu.setHumanAccount();
				break;
				
			case 5:
				gu.clearHumanAccount();
				break;
			
			case 6:
				gu.getAllAccount();
				break;
			}
		}
	}

}
