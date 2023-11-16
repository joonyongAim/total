package 오버라이딩;

public class Mage extends GameJob{
	String skill;
	
	public Mage(int hp, int mp, String skill) {
		super(hp,mp);
		this.skill = skill;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("마법사의 skill : " + skill);
	}
	
	public void attack() {
		System.out.println("마법사의 " + skill + " 스킬 공격");
	}

}
