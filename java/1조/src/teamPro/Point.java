package teamPro;

public class Point {

	Student[] sp;	//등록할 수 있는 학생 배열
	int stuCount;	//등록된 학생수
	
	//maxCnt : 최대 등록 가능한 학생수
	public Point(int maxCnt) {
		sp = new Student[maxCnt];
		stuCount = 0;
	}
	
	//최대 학생 체크
	public boolean maxStu() {
		if(stuCount == sp.length) {
			System.out.println("*****더 이상 등록 불가*****");
			return true;
		}
		return false;
	}
	
	//최소 학생 체크
	public boolean minStu() {
		if(stuCount == 0) {
			System.out.println("*****등록된 학생이 없습니다.*****");
			return true;
		}
		return false;
	}
		
//	학생등록메서드 addStu() void,   --장은선
	public void addStu(Student s) {
		sp[stuCount] = new Student(s);
		stuCount++;
		System.out.println("*****학생 등록 완료 : 등록된 학생수 : " + stuCount);
	}
	
//	학생삭제메서드 subStu()   --장은선
	public void subStu(String id) {
		
		int index = searchStuId(id);
		if(index < 0) {
			System.out.println("*****[" + id + "]는 없는 학생입니다.");
			return;
		}
		//삭제된 학생자리부터 뒤에 배열 이동
		for(int i=index;i<stuCount-1;i++) {
			sp[i] = sp[i+1]; 
		}
		stuCount--;
		System.out.println("*****해당 번호의 학생이 삭제 되었습니다*****");
	}
	
	//학생배열 index 가져오기(index 는 0이상이 사용가능함)
	public int searchStuId(String id) {
		//등록된 학생이 하나도 없으면 가져올 index가 없음
		if(stuCount==0) {
			return -1;
		}
		
		//sp(등록된 학생들)의 id를 비교해서 같은 값이 있으면 i 리턴
		for(int i=0;i<stuCount;i++) {
			if(sp[i].id.equalsIgnoreCase(id)) {
				return i;
			}
		}
		//for문에서 찾은 값이 없음
		return -1;
	}
	
//	학생상점메서드 bonusStu()   --장성현
	public void bonusStu(String id, int score) {
		int index = searchStuId(id);
		if(index < 0) {
			System.out.println("*****[" + id + "]는 없는 학생입니다.");
			return;
		}
		
		System.out.println("상점 전 점수 : " + sp[index].getScore() + "점");
		sp[index].bPoint(score);
		System.out.println("상점 후 점수 : " + sp[index].getScore() + "점");
		
		//50점은 상장으로 변경
		if(sp[index].score >= 50) {
			sp[index].상장 += sp[index].score / 50;
			sp[index].score = sp[index].score % 50;
			System.out.println("상장 " + sp[index].상장 + "장 수여, 잔여점수 : " + sp[index].getScore());
		}
		
	}
	
//	학생벌점메서드 minusStu()   --장성현
	public void minusStu(String id, int score) {
		int index = searchStuId(id);
		if(index < 0) {
			System.out.println("*****[" + id + "]는 없는 학생입니다.");
			return;
		}
		
		System.out.println("벌점 전 점수 : " + sp[index].getScore() + "점");
		sp[index].mPoint(score);
		System.out.println("벌점 후 점수 : " + sp[index].getScore() + "점");
		
		//-20점이면 경고1 추가
		if(sp[index].score <= -20) {
			sp[index].경고 += sp[index].score / -20;
			sp[index].score = sp[index].score % -20;
			System.out.println("경고 " + sp[index].경고 + "회, 잔여점수 : " + sp[index].getScore());
		}
		
		if(sp[index].경고 > 2) {
			if(sp[index].상장 > 0 ) {
				System.out.println("***** 경고3회 : 상장1 반납 처리");
				sp[index].상장--;
				sp[index].경고 = 0;
			} else {
				System.out.println("***** 경고3회 : 반납할 상장 없음: 퇴학");
				subStu(id);
			}
		}
		
	}
	
//	학생점수 출력매서드 printScore()  --백진호
	public void printScore(String id) {
		int index = searchStuId(id);
		if(index < 0) {
			System.out.println("*****[" + id + "]는 없는 학생입니다.");
			return;
		}
		
		System.out.println("[학생ID] : "  + sp[index].getId());
		System.out.println("[학생이름] : " + sp[index].getName());
		System.out.println("[학생점수] : " + sp[index].getScore());
		System.out.println("[상장] : " + sp[index].상장 + " / [경고] : " + sp[index].경고);
	}
	
//	전체학생점수 출력 매서드 printAllScore() --백진호
	public void printAllScore() {
		for(int i=0;i<stuCount;i++) {
			System.out.println("[학생ID] : "  + sp[i].getId());
			System.out.println("[학생이름] : " + sp[i].getName());
			System.out.println("[학생점수] : " + sp[i].getScore());
			System.out.println("[상장] : " + sp[i].상장 + " / [경고] : " + sp[i].경고);
			System.out.println("=====================");
		}
	}
	
	
//  학생점수 순위 출력 메서드 printRank()
	public void printRank() {
		int i, j;
		for(i=0; i<stuCount; i++) {
			sp[i].rank = 1;
			for(j=0; j<stuCount; j++) {
				int iscore = (sp[i].상장 * 50) + (sp[i].경고 * -20) + sp[i].score;
				int jscore = (sp[j].상장 * 50) + (sp[j].경고 * -20) + sp[j].score;
				if(jscore > iscore) {
					sp[i].rank++;
				} 
			}
		}
		
		System.out.println("-----------------");
		for(i=0; i<stuCount; i++) {
			System.out.println("[학생ID] : " + sp[i].id +"\n"+ 
							"[학생이름] : " + sp[i].name +"\n"+ 
							"[학생점수] : 상장 [" + sp[i].상장  + "] 경고 [" + sp[i].경고 + "] 점수 [" + sp[i].score +"]\n"+ 
							"[순위] : "+ sp[i].rank + "\n"+
							"-----------------");
		}
		
	}	
	

	
}
