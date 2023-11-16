package 오버라이딩;

public class GameMain {

	public static void main(String[] args) {
		Knight knight = new Knight(100, 10, 5);
		Mage mage = new Mage(50, 50, "화염");
		
		knight.showInfo();
		mage.showInfo();
		
		
		knight.attack();
		mage.attack();
		

	}

}
