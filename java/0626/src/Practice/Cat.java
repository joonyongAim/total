package Practice;

public class Cat extends Animal{
	
	String color;
	
	public Cat(String name , String color) {
		this.name = name;
		this.color = color;
	}
	
	@Override
	public void makeSound() {
		System.out.println("냐옹");
	}
	

}
