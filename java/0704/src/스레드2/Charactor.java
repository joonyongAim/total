package 스레드2;

public class Charactor extends User implements Msg {
	
	public Charactor(String userId, int hp) {
		this.userId = userId;
		this.hp = hp;
	}

	@Override
	public void attackMsg(int dam) {
		System.out.println(userId + "가 상대에게" + dam + "의 데미지를 입힘");
	}

	@Override
	public void userSkillMsg() {
		System.out.println(userId + "가 상대에게 30의 데미지를 입힘");
	}

	@Override
	public void hpMsg() {
		System.out.println("남은 체력 : " + hp);
	}

	@Override
	public void endMsg() {
		System.out.println(userId + " 승리");
	}
	
	

}
