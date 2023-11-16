package 상속;

public class TV {
	
	boolean power;
	int channel;
	
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
}
