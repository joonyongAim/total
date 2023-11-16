package teamPro;

import java.util.Scanner;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//최대학생 입력
//		System.out.print("최대 등록학생 수 입력 : ");
//		Point p = new Point(sc.nextInt());
		
		//더미데이터 2개 자동입력
		System.out.println("[참고] 최대 학생 10명 더미 등록 2명 자동입력됨");
		Point p = new Point(10);
		for(int i=0;i<2;i++) {
			Student tmp = new Student();
			tmp.id = (i + 1) + "0";
			tmp.name = (i + 1) + "_name";
			p.addStu(tmp);
			p.sp[i].score = 40;
		}
		
		while(true) {
			
			System.out.print("[MENU] 1.학생등록 2.학생삭제 3.상점추가 4.벌점추가 5.학생별 점수출력 6.전체학생 점수출력 7.학생점수 순위출력 0.종료 ");
			int menu = sc.nextInt();
			
			//종료
			if(menu==0) {
				return;
			}
			
			String id="";
			switch(menu){
				case 1:	//학생등록
					
					//최대 등록 갯수 체크
					if(p.maxStu())
						break;
					
					//학생id는 중복조회
					while(true) {
						System.out.print("등록할 학생ID 입력 : ");
						id = sc.next();	
						if(p.searchStuId(id) >= 0) {
							System.out.println("이미 등록된 학생ID 입니다.");
						} else {
							break;
						}
						
					}
					
					System.out.print("등록할 학생이름 입력 : ");
					String name = sc.next();
					
					//빈 객체 선언
					Student tmp = new Student();
					tmp.id = id;
					tmp.name = name;
					p.addStu(tmp);
					break;
					
				case 2:	//학생삭제
					//최소 등록 학생 체크(0명이면 작업불가)
					if(p.minStu())
						break;
					
					System.out.print("삭제할 학생ID 입력 : ");
					id = sc.next();
					p.subStu(id);
					break;
					
				case 3:	//상점추가
					//최소 등록 학생 체크(0명이면 작업불가)
					if(p.minStu())
						break;
					
					System.out.print("상점을 부여 할 학생ID 입력 : ");
					id = sc.next();
					
					int score = 0;
					while(true) {
						System.out.print("몇점을 부여할지 입력 : ");
						score = sc.nextInt();
						Math.abs(-20);
						
						if(score > 30 ) {
							System.out.println("최대 상점은 30점입니다.");
						} else {
							break;
						}
					}
					
					p.bonusStu(id, score);
					break;
					
				case 4:	//벌점추가
					//최소 등록 학생 체크(0명이면 작업불가)
					if(p.minStu())
						break;
					
					System.out.print("벌점을 부여 할 학생ID 입력 : ");
					id = sc.next();
					
					score = 0;
					while(true) {
						System.out.print("몇점을 부여할지 입력 : ");
						score = Math.abs(sc.nextInt());
						if(score > 30 ) {
							System.out.println("최대 벌점은 30점입니다.");
						} else {
							break;
						}
					}
					
					p.minusStu(id, score);		
					break;
					
				case 5:	//학생별 점수출력
					//최소 등록 학생 체크(0명이면 작업불가)
					if(p.minStu())
						break;
					
					System.out.print("조회할 학생ID 입력 : ");
					id = sc.next();
					p.printScore(id);
					break;
					
				case 6:	//학생전체 점수출력
					p.printAllScore();
					break;
					
				case 7:	//학생점수 순위 출력
					p.printRank();
					break;
					
				default:
					System.out.println("***** 잘못선택했습니다.");
					
			}
			
			
		}
		
	}

}
