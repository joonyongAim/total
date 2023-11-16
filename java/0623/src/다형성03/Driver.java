package 다형성03;

public class Driver {
	
	String name;
	
	public Driver(String name) {
		this.name = name;
	}
	
	public void drive(Vehicle vehicle) {
		System.out.println(name + "가 ");
		vehicle.run();
	}

}
