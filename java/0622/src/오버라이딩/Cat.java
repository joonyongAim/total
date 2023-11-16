package 오버라이딩;

public class Cat extends Animal{
	String color;
	
	public Cat(String name, String color) {
		super(name);
		this.color = color;
		
	}
	
	public void showColor() {
		System.out.println("이름 : " + name);
		System.out.println("색상 : " + color);
	}
	
	public int getAge() {
		return age*6;
	}

}
