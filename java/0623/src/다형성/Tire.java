package 다형성;

public class Tire {
	
	int maxRotation; // 최대 회전수(수명)
	int acRotation; // 누적 회전수
	String location; // 타이어 위치
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	// 바퀴 회전시키는 메서드
	public boolean roll() {
		acRotation++;
		
		if(acRotation < maxRotation) {
			System.out.println(location + "의 수명 : " + (maxRotation - acRotation) + "남음");
			return true; // 아직 더 돌수있음
		} else {
			System.out.println(location + " 타이어 터짐");
			return false; // 터짐
		}
		
		
	}

}
