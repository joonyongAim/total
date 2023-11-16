package 다형성;

public class Car {
	
	Tire[] tires = {
			new Tire(6, "앞왼쪽"),
			new Tire(3, "앞오른쪽"),
			new Tire(8, "뒤왼쪽"),
			new Tire(10, "뒤오른쪽")
	};
	
	public void stop() {
		System.out.println("자동차 멈춤");
	}
	
	public int run() {
		System.out.println("자동차 주행 시작");
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return i+1; // 1~4가 리턴
			}
		}
		
		return 0;
		
	}

}







