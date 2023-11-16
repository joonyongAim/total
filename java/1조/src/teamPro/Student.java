package teamPro;

public class Student {

	String id;
	String name;
	int score;

	int rank;		//score 순위 저장(매번바뀔수있음)
	
	int 상장;	 //점수가  50점이 되면 상장1
	int 경고;	 //점수가 -20점이 되면 경고1(경고3이면 퇴학)
	
	//빈 객체 선언용
	public Student() {
		
	}
	
	public Student(Student s) {
		this.id = s.id;
		this.name = s.name;
		this.score = 0;
		
		this.상장 = 0;
		this.경고 = 0;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
		
	//상점 메서드
	public void bPoint(int score) {
		this.score = this.score + score;
	}

	//벌점 메서드
	public void mPoint(int score) {
		this.score = this.score - score;
	}
	
}
