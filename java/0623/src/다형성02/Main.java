package 다형성02;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		System.out.println("플레이어 공격");
		player.attack();
		
		System.out.println("기사로 전직했음");
		player = new Knight();
		
		System.out.println("플레이어 공격");
		player.attack();
		
		System.out.println("법사로 전직했음");
		player = new Mage();
		
		System.out.println("플레이어 공격");
		player.attack();

	}

}
