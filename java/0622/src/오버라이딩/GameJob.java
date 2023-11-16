package 오버라이딩;

public class GameJob {
	int hp;
	int mp;
	
	
	public GameJob(int hp, int mp) {
		this.hp = hp;
		this.mp = mp;
	}
	
	public void showInfo() {
		System.out.println("hp : " + hp);
		System.out.println("mp : " + mp);
	}
	
	public void attack() {
		System.out.println("기본 공격 시도");
	}
	
	

}
