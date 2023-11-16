package 오버라이딩;

public class Dog extends Animal{
	String breed;
	
	public Dog(String name,String breed) {
		super(name);
		this.breed = breed;
	}
	
	public void showBreed() {
		System.out.println("이름 : " + name);
		System.out.println("견종 : " + breed);
	}
	
	public int getAge() {
		return age*5;
	}

}
