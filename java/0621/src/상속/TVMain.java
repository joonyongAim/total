package 상속;

public class TVMain {

	public static void main(String[] args) {
		
		SmartTV stv = new SmartTV();
		
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.displayCaption("hello");
		stv.caption = true;
		stv.displayCaption("hello");

	}

}
