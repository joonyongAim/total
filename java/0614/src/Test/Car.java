package Test;

public class Car {
	
	String brand;
	String model;
	int maxSpeed;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void printinfo() {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Max Speed : " + maxSpeed + " km/h");
	}

}
