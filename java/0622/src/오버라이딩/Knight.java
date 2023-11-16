package 오버라이딩;

public class Knight extends GameJob{
	
	int armor;
	
	public Knight(int hp, int mp, int armor) {
		super(hp,mp);
		this.armor = armor;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("나이트의 armor : " + armor);
	}
	
	public void attack() {
		System.out.println("나이트의 방패 후리기 공격");
	}

}
