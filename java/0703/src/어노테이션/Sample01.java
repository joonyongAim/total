package 어노테이션;

class Acc {
	
	@Deprecated
	public void add() {
		System.out.println("더하기");
	}
	
	public void upgradeAdd() {
		System.out.println("더 좋은 더하기");
	}
}

public class Sample01 {

	public static void main(String[] args) {
		Acc a = new Acc();
		
		a.add();

	}

}
