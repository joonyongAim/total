package 다형성;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i=0; i<15; i++) {
			int num = car.run();
			
			if(num == 1 || num == 2) {
				System.out.println(car.tires[num-1].location + "를 한국타이어로 교체");
				car.tires[num-1] = new HankookTire(20, car.tires[num-1].location);
			}
			if(num == 3 || num == 4) {
				System.out.println(car.tires[num-1].location + "를 넥센타이어로 교체");
				car.tires[num-1] = new NexenTire(17, car.tires[num-1].location);
			}
			
			System.out.println("-------------------------------");
		}

	}

}
