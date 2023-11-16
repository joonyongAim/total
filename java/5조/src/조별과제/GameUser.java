package 조별과제;

import java.util.Scanner;

public class GameUser {

	GameAccount [] accounts;
	int numAccount;
	
	Scanner sc = new Scanner(System.in);
	
	public GameUser(int maxSize) {
		accounts = new GameAccount[maxSize];
	}
	
	// 계정 추가
	public void addMember(GameAccount ga) { // 계정 추가
		
		if(numAccount == accounts.length) {
			System.out.println("계정추가 불가");
			return;
		}
		accounts[numAccount] = ga;
		numAccount++;
		
		System.out.println("계정추가 완료");
	}
	
	//ID, PW 배열방 찾기
	public int findIdPw(String userId, String userPw) {
		
	   for(int i=0; i<numAccount; i++) {
		   
	      if(accounts[i].userId.equals(userId) && accounts[i].userPw.equals(userPw)) {
	         return i;
	      }
	   }
	   return -1;
	}
	   
	//닉네임 변경 메서드
	public void changeNickname(String userId, String userPw, String name) {
		
		int index = findIdPw(userId,userPw);
		if(index == -1) {
			System.out.println("Id,Pw가 틀렸습니다.");
			return;
		}
		accounts[index].name = name;
		System.out.println(name + "로 닉네임 변경 완료.");
	   }
	
	// 계정 삭제
	public void closeAccount(String userId, String userPw) {
		
		int index = findIdPw(userId, userPw);
		
		if(index == -1) {
			System.out.println("Id,Pw를 다시 입력하세요.");
			return;
		}
		
		if(index >= 0) {
			for(int i=index; i<numAccount-1; i++) {
				accounts[i] = accounts[i+1];
			}
			numAccount--;
			System.out.println("탈퇴 정상 처리.");
		}
	}
	
	//휴먼 계정 등록 설정
	public void setHumanAccount() { 
		
		 for (int i = 0; i < numAccount; i++) {
	         GameAccount gu = accounts[i];
	         
	         if (gu.humanDay >= 15) {
	            System.out.println(gu.userId + "휴면계정 전환");
	            gu.lockClear = true;
	         }
	      }
	}
	
	//휴먼 계정 해제 설정
	public void clearHumanAccount() {
	      for (int j = 0; j < numAccount; j++) {
	          GameAccount gu = accounts[j];
	          
	          if (gu.lockClear) {
	             System.out.println(gu.userId + "휴먼계정 해제");
	             gu.lockClear = false;
	             gu.humanDay = 0;
	          }
	       }
	}
	
	//전체 계정 조회
	public void getAllAccount() { 
		
		for(int i=0; i<numAccount; i++) {
			GameAccount ga = accounts[i];
			
			if(ga.lockClear) {
				System.out.println("ID : " + ga.userId + "(휴면)");
			}else {
				System.out.println("ID : " + ga.userId);
			}
			System.out.println("PW : " + ga.userPw);
			System.out.println("닉네임 : " + ga.name);
			System.out.println("미접속일 : " + ga.humanDay);
			System.out.println("====================");
		}
	}
}

