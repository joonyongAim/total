package 아이패드;

public class IPadMain {

	public static void main(String[] args) throws Exception {
		
		while(true) {
			IPad pad = new IPad("IPad");
			
			if(!pad.continueOrder())
				break;
				
			pad.setScreen();
			pad.setColor();
			pad.setMemory();
			pad.setNetwork();
			pad.setName();
			pad.setSerialNum();
			pad.progress();
			pad.printOrder();
		}

	
	}


}
