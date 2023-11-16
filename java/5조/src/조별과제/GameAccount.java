package 조별과제;


public class GameAccount {

	String userId;
	String userPw;
	String name;
	int humanDay;
	int birthDate;
	boolean lockClear = false;	
		
	public GameAccount(String userId, String userPw, String name, int humanDay, int birthDate) {
		
		this.userId = userId;
		this.userPw = userPw;
		this.name = name;
		this.humanDay = humanDay;
		this.birthDate = birthDate;
		
	}
	
	public String setId() {
		return userId;
	}
	
	public String setPassword() {
		return userPw;
	}
	
	public String setnickName() {
		return name;
	}
	
	public int humanDay() {
		return humanDay;
	}
	
	public int birthDate() {
		return birthDate;
	}
	
	public void lockClear() {
		lockClear = true;
	}


	
	
}
