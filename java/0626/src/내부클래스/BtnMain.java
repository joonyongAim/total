package 내부클래스;

public class BtnMain {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setListener(new Call());
		btn.touch();
		
		btn.setListener(new Msg());
		btn.touch();

	}

}
