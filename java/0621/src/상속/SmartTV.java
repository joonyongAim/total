package 상속;

public class SmartTV extends TV{
	
	boolean caption;	// 자막
	
	public void displayCaption(String text) {	// 자막출력 메서드
		if(caption) {
			System.out.println(text);
		}
	}

}
