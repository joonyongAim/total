package 클래스;

public class Tv {

	String color;
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
	
	public void showInfo() {
		if(power) {
			System.out.println("전원 : 켜짐");
		} else {
			System.out.println("전원 : 꺼짐");
		}
		
		System.out.println("TV 색상 : " + color);
		System.out.println("현재 채널 : " + channel);
	}
	
	
	
}
